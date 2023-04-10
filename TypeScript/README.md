# AES-GCM-Base64-TypeScript Encryption / Decryption

## Sample Encryption:

### Input:

```TypeScript
console.log("AES GCM Base64 in TypeScript");
/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
const plainText = "Welcome to TypeScript!";
const key = "ThisIsASecretKey";
const encryptedText = aesGcmEncryption(plainText, key);
console.log("Encrypted Text: " + encryptedText); // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in TypeScript
Encrypted Text: Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=
```

## Sample Decryption:

### Input:

```TypeScript
console.log("AES GCM Base64 in TypeScript");
/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
const encryptedText = "Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=";
const key = "ThisIsASecretKey";
const decryptedText = aesGcmDecryption(encryptedText, key);
console.log("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in TypeScript
Decrypted Text: Welcome to TypeScript!
```