import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int[] array;
        int temp;
        array = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integers");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length / 2 ; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
