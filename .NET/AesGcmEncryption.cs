using System;
using System.Text;
using System.Security.Cryptography;

class AesGcmEncryption {
  static void Main() {
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    string plainText = "ENTER THE TEXT";
    string key = "YOUR SECRET KEY HERE";

    byte[] plainTextBytes = Encoding.UTF8.GetBytes(plainText);
    byte[] keyBytes = Encoding.UTF8.GetBytes(key);

    byte[] iv = new byte[12]; // IV (nonce) size for AES-GCM is 12 bytes (96 bits)
    using(RandomNumberGenerator rng = RandomNumberGenerator.Create()) {
      rng.GetBytes(iv);
    }

    byte[] cipherText;
    byte[] tag;

    using(AesGcm aesGcm = new AesGcm(keyBytes)) {
      cipherText = new byte[plainTextBytes.Length];
      tag = new byte[16]; // Tag size for AES-GCM is 16 bytes (128 bits)

      aesGcm.Encrypt(
        nonce: iv,
        plaintext: plainTextBytes,
        ciphertext: cipherText,
        tag: tag
      );
    }

    byte[] ivAndCipherTextAndTag = new byte[iv.Length + cipherText.Length + tag.Length];
    Array.Copy(iv, 0, ivAndCipherTextAndTag, 0, iv.Length);
    Array.Copy(cipherText, 0, ivAndCipherTextAndTag, iv.Length, cipherText.Length);
    Array.Copy(tag, 0, ivAndCipherTextAndTag, iv.Length + cipherText.Length, tag.Length);

    string base64Encoded = Convert.ToBase64String(ivAndCipherTextAndTag);
    Console.WriteLine("Encrypted Text: " + base64Encoded); // 👈 YOUR ENCRYPTED VALUE HERE
  }
}