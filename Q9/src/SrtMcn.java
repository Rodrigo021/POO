package Q9.src;

public class SrtMcn {
    private SortAlg sortingAlgoritm;
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public SrtMcn(int[] arr, SortAlg selectedSortingAlgoritm) {
        this.arr = arr;
        this.sortingAlgoritm = selectedSortingAlgoritm;
    }

    void runSort() {
        this.sortingAlgoritm.runSort(arr);
    }
}
