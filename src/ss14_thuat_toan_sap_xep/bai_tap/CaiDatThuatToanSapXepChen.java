package ss14_thuat_toan_sap_xep.bai_tap;

public class CaiDatThuatToanSapXepChen {
    static int[] list = {2, 16, 31, 5, 6, 1, 34, 3, 14, 12};

    public static void main(String[] args) {
        insertionSort(list);
        for (int j : list) System.out.print(j + " ");
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
