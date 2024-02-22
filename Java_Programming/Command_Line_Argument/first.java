package Command_Line_Argument;

/**
 * first
 */
public class first {
    public static void main(String args[]) {
        int i;
        float f;
        double d;
        System.out.println("Enter integer, float, double value:");
        i=Integer.parseInt(args[0]);
        System.out.println("i="+i);
        f=Float.parseFloat(args[1]);
        System.out.println("f="+f);
        d=Double.parseDouble(args[2]);
        System.out.println("d="+d);
    }
    
}