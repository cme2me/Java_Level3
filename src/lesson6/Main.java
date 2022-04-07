package lesson6;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7,};
        int[] a = {1, 2, 4, 4, 2, 4};
        int[] b = {1, 2, 4, 4, 1, 7, 5, 6, 1};
        int[] c = {1, 2, 1, 7, 444, 44, 14};
    }
    public static int[] checkingArr(int[] arr) {
        int x = 0;
        int [] result = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                x = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = i + 1, k = 0; j < arr.length; j++, k++) {
                    if (arr[j] == 4) {
                        continue;
                    }
                    result[k] = arr[j];
                }
            }
        }
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return result;
    }

    public static boolean checkingArr2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4) {
                return false;
            }
        }
        return true;
    }
}
