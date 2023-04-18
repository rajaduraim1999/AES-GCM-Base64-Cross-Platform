import CryptoKit
import Foundation
import CommonCrypto

class AesGcmEncryption {
    func randomBytes(count: Int) -> Data {
        var data = Data(count: count)
        _ = data.withUnsafeMutableBytes { mutableBytes in
            SecRandomCopyBytes(kSecRandomDefault, count, mutableBytes.baseAddress!)
        }
        return data
    }

    func encryptGcmBase64(plainText: String, key: String) -> String? {
        /**
         * Generate a random initialization vector (IV)
         */
        let ivLength = 12
        let iv = randomBytes(count: ivLength)

        /**
         * Create a secret key from the provided key
         */
        guard let keyData = key.data(using: .utf8) else { return nil }
        let symmetricKey = SymmetricKey(data: keyData)

        let sealedBox: AES.GCM.SealedBox
        do {
            sealedBox = try AES.GCM.seal(plainText.data(using: .utf8)!, using: symmetricKey, nonce: AES.GCM.Nonce(data: iv))
        } catch {
            return nil
        }

        /**
         * Combine the IV and cipher text into a single array
         */
        let tag = sealedBox.tag
        let ivAndCipherText = iv + sealedBox.ciphertext + tag

        /**
         * Encode the IV and cipher text in Base64 format
         */
        let base64Encoded = ivAndCipherText.base64EncodedString()

        return base64Encoded
    }
}

/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
let aesGcmEncryption = AesGcmEncryption()
let plainText = "ENTER THE TEXT"
let key = "YOUR SECRET KEY HERE"
if let encryptedText = aesGcmEncryption.encryptGcmBase64(plainText: plainText, key: key) {
   print("Encrypted Text: " + encryptedText)
}