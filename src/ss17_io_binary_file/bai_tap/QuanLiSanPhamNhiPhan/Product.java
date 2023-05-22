package ss17_io_binary_file.bai_tap.QuanLiSanPhamNhiPhan;

public class Product {
    String code;
    String name;
    String manufacturer;
    double price;
    String otherDescription;

    public Product(String code, String name, String manufacturer, double price, String otherDescription) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", otherDescription='" + otherDescription + '\'' +
                '}';
    }
}
