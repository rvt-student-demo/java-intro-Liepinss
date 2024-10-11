package lv.rvt;
import java.util.Scanner;
public class App
{
    public static void main( String[] orgs)
    {
        Scanner scanner = new Scanner(System.in);
        
        stars.printRectangle(17,3);

        scanner.close();
    }
    public static void divisableByThreeInRange(int beginning, int end){
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

    
