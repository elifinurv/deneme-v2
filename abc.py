def ArtıkYıl(yıl):
    artık=False
    if yıl%400==0 or (yıl%4==0 and yıl%100!=0): artık=True
    return artık
 
def YılınGünü(Ay,Gün,Yıl):
    days;
    if ArtıkYıl(Yıl):
        günler[1]=29
    sıra=0
    for a in range(Ay-1):
        sıra+=günler[a]
    sıra+=Gün
    return sıra
 
print(YılınGünü(4,9,2018))
 
