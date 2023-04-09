const crypto = require("crypto");

function aesGcmDecryption(encrypted, key) {
  /**
   * Decode the encrypted data from Base64 format
   */
  const ivAndCipherText = Buffer.from(encrypted, "base64");

  /**
   * Separate the IV and cipher text from the combined array
   */
  const iv = ivAndCipherText.slice(0, 12);
  const cipherText = ivAndCipherText.slice(12);

  /**
   * Create a secret key from the provided key
   */
  const keySpec = Buffer.from(key, "utf8");

  /**
   * Initialize the cipher with the key and IV
   */
  const cipher = crypto.createDecipheriv("aes-128-gcm", keySpec, iv);
  cipher.setAuthTag(cipherText.slice(-16));
  const decrypted = cipher.update(cipherText.slice(0, -16)) + cipher.final();

  /**
   * Convert the decrypted data to a string and return it
   */
  return decrypted.toString("utf8");
}

/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
const encryptedText = "YOUR ENCRYPTED TEXT HERE";
const key = "YOUR SECRET KEY HERE";
const decryptedText = aesGcmDecryption(encryptedText, key);
console.log("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
