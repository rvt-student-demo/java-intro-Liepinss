package lv.rvt;
import java.util.Scanner;
public class App
{
    

    public class SumOfNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give numbers:");
    
            int sum = 0;
    
            while (true) {
                int number = scanner.nextInt();
                if (number == -1) {
                    System.out.println("Thx! Bye!");
                    break;
                }
                sum += number; 
            }
    
            System.out.println("Sum: " + sum);
            scanner.close();
        }
    }
    
}

    
