# AES-GCM-Base64-Java Encryption / Decryption

## Sample Encryption:

### Input:

```Java
    System.out.println("AES GCM Base64 in Java");
    /**
    * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    */
    String plainText = "Welcome to Java!";
    String key = "ThisIsASecretKey";
    String encryptedText = AesGcmEncryption.encryptGcmBase64(plainText, key);
    System.out.println("Encrypted Text: " + encryptedText); // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in Java
Encrypted Text: Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=
```

## Sample Decryption:

### Input:

```Java
    System.out.println("AES GCM Base64 in Java");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    String encryptedText = "Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=";
    String key = "ThisIsASecretKey";
    String decryptedText = AesGcmDecryption.decryptGcmBase64(encryptedText, key);
    System.out.println("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in Java
Decrypted Text: Welcome to Java!
```
