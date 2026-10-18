package patterns;

public class Q8 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 2*rows - i * 2 + 1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
