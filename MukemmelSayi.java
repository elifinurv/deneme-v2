/*Yeni commit için oluşturulan metin*/
import java.util.Scanner;

public class HarikaSayi {

 public static void main(String[] args) {

  Scanner cr = new Scanner(System.in);
  
string: sayi;
  System.out.println("Bir sayi giriniz : ");
  sayi = cr.nextInt();  
  if(mukemmelSayiBul(sayi)){
   System.out.println(sayi+" "+"mükemmel sayi.");
  }else{
   System.out.println(sayi+" "+"mükemmel sayı değildir.");
  }
   
  
 }
 
 public static boolean mukemmelSayiBul(int sayi) {
 
  int count = 0;
  for (int i = 1; i < sayi; i++) {
   if (sayi % i == 0) {
    count += i;
   }
  }
  if (count == sayi) {
   System.out.println(sayi);
   return true;
  } else {
   return false;
  }
 }

}

/*linear issue linkleme.*/
