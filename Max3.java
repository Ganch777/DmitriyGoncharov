import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by user on 10.11.2016.
 */
public class Max3 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("Input 3 numbers: ");
        input  = reader.readLine();
        int a = Integer.parseInt(input);
        input  = reader.readLine();
        int b = Integer.parseInt(input);
        input  = reader.readLine();
        int c = Integer.parseInt(input);
        if(a>b) {
           if(a>c) {
               System.out.println(a);
           } else {
               System.out.println(c);
           }
        }else if (a<b) {
            if(b>c) {
                System.out.println(b);
        }else{
                System.out.println(c);}
        }
    }
}
