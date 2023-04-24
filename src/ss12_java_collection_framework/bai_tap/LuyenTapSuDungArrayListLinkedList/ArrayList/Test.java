package ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayListLinkedList.ArrayList;

public class Test {
    public static void main(String[] args) {
        Product sp1 = new Product("Tivi", "T01", 1000000);
        Product sp2 = new Product("Laptop", "L01", 20000000);
        Product sp3 = new Product("Bút", "B01", 5000);
        ProductManager productManager = new ProductManager();

        productManager.add(sp1);
        productManager.add(sp2);
        productManager.add(sp3);
        productManager.display();
        productManager.edit();
        productManager.remove();
        productManager.search();
        productManager.sortCost();
        productManager.display();

    }
}
