package File;

import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main( String[] args )
    {
            File file = new File("N:\\Khanh Ngoc\\Java programming\\text.txt");
            if (file.exists()){
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println("File already present at the specified location");
            }
    }
}