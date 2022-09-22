package Q9.src;

public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {-26, -89, 5, 3, 1, 10, 8, 54, 21};
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        SrtMcn s = new SrtMcn(arr, i);

        s.runSort();

        for (int j : s.getArr()) {
            System.out.println(j);
        }
    }
}
