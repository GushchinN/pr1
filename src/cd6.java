public class cd6 {
    public static void main(String[] args) {

        System.out.print("1 +");
        int n = 100;
        for(int i = 2; i < n; i++){
            if (i<n-1) {
                System.out.print(" 1/" + i + " +");
            }
            else{System.out.print(" 1/" + i);}
        }
    }
}