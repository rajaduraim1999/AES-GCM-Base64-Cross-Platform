using System;
using System.Text;
using System.Security.Cryptography;

class AesGcmDecryption {
  static void Main() {
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    string encryptedTextBase64 = "YOUR ENCRYPTED TEXT HERE";
    string key = "YOUR SECRET KEY HERE";

    byte[] cipherText = Convert.FromBase64String(encryptedTextBase64);
    byte[] keyBytes = Encoding.UTF8.GetBytes(key);

    byte[] iv = new byte[12]; // IV (nonce) size for AES-GCM is 12 bytes (96 bits)
    Array.Copy(cipherText, 0, iv, 0, iv.Length);

    byte[] tag = new byte[16]; // Tag size for AES-GCM is 16 bytes (128 bits)
    Array.Copy(cipherText, cipherText.Length - tag.Length, tag, 0, tag.Length);

    byte[] cipherTextWithoutIVAndTag = new byte[cipherText.Length - iv.Length - tag.Length];
    Array.Copy(cipherText, iv.Length, cipherTextWithoutIVAndTag, 0, cipherTextWithoutIVAndTag.Length);

    byte[] plaintext = new byte[cipherTextWithoutIVAndTag.Length];

    using(AesGcm aesGcm = new AesGcm(keyBytes)) {
      aesGcm.Decrypt(
        nonce: iv,
        ciphertext: cipherTextWithoutIVAndTag,
        tag: tag,
        plaintext: plaintext
      );
    }

    string decryptedText = Encoding.UTF8.GetString(plaintext);
    Console.WriteLine("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
  }
}