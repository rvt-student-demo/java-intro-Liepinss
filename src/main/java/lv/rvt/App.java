package lv.rvt;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        
    }
            Scanner scanner = new Scanner(System.in);
                int result = 0;
                int summa = 0;
                while (true) {
                        System.out.println("give a number");
                        int number = Integer.valueOf(scanner.nextLine());
                        if(number == 0) {
                            break;
                        }

                        if(number > 0) {
                            result = result + 1;
                            summa = summa + number;
                            continue;
                        }
                    
                    }
                    System.out.println("number of number: " + result);
                    system.out.println("number of number: " + summa);
}

    
