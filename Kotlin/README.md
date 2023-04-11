# AES-GCM-Base64-Kotlin Encryption / Decryption

## Sample Encryption:

### Input:

```Kotlin
    println("AES GCM Base64 in Kotlin")
    /**
    * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    */
    val plainText = "Welcome to Kotlin!"
    val key = "ThisIsASecretKey"
    val encrypted = encryptGcmBase64(plainText, key)
    println(encrypted)
```

### Output:

```
    AES GCM Base64 in Kotlin
    tZ7ueq+LUztONkAspyDD88DGRpPqY1CGh33MWpbaokvvOpRpE/Q7x4xOC2V7Ag==
```

## Sample Decryption:

### Input:

```Kotlin
    println("AES GCM Base64 in Kotlin")
    /**
    * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    */
    val key = "ThisIsASecretKey"
    val encrypted = "tZ7ueq+LUztONkAspyDD88DGRpPqY1CGh33MWpbaokvvOpRpE/Q7x4xOC2V7Ag=="

    val decrypted = decryptGcmBase64(encrypted, key)
    println(decrypted)
```

### Output:

```
    AES GCM Base64 in Kotlin
    Welcome to Kotlin!
```
