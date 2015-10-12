# Using the Python, have the function CaesarCipher(str,num) take the str parameter and perform a Caesar Cipher shift
# on it using the num parameter as the shifting number.
# A Caesar Cipher works by shifting each letter in the
# string N places down in the alphabet (in this case N will be num).
# Punctuation, spaces, and capitalization should remain intact.
# For example if the string is "Caesar Cipher" and num is 2 the output should be "Ecguct Ekrjgt".

# to read more about ceaser's cipher visit http://practicalcryptography.com/ciphers/caesar-cipher/ or google some more
# happy coding :-)

from enum import Enum

class EncryptionMode(Enum):
    ENCRYPT = 1
    DECRYPT = 2
        
def caesar_cipher(mode, message, key_size):
    if key_size >= 1 and key_size <= 26:
        return crypto(mode, message, key_size)
    else:
        raise ValueError("key size must be an integer from 1 to 26")

def crypto(mode, message, key_size):
    if mode == EncryptionMode.DECRYPT:
        key_size = -key_size

    modified_message = ""

    for char in message:
        if char.isalpha():
            num = ord(char)
            num += key_size

            if char.isupper():
                if num > ord("Z"):
                    num -= 26
                elif num < ord("A"):
                    num += 26
            else:
                if num > ord("z"):
                    num -= 26
                elif num < ord("a"):
                    num += 26

            modified_message += chr(num)
        else:
            modified_message += char

    return modified_message

print(caesar_cipher(EncryptionMode.ENCRYPT, "Hello", 23))