public class tugas_1P {

    public static void main(String[] args) {

        boolean Bool1, Bool2, TF ; int i,j, hsl ;
        float x,y,res;

        System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");
        Bool1 = true; Bool2 = false;

        TF = Bool1 && Bool2 ; /* Boolean AND */
        System.out.println ("\nTrue AND False: "+ TF);

        TF = Bool1 || Bool2 ; /* Boolean OR */
        System.out.println ("True OR False: "+ TF);

        TF = ! Bool1 ; /* NOT */
        System.out.println ("NOT True: "+ TF);

        TF = Bool1 ^Bool2; /* XOR */
        System.out.println ("True XOR False: "+ TF);

        /* operasi numerik */
        i = 5; j = 2 ;
        hsl = i+j;
        System.out.println ("\n5 + 2: "+hsl);
        hsl = i - j;
        System.out.println ("5 - 2: "+hsl);
        hsl = i * j;
        System.out.println ("5 x 2: "+hsl);
        hsl = i /j ; /* pembagian bulat */
        System.out.println ("5 / 2: "+hsl);
        hsl = i%j ; /* sisa. modulo */
        System.out.println ("5 mod 2: "+hsl);

        /* operasi numerik */
        x = 5 ; y = 5 ;
        res = x + y;
        System.out.println ("\n5 + 5: "+res);
        res = x - y;
        System.out.println ("5 - 5: "+res);
        res = x / y;
        System.out.println ("5 / 5: "+res);
        res = x * y;
        System.out.println ("5 x 5: "+res);

        /* operasi relasional numerik */
        TF = (i==j);
        System.out.println ("\n5 == 2: "+TF);
        TF = (i!=j);
        System.out.println ("5 != 2: "+TF);
        TF = (i < j);
        System.out.println ("5 < 2: "+TF);
        TF = (i > j);
        System.out.println ("5 > 2: "+TF);
        TF = (i <= j);
        System.out.println ("5 <= 2: "+TF);
        TF = (i >= j);
        System.out.println ("5 >= 2: "+TF);
        /* operasi relasional numerik */

        TF = (x != y);
        System.out.println ("\n5 != 5: "+TF);
        TF = (x < y);
        System.out.println ("5 < 5: "+TF);
        TF = (x > y);
        System.out.println ("5 > 5: "+TF);
        TF = (x <= y);
        System.out.println ("5 <= 5: "+TF);
        TF = (x >= y);
        System.out.println ("5 >= 5: "+TF);
    }
}