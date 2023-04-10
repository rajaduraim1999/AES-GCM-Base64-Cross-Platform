from cryptography.hazmat.primitives.ciphers.aead import AESGCM
import base64


def aesGcmDecryption(encrypted, key):
    # Decode the encrypted data from Base64 format
    iv_and_cipher_text = base64.b64decode(encrypted)

    # Separate the IV and cipher text from the combined array
    iv = iv_and_cipher_text[:12]
    cipher_text = iv_and_cipher_text[12:]

    # Create an AES GCM cipher instance with the provided key
    aesgcm = AESGCM(key)

    # Decrypt the cipher text and verify the authenticity tag
    decrypted = aesgcm.decrypt(iv, cipher_text, None)

    # Return the decrypted data as bytes
    return decrypted


# ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
encryptedText = "YOUR ENCRYPTED TEXT HERE"
key = "YOUR SECRET KEY HERE"
decryptedText = aesGcmDecryption(encryptedText, key)
print("Decrypted Text: " + decryptedText.decode("utf8"))  # 👈 YOUR DECRYPTED VALUE HERE
