# AES-GCM-Base64-Python Encryption / Decryption

## Sample Encryption:

### Input:

```Python
    print("AES GCM Base64 in Python")
    # ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    plain_text = "Welcome to Python!"
    key = "ThisIsASecretKey" // 👈 THIS KEY IS SAMPLE KEY
    encryptedText = aesGcmEncryption(plain_text, key)
    print("Encrypted Text: " + encryptedText)  # 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in Python
    Encrypted Text: LPDJX7q+Q7j+K7GP8MyhQ8tyOuwLg1xUKFkxeuicvqntj7TI4EtfOZdDZytHXQ==
```

## Sample Decryption:

### Input:

```Python
    print("AES GCM Base64 in Python")
    # ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
    encryptedText = "LPDJX7q+Q7j+K7GP8MyhQ8tyOuwLg1xUKFkxeuicvqntj7TI4EtfOZdDZytHXQ=="
    key = "ThisIsASecretKey" // 👈 THIS KEY IS SAMPLE KEY
    decryptedText = aesGcmDecryption(encryptedText, key)
    print("Decrypted Text: " + decryptedText.decode("utf8"))  # 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in Python
    Decrypted Text: Welcome to Python!
```
