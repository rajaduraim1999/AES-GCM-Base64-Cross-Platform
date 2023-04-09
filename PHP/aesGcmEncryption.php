<?php
function aesGcmEncryption($plainText, $key) {
    /**
     * Generate a random initialization vector (IV)
     */
    $ivLength = openssl_cipher_iv_length('aes-128-gcm');
    $iv = openssl_random_pseudo_bytes($ivLength);
    /**
     * Create a secret key from the provided key
     */
    $keySpec = $key;
    $cipherText = openssl_encrypt($plainText, 'aes-128-gcm', $keySpec, OPENSSL_RAW_DATA, $iv, $tag);
    /**
     * Combine the IV and cipher text into a single array
     */
    $ivAndCipherText = $iv . $cipherText . $tag;
    $base64Encoded = base64_encode($ivAndCipherText);
    /**
     * Return the encrypted data
     */
    return $base64Encoded;
}
/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
$plainText = "ENTER THE TEXT";
$key = "YOUR SECRET KEY HERE";
$encryptedText = aesGcmEncryption($plainText, $key);
echo "Encrypted Text: $encryptedText"; // 👈 YOUR ENCRYPTED VALUE HERE

?>
