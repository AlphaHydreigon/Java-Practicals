import java.util.*;
 
@SuppressWarnings("unused")
class pr2
{
    public static void main(String[] args)
    {
        System.out.println("equation 1: 3.4x+50.2y=44.5");
        System.out.println("equation 2: 2.1x+0.55y=5.9");
        double a, b, c, d, e, f, x, y;
        a=3.4;
        b=50.2;
        e=44.5;
        c=2.1;
        d=0.55;
        f=5.9;

        x=((e*d)-(b*f))/((a*d)-b*c);
        y=((a*f)-(e*c))/((a*d)-b*c);
        System.out.println("x="+ x);
        System.out.println("y="+ y);
    }
}
