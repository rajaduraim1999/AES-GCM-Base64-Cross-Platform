# AES-GCM-Base64-Kotlin Encryption / Decryption

## Sample Encryption:

### Input:

```Kotlin
    println("AES GCM Base64 in Kotlin")
    /**
    * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    */
    val plainText = "Welcome to Kotlin!"
    val key = "ThisIsASecretKey" // 👈 THIS KEY IS SAMPLE KEY
    val aesGcmEncryption = AesGcmEncryption()
    val encryptedText = aesGcmEncryption.encryptGcmBase64(plainText, key)
    println("Encrypted Text: $encryptedText")
```

### Output:

```
    AES GCM Base64 in Kotlin
    Encrypted Text: tZ7ueq+LUztONkAspyDD88DGRpPqY1CGh33MWpbaokvvOpRpE/Q7x4xOC2V7Ag==
```

## Sample Decryption:

### Input:

```Kotlin
    println("AES GCM Base64 in Kotlin")
    /**
    * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    */
    val key = "ThisIsASecretKey" // 👈 THIS KEY IS SAMPLE KEY
    val encryptedText = "tZ7ueq+LUztONkAspyDD88DGRpPqY1CGh33MWpbaokvvOpRpE/Q7x4xOC2V7Ag=="
    val aesGcmEncryption = AesGcmDecryption()
    val decryptedText = aesGcmEncryption.decryptGcmBase64(encryptedText, key)
    println("Decrypted Text: $decryptedText")
```

### Output:

```
    AES GCM Base64 in Kotlin
    Decrypted Text: Welcome to Kotlin!
```
