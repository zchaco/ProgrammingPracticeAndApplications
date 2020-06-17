
import java.util.Scanner;

public class ReadScanner {
    
    public static void main(String[] args) {
        
        System.out.print("Enter a name:"); 
        Scanner input = new Scanner(System.in);
        String name = input.next(); 
        System.out.print("Name = " + name + "\n");
        

        System.out.print("Enter an age:"); 
        int age = input.nextInt();
        System.out.print("Age = " + age);
        input.close();
        
    }
}

