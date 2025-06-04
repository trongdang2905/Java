
import java.util.Scanner;

public class GetData {

    static Scanner sc = new Scanner(System.in);

    public static double getDouble(String msg) {
        //Vong lap de user nhap dung dinh dang so
        while (true) {
            try {
                System.out.println(msg);
                double n = Double.parseDouble(sc.nextLine());
                // So nhap vao bat buoc phai la so lon hon 0
                if (n > 0) {
                    return n;
                }
                System.out.println("Please input a number greater than 0");
            } catch (NumberFormatException e) {
                System.out.println("Please input a number");
            }
        }
    }
}
