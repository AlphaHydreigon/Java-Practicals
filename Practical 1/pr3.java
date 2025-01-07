import java.util.*;

class pr3
{
    public static void main(String[] args)
    {
        double m,f;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (in metre):");
        m = input.nextDouble();
        f = 3.28084 * m;
        System.out.println(m +" metres = "+ f +" feet");
    }
}