/* Contoh pengoperasian variabel bertype dasar */
public class tugas_1O {
    public static void main (String [] args ){
        int i = 0;
        int j = 0;
        char c = 8;
        char d = 10;
        int e = (((int)c > (int)d) ? c : d);
        int k = ((i>j) ? i : j);


        System.out.println("nilai e = "+ e);
        System.out.println("nilai k = "+ k);
        i = 2;
        j = 3;

        k= ((i++>j++) ? i : j );
        System.out.println("nilai k = "+k);

    }
}