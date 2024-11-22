package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10); // 10 milliseconds = 1/100 of a second
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
                break;
            }
        }
    }
}
