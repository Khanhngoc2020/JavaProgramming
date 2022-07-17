package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args)  {
        FileReader file;
        try {
            file = new FileReader("N:\\Khanh Ngoc\\Java programming\\Text File Java\\ReadFile.txt ");

        int data = file.read();

        while(data != -1){
            System.out.print((char)data);
            data = file.read();
        }

        file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
