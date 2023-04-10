# AES-GCM-Base64-.NET C# Encryption / Decryption

## Sample Encryption:

### Input:

```c#
    Console.WriteLine("AES GCM Base64 in .NET C#");
    /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    string plainText = "Welcome to .NET C#!";
    string key = "ThisIsASecretKey";
    string base64Encoded = Convert.ToBase64String(ivAndCipherTextAndTag);
    Console.WriteLine("Encrypted Text: " + base64Encoded); // 👈 YOUR ENCRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in .NET C#
Encrypted Text: Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=
```

## Sample Decryption:

### Input:

```c#
    Console.WriteLine("AES GCM Base64 in .NET C#");
     /**
     * ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
     */
    string encryptedTextBase64 = "Tz4RQap2udCIKZV9F5ke9ziuQzRFiU89LscKAl8+aNCJudM2LtVjZdggj0M=";
    string key = "ThisIsASecretKey";
    string decryptedText = Encoding.UTF8.GetString(plaintext);
    Console.WriteLine("Decrypted Text: " + decryptedText); // 👈 YOUR DECRYPTED VALUE HERE
```

### Output:

```
AES GCM Base64 in .NET C#
Decrypted Text: Welcome to .NET C#!
```
