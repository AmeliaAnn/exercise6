package exercise6.com;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input x: ");
            int x = in.nextInt();
            System.out.println("Input y: ");
            int y = in.nextInt();
            System.out.println("Input z: ");
            int z = in.nextInt();
            int res = ((x + y + z)/3)/2;
             if (res > 3)
            System.out.print("Программа выполнена корректно");
         else
         System.out.println("Incorrect!");

            in.close();
    }
}
