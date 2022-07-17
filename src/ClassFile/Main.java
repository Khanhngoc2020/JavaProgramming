

package ClassFile;

import java.io.File;

public class Main {
    public static void main(String[] args){
        File file = new File("example_java.txt");
        if(file.exists()){
            System.out.println("This file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            // file.delete();
        }else{
            System.out.println("This file doesn't exists");
        }
    }
}
