# AES-GCM-Base64-.NET C# Encryption / Decryption

## Sample Encryption:

### Input:

```c#
    Console.WriteLine("AES GCM Base64 in .NET C#");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    string plainText = "Welcome to .NET C#!";
    string key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    string base64Encoded = Convert.ToBase64String(ivAndCipherTextAndTag);
    Console.WriteLine("Encrypted Text: " + base64Encoded); // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in .NET C#
    Encrypted Text: wtt/chB9+A1TMohI6QNvnz6jXPx/lPR3Qe3Z3O3b5Tjp336rsTdAnLkNIJUBHg==
```

## Sample Decryption:

### Input:

```c#
    Console.WriteLine("AES GCM Base64 in .NET C#");
     /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    string encryptedTextBase64 = "wtt/chB9+A1TMohI6QNvnz6jXPx/lPR3Qe3Z3O3b5Tjp336rsTdAnLkNIJUBHg==";
    string key = "ThisIsASecretKey"; // 👈 THIS KEY IS SAMPLE KEY
    string decryptedText = Encoding.UTF8.GetString(plaintext);
    Console.WriteLine("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
    AES GCM Base64 in .NET C#
    Decrypted Text: Welcome to .NET C#!
```
