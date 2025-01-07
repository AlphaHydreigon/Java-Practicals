import java.util.*;

class pr4
{
    public static void main(String[] args) 
    {
        double w, h, BMI;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight(in pounds):");
        w = input.nextDouble();
        System.out.println();
        System.out.print("Enter height(in inches):");
        h = input.nextDouble();

        BMI = (w*703)/(h*h);
        System.out.println("BMI = "+ BMI);
    }
}