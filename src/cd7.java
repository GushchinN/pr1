import java.util.Scanner;
public class cd7 {
    static int integral(int n){
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

         int m = integral(vvod);
         System.out.println("Интеграл данного числа: " + m);
    }
}
