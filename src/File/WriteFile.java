package File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
      public static void main(String[] args) throws IOException{
            // generate file output
            File outFile = new File("C:\\Users\\khanh\\IdeaProjects\\HelloWorld\\src\\ClassFile\\Poem.txt");
            FileWriter fileWriter = new FileWriter(outFile); // tao luong de ghi vao file outFile

            System.out.println("Writer file: " + outFile.getAbsolutePath());
            System.out.println("With encoding: " + fileWriter.getEncoding());

            FileWriter file1 = new FileWriter("tuandinhdeptrai.txt"); // Tao luong file1 de ghi vao file tuandinhdeptrai.txt
            file1.write("Tuan Dinh dep trai");
            file1.close();
      }
}
