# AES-GCM-Base64-Cross-Platform Encryption / Decryption

This project contains the implementation of (Kotlin, Java, NodeJS, Javascript, PHP)

## Platforms supported 

1. Kotlin
2. Java
3. NodeJS
4. JavaScript
5. PHP
6. Swift
7. Python
8. C#

### Languages and Tools  

[![Kotlin Badge](https://img.shields.io/badge/Kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Java Badge](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![JavaScript Badge](https://img.shields.io/badge/JavaScript-%23F7DF1E.svg?style=for-the-badge&logo=javascript&logoColor=black)](https://www.javascript.com/)
[![Node.js Badge](https://img.shields.io/badge/Node.js-%2343853D.svg?style=for-the-badge&logo=node-dot-js&logoColor=white)](https://nodejs.org/)
[![PHP Badge](https://img.shields.io/badge/PHP-%23777BB4.svg?style=for-the-badge&logo=php&logoColor=white)](https://www.php.net/)
[![Swift Badge](https://img.shields.io/badge/Swift-%23FA7343.svg?style=for-the-badge&logo=swift&logoColor=white)](https://swift.org/)
[![Python Badge](https://img.shields.io/badge/Python-%233776AB.svg?style=for-the-badge&logo=python&logoColor=white)](https://www.python.org/)
[![C# Badge](https://img.shields.io/badge/C%23-%23239120.svg?style=for-the-badge&logo=c-sharp&logoColor=white)](https://docs.microsoft.com/en-us/dotnet/csharp/)

# Why AES?

### There are several reasons why AES (Advanced Encryption Standard) is considered a strong encryption algorithm. Here are four of them:

* **Security** : AES is a symmetric-key encryption algorithm that uses a block cipher to encrypt data. It has been extensively studied and analyzed by the cryptographic community, and no practical attacks have been found that could compromise the security of the algorithm. This means that AES is a secure choice for protecting sensitive data.

* **Speed** : AES is a fast encryption algorithm that can encrypt and decrypt large amounts of data quickly. This makes it suitable for use in applications where performance is important, such as network security protocols, disk encryption, and secure communication channels.

* **Flexibility** : AES is a versatile encryption algorithm that can be used in various modes of operation, depending on the specific requirements of the application. For example, it can be used in Electronic Codebook (ECB) mode for simple encryption, or in Cipher Block Chaining (CBC) mode for more secure encryption.

* **Standardization** : AES is a widely accepted encryption standard that has been adopted by many organizations and industries. This means that it is supported by many software and hardware platforms, and can be used in a variety of applications with confidence in its security and interoperability.

# How to Use
To encrypt a message using this tool, simply enter the plaintext message, a secret encryption key, and an initialization vector (IV) into the input fields. Then click the "Encrypt" button to generate the encrypted ciphertext.

To decrypt a message using this tool, enter the encrypted ciphertext, the secret encryption key, and the initialization vector (IV) into the input fields. Then click the "Decrypt" button to generate the plaintext message.

Note: Make sure to keep the secret encryption key and initialization vector (IV) confidential and secure, as they are required to decrypt the encrypted message.

# Compatibility
This tool is designed to work on all major operating systems, including Windows, macOS, and Linux.

# Security
This tool uses the AES-GCM encryption algorithm, which is considered to be a secure and robust encryption algorithm. However, it is important to note that no encryption algorithm is completely foolproof, and it is always possible for a determined attacker to decrypt the data given enough time and resources.

Therefore, it is important to use strong and complex encryption keys, and to keep the encryption keys and initialization vectors (IVs) confidential and secure. It is also recommended to use additional security measures, such as two-factor authentication, to further enhance the security of the encrypted data.

# License
This tool is released under the MIT License, which allows for free and open-source use, modification, and distribution of the software. See the LICENSE file for more information.

# Acknowledgements
This tool is based on the AES-GCM encryption algorithm, which is developed by the National Institute of Standards and Technology (NIST). The Base64 encoding scheme is a widely-used data encoding scheme that is defined in the RFC 4648 specification.
