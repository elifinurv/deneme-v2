import random

print("Basit Tahmin Oyununa Hoş Geldiniz!")

sayı = random.randint(1, 100)
tahmin_hakkı = 5

while True:
    tahmin = int(input("Tahmininizi girin: "))
    if tahmin == sayı:
        print("Tebrikler! Doğru tahmin ettiniz.")
        break
    elif tahmin < sayı:
        print("Daha büyük bir sayı girin.")
    else:
        print("Daha küçük bir sayı girin.")
    
    tahmin_hakkı -= 1
    
    if tahmin_hakkı == 0:
        print("Tahmin hakkınız bitti! Doğru cevap", sayı, "idi.")
        break
