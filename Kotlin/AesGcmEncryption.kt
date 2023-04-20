import java.security.SecureRandom
import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec

class AesGcmEncryption {
    
    private val GCM_IV_LENGTH = 12
    private val GCM_TAG_LENGTH = 16
    private val ENCRYPTION_ALGORITHM = "AES/GCM/NoPadding"
    
    fun encryptGcmBase64(plainText: String, key: String): String {
        /**
         * Generate a random initialization vector (IV)
         */
        val iv = ByteArray(GCM_IV_LENGTH)
        val random = SecureRandom()
        random.nextBytes(iv)

        /**
         * Create a secret key from the provided key
         */
        val keySpec = SecretKeySpec(key.toByteArray(), "AES")

        /**
         * Initialize the cipher with the key and IV
         */
        val cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM)
        val gcmSpec = GCMParameterSpec(GCM_TAG_LENGTH * 8, iv)
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmSpec)

        /**
         * Encrypt the data
         */
        val cipherText = cipher.doFinal(plainText.toByteArray())

        /**
         * Combine the IV and cipher text into a single array
         */
        val ivAndCipherText = ByteArray(GCM_IV_LENGTH + cipherText.size)
        System.arraycopy(iv, 0, ivAndCipherText, 0, GCM_IV_LENGTH)
        System.arraycopy(cipherText, 0, ivAndCipherText, GCM_IV_LENGTH, cipherText.size)

        /**
         * Encode the IV and cipher text in Base64 format
         */
        return Base64.getEncoder().encodeToString(ivAndCipherText)
    }
}

fun main() {
    /** 
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION 
     */
    val plainText = "ENTER THE TEXT"
    val key = "YOUR SECRET KEY HERE"
    val aesGcmEncryption = AesGcmEncryption()
    val encryptedText = aesGcmEncryption.encryptGcmBase64(plainText, key)
    println("Encrypted Text: $encryptedText") // 👈 YOUR ENCRYPTED VALUE HERE
}
