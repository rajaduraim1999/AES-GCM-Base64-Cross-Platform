import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec
import java.security.SecureRandom
import java.util.Base64

private const val GCM_IV_LENGTH = 12
private const val GCM_TAG_LENGTH = 16
private const val ENCRYPTION_ALGORITHM = "AES/GCM/NoPadding"

fun encryptGcmBase64(plainText: String, key: String): String {
    // Generate a random initialization vector (IV)
    val iv = ByteArray(GCM_IV_LENGTH)
    val random = SecureRandom()
    random.nextBytes(iv)

    // Create a secret key from the provided key
    val keySpec = SecretKeySpec(key.toByteArray(), "AES")

    // Initialize the cipher with the key and IV
    val cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM)
    val gcmSpec = GCMParameterSpec(GCM_TAG_LENGTH * 8, iv)
    cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmSpec)

    // Encrypt the data
    val cipherText = cipher.doFinal(plainText.toByteArray())

    // Combine the IV and cipher text into a single array
    val ivAndCipherText = ByteArray(GCM_IV_LENGTH + cipherText.size)
    System.arraycopy(iv, 0, ivAndCipherText, 0, GCM_IV_LENGTH)
    System.arraycopy(cipherText, 0, ivAndCipherText, GCM_IV_LENGTH, cipherText.size)

    // Encode the IV and cipher text in Base64 format
    return Base64.getEncoder().encodeToString(ivAndCipherText)
}

fun decryptGcmBase64(encrypted: String, key: String): String {
    // Decode the encrypted data from Base64 format
    val ivAndCipherText = Base64.getDecoder().decode(encrypted)

    // Separate the IV and cipher text from the combined array
    val iv = ByteArray(GCM_IV_LENGTH)
    val cipherText = ByteArray(ivAndCipherText.size - GCM_IV_LENGTH)
    System.arraycopy(ivAndCipherText, 0, iv, 0, GCM_IV_LENGTH)
    System.arraycopy(ivAndCipherText, GCM_IV_LENGTH, cipherText, 0, cipherText.size)

    // Create a secret key from the provided key
    val keySpec = SecretKeySpec(key.toByteArray(), "AES")

    // Initialize the cipher with the key and IV
    val cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM)
    val gcmSpec = GCMParameterSpec(GCM_TAG_LENGTH * 8, iv)
    cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmSpec)

    // Decrypt the data
    val plainText = cipher.doFinal(cipherText)

    // Convert the decrypted data to a string and return it
    return String(plainText)
}

fun main(args: Array<String>) {
    println("AES GCM in Kotlin")
    // ### security warning: never use hardcoded keys in source ###
    val plainText = "Welcome to Hello, world! Android"
    val key = "ThisIsASecretKey"
    val encrypted = encryptGcmBase64(plainText, key)
    println(encrypted)

    val decrypted = decryptGcmBase64(encrypted, key)
    println(decrypted)
    
}
