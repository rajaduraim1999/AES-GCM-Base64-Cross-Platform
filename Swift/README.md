# AES-GCM-Base64-Swift Encryption / Decryption

## Sample Encryption:

### Input:

```Swift
    println("AES GCM Base64 in Swift");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    let aesGcmEncryption = AesGcmEncryption()
    let plainText = "Welcome to Swift!"
    let key = "ThisIsASecretKey" // 👈 THIS KEY IS SAMPLE KEY
    if let encryptedText = aesGcmEncryption.encryptGcmBase64(plainText: plainText, key: key) {
    print("Encrypted Text: " + encryptedText)
```

### Output:

```
    AES GCM Base64 in Swift
    Encrypted Text: yYIX0Mi8NqVJ9CNczDcn0+04qMCMsckfZgBAzjTwdko/U8jdI14gJLGjtPkb
```

## Sample Decryption:

### Input:

```Swift
    println("AES GCM Base64 in Swift");
    /** 
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION 
     */ 
    let aesGcmDecryption = AesGcmDecryption() 
    let encryptedText = "yYIX0Mi8NqVJ9CNczDcn0+04qMCMsckfZgBAzjTwdko/U8jdI14gJLGjtPkb" 
    let key = "ThisIsASecretKey" // 👈 THIS KEY IS SAMPLE KEY
    if let decryptedText = aesGcmDecryption.decryptGcmBase64(cipherTextBase64: encrypted, key: key) { 
    print("Decrypted Text: " + decryptedText) // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in Swift
    Decrypted Text: Welcome to Swift!
```
