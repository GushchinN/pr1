import java.util.Scanner;

public class cd4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество элементов в массиве: ");
            int n = sc.nextInt();
            System.out.print("Введите элементы массива: ");
            int[] arr= new int[n];

            int cnt = 0;
            while (cnt != n ){
                arr[cnt]=sc.nextInt();
                cnt++;
            }
            cnt = 0;

            int sum = 0;
            while (cnt != n){
                sum+=arr[cnt];
                cnt++;
            }
            cnt=0;

            int min = arr[0];
            int max = arr[0];
            while (cnt !=n){
                if (min > arr[cnt]){min = arr[cnt];}
                if (max < arr[cnt]){max = arr[cnt];}
                cnt++;
            }

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Максимальный элемент массива: " + max);
            System.out.println("Минимальный элемент массива: " + min);
        }
    }
