import java.util.Scanner;

   public class Main {
      public static void main(String[] args) {
      int a, b, c;
      //Kullanıcı veri girişleri
      Scanner input = new Scanner(System.in);
          System.out.println("A sayısını giriniz : ");
          a = input.nextInt();
          System.out.println("B sayısını giriniz : ");
          b = input.nextInt();
          System.out.println("C sayısını giriniz : ");
          c = input.nextInt();

      // Büyükten küçüğe sıralamak için gerekli şartlar
          if ((a > b) && (a > c)) {
              if(b > c){
                  System.out.println("A > B > C");
              }else {
                  System.out.println("A > C > B");
              }
          } else if ((b > a) && (b > c)) {
              if (a > c) {
                  System.out.println("B > A > C");
              }else {
                  System.out.println("B > C > A");
              }
          } else if ((c > a) && (c > b)) {
              if (a > b){
                  System.out.println("C > A > B");
              }else {
                  System.out.println("C > B > A");
              }
          }
      }
}