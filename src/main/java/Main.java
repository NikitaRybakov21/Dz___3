public class Main {
    static private final int SIZE = 250000000;
    static private final int[] arr = new int[SIZE];

    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 2100000) n = 1;
            arr[i] = i + 1 + n;
        }

        System.out.println(arrSearch());
    }
    private static int arrSearch(){
        // Сложность алгоритма O(log(n))
        int temp;
        int start = 0;
        int end = SIZE - 1;

        while (true) {
            temp = (start + end) / 2;

            if (arr[temp] == temp + 1) {
                start = temp;
            } else {
                if (arr[temp - 1] == arr[temp] - 1) {
                    end = temp;
                } else {
                    return temp + 1;
                }
            }
        }

    }
}
