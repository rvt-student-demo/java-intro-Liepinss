package lv.rvt;
import java.util.Scanner;
public class App
{
    

    public class AverageCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;
            int number;
    
            System.out.println("Give numbers:");
    
            
            while (true) {
                number = scanner.nextInt();
    
                if (number == -1) {
                    break; 
                }
    
                sum += number; 
                count++;       
            }
    
            scanner.close(); 
    
            
            System.out.println("Thx! Bye!");
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + count);
    
            if (count > 0) {
                double average = (double) sum / count; 
                System.out.println("Average: " + average);
            } else {
                System.out.println("Average: N/A"); 
            }
        }
    }
    
}

    
