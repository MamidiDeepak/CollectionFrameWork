package aug24Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class LinkedList {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException{

       String path = "C:/Users/Dell/Downloads/pan-card-sample.jpg";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        System.out.println("End of File");
//        int i = 10/0;
        System.out.println("Arithmetic");
    }
}
