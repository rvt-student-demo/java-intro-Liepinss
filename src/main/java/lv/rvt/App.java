package lv.rvt;
import java.util.Scanner;
public class App
{
    

    public class ReadingNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give numbers:");
    
            while (true) {
                int number = scanner.nextInt();
                if (number == -1) {
                    System.out.println("Thx! Bye!");
                    break;
                }
                System.out.println(number);
            }
            scanner.close();
        }
    }
    
}

    
