public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int randomIndex = (int)(Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }
}
