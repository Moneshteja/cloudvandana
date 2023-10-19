import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers separated by spaces:");
        String[] inputValues = scanner.nextLine().split(" ");
        
        int[] array = new int[inputValues.length];
        for (int i = 0; i < inputValues.length; i++) {
            array[i] = Integer.parseInt(inputValues[i]);
        }

        shuffle(array);
        
        System.out.println("Shuffled array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
