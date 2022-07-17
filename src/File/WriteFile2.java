package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Poem1.txt");
        writer.write("Đầu lòng hai ả tố nga");
        writer.write("\n");
        writer.write("Thúy Kiều là chị, em là Thúy Vân");
        writer.close();




    }
}
