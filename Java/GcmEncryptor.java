import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class GcmEncryptor {

    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 16;
    private static final String ENCRYPTION_ALGORITHM = "AES/GCM/NoPadding";

    public static String encryptGcmBase64(String plainText, String key) throws Exception {
        // Generate a random initialization vector (IV)
        byte[] iv = new byte[GCM_IV_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);

        // Create a secret key from the provided key
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");

        // Initialize the cipher with the key and IV
        Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
        GCMParameterSpec gcmSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmSpec);

        // Encrypt the data
        byte[] cipherText = cipher.doFinal(plainText.getBytes());

        // Combine the IV and cipher text into a single array
        byte[] ivAndCipherText = new byte[GCM_IV_LENGTH + cipherText.length];
        System.arraycopy(iv, 0, ivAndCipherText, 0, GCM_IV_LENGTH);
        System.arraycopy(cipherText, 0, ivAndCipherText, GCM_IV_LENGTH, cipherText.length);

        // Encode the IV and cipher text in Base64 format
        return Base64.getEncoder().encodeToString(ivAndCipherText);
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("AES GCM in Java");
        // ### security warning: never use hardcoded keys in source ###
        String plainText = "Welcome to Hello, world! Android";
        String key = "ThisIsASecretKey";
        String encrypted = GcmEncryptor.encryptGcmBase64(plainText, key);
        System.out.println(encrypted);
    }  
  
}
