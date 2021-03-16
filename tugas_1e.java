import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

//import javax.swing
public class tugas_1e {

    public static void main(String[] args) throws IOException {
        char cc;
        int bil;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);


        System.out.println("hello");

        System.out.println("baca 1 karakter : ");

        cc = dataIn.readLine().charAt(0);
        System.out.println("baca 1 bilangan ");

        bil = Integer.parseInt(dataIn.readLine());
        /*String kar = JOptionpane.showInputDialog("karakter 1: " );
        system.out.println (kar);
         */
        System.out.print(cc + "\n" + bil + "\n");
        System.out.println("bye");
    }
}