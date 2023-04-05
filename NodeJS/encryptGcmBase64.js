const crypto = require('crypto');

function encryptGcmBase64(plainText, key) {
  // Generate a random initialization vector (IV)
  const ivLength = 12;
  const iv = crypto.randomBytes(ivLength);

  // Create a secret key from the provided key
  const keySpec = Buffer.from(key);

  // Encrypt the data
  const cipher = crypto.createCipheriv('aes-128-gcm', keySpec, iv);
  let cipherText = cipher.update(plainText, 'utf8');
  cipherText = Buffer.concat([cipherText, cipher.final()]);

  // Combine the IV and cipher text into a single array
  const tag = cipher.getAuthTag();
  const ivAndCipherText = Buffer.concat([iv, cipherText, tag]);

  // Encode the combined data as Base64
  const base64Encoded = ivAndCipherText.toString('base64');

  // Return the encrypted data
  return base64Encoded;
}

// Example usage
const plainText = "Hello, world!";
const key = "ThisIsASecretKey";
const encrypted = encryptGcmBase64(plainText, key);
console.log(encrypted);
