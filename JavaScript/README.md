# AES-GCM-Base64-JavaScript Encryption / Decryption

## Sample Encryption:

### Input:

```JavaScript
    console.log("AES GCM Base64 in JavaScript");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    const plainText = "Welcome to JavaScript!";
    const key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    const encryptedText = aesGcmEncryption(plainText, key);
    console.log("Encrypted Text: " + encryptedText); // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in JavaScript
    Encrypted Text: P29DRmXQQa1N5RgaqBfR87DGkiS32uOmq4yBiio0HCMezsAkPDJ2JYMTA25LLJd8N5g=
```

## Sample Decryption:

### Input:

```JavaScript
    console.log("AES GCM Base64 in JavaScript");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    const encryptedText = "P29DRmXQQa1N5RgaqBfR87DGkiS32uOmq4yBiio0HCMezsAkPDJ2JYMTA25LLJd8N5g=";
    const key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    const decryptedText = aesGcmDecryption(encryptedText, key);
    console.log("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in JavaScript
    Decrypted Text: Welcome to JavaScript!
```
