# AES-GCM-Base64-PHP Encryption / Decryption

## Sample Encryption:

### Input:

```PHP
    echo "AES GCM Base64 in PHP";
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    $plainText = "Welcome to PHP!";
    $key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    $encryptedText = aesGcmEncryption($plainText, $key);
    echo "Encrypted Text: $encryptedText"; // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in PHP
    Encrypted Text: h7xfroS75l4Yylb8unT4yvUBwYNMrr4Ic+P/Jjlzj/d88ploNeC9TlSj2A==
```

## Sample Decryption:

### Input:

```PHP
    echo "AES GCM Base64 in PHP";
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    $encryptedText = "h7xfroS75l4Yylb8unT4yvUBwYNMrr4Ic+P/Jjlzj/d88ploNeC9TlSj2A==";
    $key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    $decryptedText = aesGcmDecryption($encryptedText, $key);
    echo "Decrypted Text: $decryptedText"; // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
    Decrypted Text: AES GCM Base64 in PHP
    Welcome to PHP!
```
