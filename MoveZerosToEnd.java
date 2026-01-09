public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to end: " + java.util.Arrays.toString(arr));
    }
}