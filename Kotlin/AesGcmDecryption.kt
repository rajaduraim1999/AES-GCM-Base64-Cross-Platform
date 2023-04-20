import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec

class AesGcmDecryption {

    private val GCM_IV_LENGTH = 12
    private val GCM_TAG_LENGTH = 16
    private val ENCRYPTION_ALGORITHM = "AES/GCM/NoPadding"

    fun decryptGcmBase64(encrypted: String, key: String): String {
        /** 
         * Decode the encrypted data from Base64 format 
         */
        val ivAndCipherText = Base64.getDecoder().decode(encrypted)

        /** 
         * Separate the IV and cipher text from the combined array 
         */
        val iv = ByteArray(GCM_IV_LENGTH)
        val cipherText = ByteArray(ivAndCipherText.size - GCM_IV_LENGTH)
        System.arraycopy(ivAndCipherText, 0, iv, 0, GCM_IV_LENGTH)
        System.arraycopy(ivAndCipherText, GCM_IV_LENGTH, cipherText, 0, cipherText.size)

        /** 
         * Create a secret key from the provided key 
         */
        val keySpec = SecretKeySpec(key.toByteArray(), "AES")

        /** 
         * Initialize the cipher with the key and IV 
         */
        val cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM)
        val gcmSpec = GCMParameterSpec(GCM_TAG_LENGTH * 8, iv)
        cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmSpec)

        /** 
         * Decrypt the data 
         */
        val plainText = cipher.doFinal(cipherText)

        /** 
         * Convert the decrypted data to a string and return it 
         */
        return String(plainText)
    }
}

fun main() {
    /** 
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION 
     */
    val encryptedText = "YOUR ENCRYPTED TEXT HERE"
    val key = "YOUR SECRET KEY HERE"
    val aesGcmEncryption = AesGcmDecryption()
    val decryptedText = aesGcmEncryption.decryptGcmBase64(encryptedText, key)
    println("Decrypted Text: $decryptedText") // 👈 YOUR ENCRYPTED VALUE HERE
}
