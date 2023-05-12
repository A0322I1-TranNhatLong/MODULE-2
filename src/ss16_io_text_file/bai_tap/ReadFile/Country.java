package ss16_io_text_file.bai_tap.ReadFile;

public class Country {
    //Khai bao
    private int id;
    private String geocode;
    private String name;

    public Country() {
    }

    public Country(int id, String geocode, String name) {
        this.id = id;
        this.geocode = geocode;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeocode() {
        return geocode;
    }

    public void setGeocode(String geocode) {
        this.geocode = geocode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", geocode='" + geocode + '\'' +
                ", country='" + name + '\'' +
                '}';
    }
}
