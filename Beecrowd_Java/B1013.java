import java.util.Scanner;
import java.lang.Math; //importing Math class

public class B1013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s. nextInt();
        int c = s.nextInt();
        
        int maiorAB = (a+b+Math.abs(a-b))/2;    //verifica o maior entre os dois primeiros numeros
        int maiorABC = (maiorAB+c+Math.abs(maiorAB-c))/2;   //verifica o maior entre o maiorAB e o terceiro numero

        System.out.println(maiorABC + " eh o maior");
    }
}
