# AES-GCM-Base64-Java Encryption / Decryption

## Sample Encryption:

### Input:

```Java
    System.out.println("AES GCM Base64 in Java");
    /**
    * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    */
    String plainText = "Welcome to Java!";
    String key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    String encryptedText = AesGcmEncryption.encryptGcmBase64(plainText, key);
    System.out.println("Encrypted Text: " + encryptedText); // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in Java
    Encrypted Text: mLnCRyLmQ1oxjfMoHdFYd8UVgD8o9VacdbVMkz4FdU6mRFkjRJR9ku78pNA=
```

## Sample Decryption:

### Input:

```Java
    System.out.println("AES GCM Base64 in Java");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    String encryptedText = "mLnCRyLmQ1oxjfMoHdFYd8UVgD8o9VacdbVMkz4FdU6mRFkjRJR9ku78pNA=";
    String key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    String decryptedText = AesGcmDecryption.decryptGcmBase64(encryptedText, key);
    System.out.println("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in Java
    Decrypted Text: Welcome to Java!
```
