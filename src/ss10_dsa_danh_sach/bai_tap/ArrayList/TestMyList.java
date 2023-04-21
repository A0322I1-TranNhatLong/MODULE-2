package ss10_dsa_danh_sach.bai_tap.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");
        myList.add("8");
        myList.add("9");
        myList.add("10");
        System.out.println("Số phần tử trong mảng : " + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Đã xóa: " + myList.remove(7));
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}
