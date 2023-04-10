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
Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=
```

## Sample Decryption:

### Input:

```Kotlin
    println("AES GCM Base64 in Kotlin")
    /**
    * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    */
    val key = "ThisIsASecretKey"
    val encrypted = "Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M="

    val decrypted = decryptGcmBase64(encrypted, key)
    println(decrypted)
```

### Output:

```
AES GCM Base64 in Kotlin
Welcome to Kotlin!
```
