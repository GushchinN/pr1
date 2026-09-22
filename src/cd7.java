import java.util.Scanner;
public class cd7 {
    static int factorial(int n){
        int x = 1;
        for(int i = 1; i < n+1; i++){
            x=x*i;
        }
        return x;
    }
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.print("Введите число: ");
         int vvod = sc.nextInt();

         if(vvod>=0){
            int m = factorial(vvod);
            System.out.println("Интеграл данного числа: " + m);
         }
         else{System.out.println("Интеграл от неположительного числа не существует");}
    }
}
