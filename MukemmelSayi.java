
import java.util.Scanner;

public class MukemmelSayi {

 public static void main(String[] args) {

  Scanner cr = new Scanner(System.in);
  int test;
  
  int sayi;
  System.out.println("Bir sayi giriniz : ");
  sayi = cr.nextInt();  
  if(mukemmelSayiBul(sayi)){
   System.out.println(sayi+" sayısı mükemmel sayıdır.");
  }else{
   System.out.println(sayi+" sayısı mükemmel sayı değildir.");
  }
   
  
 }
 
 public static boolean mukemmelSayiBul(int sayi) {
 
  int toplam = 0;
  for (int i = 1; i < sayi; i++) {
   if (sayi % i == 0) {
    toplam += i;
   }
  }
  if (toplam == sayi) {
   System.out.println(sayi+"sayi degeri");
   return true;
  } else {
   return false;
  }
 }

}

/*Katkı oranını hesaplama*/
