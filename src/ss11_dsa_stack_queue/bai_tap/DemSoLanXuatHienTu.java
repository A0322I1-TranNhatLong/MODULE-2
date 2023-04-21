package ss11_dsa_stack_queue.bai_tap;

import java.util.TreeMap;

public class DemSoLanXuatHienTu {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMapTu = new TreeMap<>();
        String str = "I love CodeGym very much ";
        String[] arrayStrings = str.split(" ");
        for (int i = 0; i < arrayStrings.length; i++) {
            if (treeMapTu.containsKey(arrayStrings[i])) {
                int newValue = treeMapTu.get(arrayStrings[i]);
                treeMapTu.put(arrayStrings[i], ++newValue);
            } else {
                treeMapTu.put(arrayStrings[i], 1);
            }
        }
        System.out.println(treeMapTu);
    }
}
