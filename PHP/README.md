# AES-GCM-Base64-PHP Encryption / Decryption

## Sample Encryption:

### Input:

```PHP
echo "AES GCM Base64 in PHP";
/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
$plainText = "Welcome to PHP!";
$key = "ThisIsASecretKey";
$encryptedText = aesGcmEncryption($plainText, $key);
echo "Encrypted Text: $encryptedText"; // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in PHP
Encrypted Text: Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=
```

## Sample Decryption:

### Input:

```PHP
echo "AES GCM Base64 in PHP";
/**
 * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
 */
$encryptedText = "Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=";
$key = "ThisIsASecretKey";
$decryptedText = aesGcmDecryption($encryptedText, $key);
echo "Decrypted Text: $decryptedText"; // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
Decrypted Text: AES GCM Base64 in PHP
Welcome to PHP!
```