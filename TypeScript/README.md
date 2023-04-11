# AES-GCM-Base64-TypeScript Encryption / Decryption

## Sample Encryption:

### Input:

```TypeScript
    console.log("AES GCM Base64 in TypeScript");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    const plainText = "Welcome to TypeScript!";
    const key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    const encryptedText = aesGcmEncryption(plainText, key);
    console.log("Encrypted Text: " + encryptedText); // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in TypeScript
    Encrypted Text: U0ib22GZitsK80+bxYjwwWndHOVa++79Y4AmvIhBNsITXroMgNovnb2+FrgUhkU0G70=
```

## Sample Decryption:

### Input:

```TypeScript
    console.log("AES GCM Base64 in TypeScript");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    const encryptedText = "U0ib22GZitsK80+bxYjwwWndHOVa++79Y4AmvIhBNsITXroMgNovnb2+FrgUhkU0G70=";
    const key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    const decryptedText = aesGcmDecryption(encryptedText, key);
    console.log("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in TypeScript
    Decrypted Text: Welcome to TypeScript!
```
