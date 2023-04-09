from cryptography.hazmat.primitives.ciphers.aead import AESGCM
import base64
import os


def aesGcmEncryption(plain_text, key):
    # Generate a random initialization vector (IV)
    iv_length = 12
    iv = os.urandom(iv_length)

    # Convert plain text and key to bytes using UTF-8 encoding
    plain_text_bytes = plain_text.encode("utf-8")
    key_bytes = key.encode("utf-8")

    # Create an AESGCM cipher instance with the provided key
    aesgcm = AESGCM(key_bytes)

    # Encrypt the plain text and get the cipher text and authentication tag
    cipher_text = aesgcm.encrypt(iv, plain_text_bytes, None)

    # Combine the IV and cipher text into a single array
    iv_and_cipher_text = iv + cipher_text

    # Encode the combined data as Base64
    base64_encoded = base64.b64encode(iv_and_cipher_text).decode("utf-8")

    # Return the encrypted data
    return base64_encoded


# ONLY FOR DEMO PURPOSE NEVER HARDCODE IN PRODUCTION
plain_text = "ENTER THE TEXT"
key = "YOUR SECRET KEY HERE"
encryptedText = aesGcmEncryption(plain_text, key)
print("Encrypted Text: " + encryptedText)  # 👈 YOUR ENCRYPTED VALUE HERE
