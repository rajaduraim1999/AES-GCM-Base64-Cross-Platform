# AES-GCM-Base64-Python Encryption / Decryption

## Sample Encryption:

### Input:

```Python
print("AES GCM Base64 in Python")
# ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
plain_text = "Welcome to Python!"
key = "ThisIsASecretKey"
encryptedText = aesGcmEncryption(plain_text, key)
print("Encrypted Text: " + encryptedText)  # 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in Python
Encrypted Text: Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=
```

## Sample Decryption:

### Input:

```Python
print("AES GCM Base64 in Python")
# ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
encryptedText = "Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M="
key = "ThisIsASecretKey"
decryptedText = aesGcmDecryption(encryptedText, key)
print("Decrypted Text: " + decryptedText.decode("utf8"))  # 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in Python
Decrypted Text: Welcome to Python!
```