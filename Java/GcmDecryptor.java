import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class GcmDecryptor {

    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 16;
    private static final String ENCRYPTION_ALGORITHM = "AES/GCM/NoPadding";

    public static String decryptGcmBase64(String encrypted, String key) throws Exception {
        // Decode the encrypted data from Base64 format
        byte[] ivAndCipherText = Base64.getDecoder().decode(encrypted);

        // Separate the IV and cipher text from the combined array
        byte[] iv = new byte[GCM_IV_LENGTH];
        byte[] cipherText = new byte[ivAndCipherText.length - GCM_IV_LENGTH];
        System.arraycopy(ivAndCipherText, 0, iv, 0, GCM_IV_LENGTH);
        System.arraycopy(ivAndCipherText, GCM_IV_LENGTH, cipherText, 0, cipherText.length);

        // Create a secret key from the provided key
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");

        // Initialize the cipher with the key and IV
        Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
        GCMParameterSpec gcmSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmSpec);

        // Decrypt the data
        byte[] plainText = cipher.doFinal(cipherText);

        // Convert the decrypted data to a string and return it
        return new String(plainText);
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("AES GCM in Java");
        // ### security warning: never use hardcoded keys in source ###
      String encrypted = "DMZ7bCngtw96WBs8YuoVUQ6oYM1AIfUb7uJ/iaIelPW8PLnF1KqcwAMLNfQ7pND+u7Oujoc6WWm/eBOn";
      String key = "ThisIsASecretKey";
      String decrypted = GcmDecryptor.decryptGcmBase64(encrypted, key);
      System.out.println(decrypted);
  
    }
    
}
