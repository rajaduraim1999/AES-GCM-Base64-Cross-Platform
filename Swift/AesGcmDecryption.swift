import CryptoKit
import Foundation
import CommonCrypto

class AesGcmDecryption {
    func decryptGcmBase64(cipherTextBase64: String, key: String) -> String? {

        guard let cipherData = Data(base64Encoded: cipherTextBase64) else { return nil }

        /**
         * Separate the IV and cipher text from the combined array
         */
        let ivLength = 12
        let iv = cipherData[..<ivLength]
        let ciphertext = cipherData[ivLength..<(cipherData.count - 16)]
        let tag = cipherData[(cipherData.count - 16)...]

        /**
         * Create a secret key from the provided key
         */
        guard let keyData = key.data(using: .utf8) else { return nil }
        let symmetricKey = SymmetricKey(data: keyData)

        let decryptedData: Data
        do {
            decryptedData = try AES.GCM.open(AES.GCM.SealedBox(nonce: AES.GCM.Nonce(data: iv), ciphertext: ciphertext, tag: tag), using: symmetricKey)
        } catch {
            return nil
        }

        /**
         * Convert the decrypted data to a string and return it
         */
        guard let decryptedString = String(data: decryptedData, encoding: .utf8) else { return nil }

        return decryptedString
    }
}

/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
let aesGcmDecryption = AesGcmDecryption()
let encryptedText = "YOUR ENCRYPTED TEXT HERE"
let key = "YOUR SECRET KEY HERE"
if let decryptedText = aesGcmDecryption.decryptGcmBase64(cipherTextBase64: encrypted, key: key) {
    print("Decrypted Text: " + decryptedText) // 👈 YOUR DECRYPTED VALUE HERE
}
