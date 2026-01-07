import java .io.*;
public class cheked {
    public static void main(String[] args) {
        try {
            FileReader fr =new FileReader("abc.txt");
        } catch (FileNotFoundException e) 
        {
            System.out.println("File not found!");
        }
        System.out.println("Program continues...");
    }
}
