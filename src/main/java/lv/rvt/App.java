package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;



 import java.util.Random;

public class App {
public static void main(String[] args) {
Random random = new Random();
int[] array = new int[10];

for (int i = 0; i < array.length; i++) {
array[i] = random.nextInt(100);
}

System.out.println("Array elements:");
for (int num : array) {
System.out.print(num + " ");
}
System.out.println();

int max = array[0];
int min = array[0];
for (int num : array) {
if (num > max) max = num;
if (num < min) min = num;
}

System.out.println("Maximum value: " + max);
System.out.println("Minimum value: " + min);
}
}
    


    
