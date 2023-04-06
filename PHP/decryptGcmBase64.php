<?php

function decryptGcmBase64($encrypted, $key) {
    // Decode the encrypted data from Base64 format
    $ivAndCipherText = base64_decode($encrypted);

    // Separate the IV and cipher text from the combined array
    $iv = substr($ivAndCipherText, 0, 12);
    $cipherText = substr($ivAndCipherText, 12);

    // Create a secret key from the provided key
    $keySpec = $key;

    // Initialize the cipher with the key and IV
    $cipher = openssl_cipher_iv_length('aes-128-gcm');
    $tagLength = 16;
    $tag = substr($cipherText, -$tagLength);
    $cipherText = substr($cipherText, 0, -$tagLength);

    // Decrypt the data
    $plainText = openssl_decrypt($cipherText, 'aes-128-gcm', $keySpec, OPENSSL_RAW_DATA, $iv, $tag);

    // Convert the decrypted data to a string and return it
    return $plainText;
}

// Example usage
$encrypted = "DMZ7bCngtw96WBs8YuoVUQ6oYM1AIfUb7uJ/iaIelPW8PLnF1KqcwAMLNfQ7pND+u7Oujoc6WWm/eBOn";
$key = "ThisIsASecretKey";
$decrypted = decryptGcmBase64($encrypted, $key);
echo $decrypted;

?>
