package lv.rvt;

public class stars {
    
public static void printStars(int number){
    for (int i = 0; i < number; i++) {
        System.out.print("*");
    }
    System.out.println();
}
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
    public class ChristmasTree {
        public static void christmasTree(int n) {
            
            for (int i = 1; i <= n; i++) {
               
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            
            for (int i = 0; i < 2; i++) {
                
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(" ");
                }
                
                System.out.println("***");
            }
        }
    
        public static void main(String[] args) {
            christmasTree(10);
        }
    }
    
}
