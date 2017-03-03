

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter order for rotation: ");
        int order = scanner.nextInt();

        Rotation rotate = new Rotation();
        int[] arrayToRotate = new int[]{1,2,3,4,5,6};
        rotate.leftRotate(arrayToRotate, order, arrayToRotate.length );
        System.out.println("Result Array: ");
        rotate.resultArray(arrayToRotate,arrayToRotate.length);
    }
}
