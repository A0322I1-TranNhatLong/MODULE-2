package ss10_dsa_danh_sach.bai_tap.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add(" Đà Nẵng");
        myList.add("Hà Nội");
        myList.add("Sài Gòn");
        myList.add("Nha Trang");
        myList.add("Gia Lai");
        System.out.println(myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Đã xóa: " + myList.remove(3));
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}
