const crypto = require("crypto");

function aesGcmEncryption(plainText, key) {
  /**
   * Generate a random initialization vector (IV)
   */
  const ivLength = 12;
  const iv = crypto.randomBytes(ivLength);

  /**
   * Create a secret key from the provided key
   */
  const keySpec = Buffer.from(key);

  const cipher = crypto.createCipheriv("aes-128-gcm", keySpec, iv);
  let cipherText = cipher.update(plainText, "utf8");
  cipherText = Buffer.concat([cipherText, cipher.final()]);

  /**
   * Combine the IV and cipher text into a single array
   */
  const tag = cipher.getAuthTag();
  const ivAndCipherText = Buffer.concat([iv, cipherText, tag]);

  /**
   * Encode the combined data as Base64
   */
  const base64Encoded = ivAndCipherText.toString("base64");

  return base64Encoded;
}

/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
const plainText = "ENTER THE TEXT";
const key = "YOUR SECRET KEY HERE";
const encryptedText = aesGcmEncryption(plainText, key);
console.log("Encrypted Text: " + encryptedText); // 👈 YOUR ENCRYPTED VALUE HERE
