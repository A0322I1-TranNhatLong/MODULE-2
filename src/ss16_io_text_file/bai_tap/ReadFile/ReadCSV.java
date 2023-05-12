package ss16_io_text_file.bai_tap.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    private static final String FILE_PATH = "D:\\CodeGym\\TranNhatLong-A1222I1_Md2\\src\\ss16_io_text_file\\bai_tap\\ReadFile\\Country.csv";

    public static List<Country> readWriteCSV() throws IOException {
        List<Country> listCountry = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String temp[];
        Country codeName;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String geocode = temp[1].replaceAll("\"", "");
            String name = temp[2].replaceAll("\"", "");

            codeName = new Country(id, geocode, name);
            listCountry.add(codeName);
        }
        buff.close();
        return listCountry;
    }

    //    public static void writeCSV(Country country) throws IOException{
//        FileWriter fileWriter = new FileWriter(FILE_PATH,false);
//        BufferedWriter buff = new BufferedWriter(fileWriter);
//        buff.write(country.getId() + "," + country.getGeocode() + "," + country.getName() +"\n");
//        buff.close();
//    }
    public static void main(String[] args) throws IOException {
        List<Country> countryList = ReadCSV.readWriteCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
//        ReadCSV.writeCSV();

    }
}
