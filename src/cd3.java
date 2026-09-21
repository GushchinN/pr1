public class cd3 {
    public static void main(String[] args) {

        int[] arr = {1,3,6,7};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double sumd = sum;
        double lengd = arr.length;
        double avg = sumd / lengd;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + avg);
    }
}