import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
//import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Be1036 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float r1, r2;
        
        float delta = b*b - 4*a*c;
        if(delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        } else{
            r1 = (float) ((-b + Math.sqrt(delta))/(2*a));
            r2 = (float) ((-b - Math.sqrt(delta))/(2*a));

            //BigDecimal bd = new BigDecimal(r1).setScale(5, BigDecimal.ROUND_HALF_UP);
            DecimalFormat df = new DecimalFormat("0.00000");
            System.out.println("R1 = "+ df.format(r1));
            System.out.println("R2 = "+ df.format(r2));
        }


    }
}
