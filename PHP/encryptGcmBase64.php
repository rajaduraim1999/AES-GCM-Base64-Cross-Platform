<?php

function encryptGcmBase64($plainText, $key) {
    // Generate a random initialization vector (IV)
    $ivLength = openssl_cipher_iv_length('aes-128-gcm');
    $iv = openssl_random_pseudo_bytes($ivLength);

    // Create a secret key from the provided key
    $keySpec = $key;

    // Encrypt the data
    $cipherText = openssl_encrypt($plainText, 'aes-128-gcm', $keySpec, OPENSSL_RAW_DATA, $iv, $tag);

    // Combine the IV and cipher text into a single array
    $ivAndCipherText = $iv . $cipherText . $tag;

    // Encode the combined data as Base64
    $base64Encoded = base64_encode($ivAndCipherText);

    // Return the encrypted data
    return $base64Encoded;
}

// Example usage
$plainText = "Welcome to Hello, world!";
$key = "ThisIsASecretKey";
$encrypted = encryptGcmBase64($plainText, $key);
echo $encrypted;


?>
