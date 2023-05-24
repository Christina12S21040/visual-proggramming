def palindrome(text):
    lengthText = len(text)
    lengthText = lengthText - 1
    n = 0
    if text[lengthText] == text[0]:
        hasil = palindrome2(text, n)
    else:
        hasil = "BUKAN"
    
    return hasil

def palindrome2(text, n):
    lengthText = len(text)
    lengthText = lengthText - 1
    hasilAkhir = ""
    if text[lengthText] == text[0]:
        if lengthText - n == n:
            hasilAkhir = "YA"
        else:
            if lengthText - n == n + 1:
                hasilAkhir = "YA"
            else:
                n = n + 1
                hasilAkhir = palindrome2(text, n)
    else:
        hasilAkhir = "BUKAN"
    
    return hasilAkhir

# Main
text = input()
print(palindrome(text))
