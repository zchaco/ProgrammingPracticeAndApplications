import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWriterExample {
    
    public static void main (String[] args) {
    
        FileWriter fw = null;
        PrintWriter pw = null; 

        try {

            fw = new FileWriter("test.txt");
            pw = new PrintWriter(fw);

            pw.println("Example 1");
            pw.println("Example 2");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {

            if (pw != null ) {

                pw.close();
                
            } 

            if (fw != null){
                try {
                    fw.close();
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
            } 
        }
        
    }
        
}