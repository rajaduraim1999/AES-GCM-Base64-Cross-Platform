<?php
function aesGcmDecryption($encryptedText, $key) {
    /**
     * Decode the encrypted data from Base64 format
     */
    $ivAndCipherText = base64_decode($encryptedText);
    /**
     * Separate the IV and cipher text from the combined array
     */
    $iv = substr($ivAndCipherText, 0, 12);
    $cipherText = substr($ivAndCipherText, 12);
    /**
     * Create a secret key from the provided key
     */
    $keySpec = $key;
    /**
     * Initialize the cipher with the key and IV
     */
    $cipher = openssl_cipher_iv_length('aes-128-gcm');
    $tagLength = 16;
    $tag = substr($cipherText, -$tagLength);
    $cipherText = substr($cipherText, 0, -$tagLength);
    $plainText = openssl_decrypt($cipherText, 'aes-128-gcm', $keySpec, OPENSSL_RAW_DATA, $iv, $tag);
    /**
     * Convert the decrypted data to a string and return it
     */
    return $plainText;
}
/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
$encryptedText = "YOUR ENCRYPTED TEXT HERE";
$key = "YOUR SECRET KEY HERE";
$decryptedText = aesGcmDecryption($encryptedText, $key);
echo "Decrypted Text: $decryptedText"; // 👈 YOUR DECRYPTED VALUE HERE

?>
