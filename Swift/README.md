# AES-GCM-Base64-Java Encryption / Decryption

## Sample Encryption:

### Input:

```Swift
    println("AES GCM Base64 in Swift");
    /** 
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION 
     */ 
    let aesGcmDecryption = AesGcmDecryption() 
    let encryptedText = "YOUR ENCRYPTED TEXT HERE" 
    let key = "YOUR SECRET KEY HERE" // 👈 THIS KEY IS SAMPLE KEY
    if let decryptedText = aesGcmDecryption.decryptGcmBase64(cipherTextBase64: encrypted, key: key) { 
    print("Decrypted Text: " + decryptedText) // 👈 YOUR DECRYPTED VALUE HERE
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
