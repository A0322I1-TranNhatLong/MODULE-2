package ss16_io_text_file.bai_tap.CopyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {
    public static List<String> readFileText(String filePath) {
        List<String> list = new ArrayList<>();
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        System.out.println(list);
        return list;
    }

    public static int writeFileText(String filePath, List<String> list) throws IOException {
        int count = 0;
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String text : list) {
                bufferedWriter.write(text);
                bufferedWriter.newLine();
                count += text.length();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (count);
    }

    public static void main(String[] args) throws IOException {
        final String SOURCE = "D:\\CodeGym\\TranNhatLong-A1222I1_Md2\\src\\ss16_io_text_file\\bai_tap\\CopyFile\\Source.csv";
        String TARGET = "D:\\CodeGym\\TranNhatLong-A1222I1_Md2\\src\\ss16_io_text_file\\bai_tap\\CopyFile\\Target.csv";
        List<String> list = readFileText(SOURCE);
        System.out.println("Kết quả : " + writeFileText(TARGET, list));
    }
}
