import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        System.out.println("Finding Area Of Rectangle : ");
        Scanner sc = new Scanner(System.in);
        float x,y;
        System.out.print("Enter Length : ");
        x = sc.nextFloat();
        System.out.print("Enter Width : ");
        y =sc.nextFloat();
        System.out.println("Area of Rectangle : " + x*y);
    }
}
