
/*
    Soukaina Salam - S331419
    Zarina Iljasova - S311806
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1

    /*  public static int maks(int[] a){
          if (a.length < 1)
              throw new java.util.NoSuchElementException("Tabellen er tom!");

          int maksVerdi = 0;

          for(int j = 0; j < a.length -1 ; j++){

              if(a[j] > a[j+1]) {
                  maksVerdi = a[j];
                  a[j] = a[j + 1];
                  a[j + 1] = maksVerdi;

              }

          }

          return a[a.length - 1];
      }
  */
    public static void main(String[] args) {
        int[] a = {3, 4, 10, 2, 5, 1};
        //char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        //String s = "abc";
        //String t = "ABC";
        // String a = "Z en";
        // String b = "ab e";
        //String c = "yut ";
        //String d = "krr ";
        // String e = "ade ";

        //System.out.println(Oblig1.maks(a));
        //System.out.println(Oblig1.ombyttinger(a));
        //System.out.println(Oblig1.antallUlikeSortert(a));
        //System.out.println(Oblig1.antallUlikeUsortert(a));
        //delsortering(a);
        // System.out.println(Arrays.toString(a));

        /*System.out.println(Arrays.toString(a));
        rotasjon(a,3); System.out.println(Arrays.toString(a));
        rotasjon(a,-2); System.out.println(Arrays.toString(a));*/
        //System.out.println(Oblig1.flett(s,t));
        //System.out.println(Oblig1.flett(a,b,c,d,e));
        //System.out.println("Før indekssortering: " + Arrays.toString(a));
        //System.out.println("Etter indekssortering: " + Arrays.toString(indekssortering(a)));
        System.out.println(Arrays.toString(tredjeMin(a)));
    }
/*
    public static int[] indekssortering1(int[] a) {
        int[] indeks = new int[a.length]; //oppretter en ny tabell med samme lengde som parametertabellen

        for(int i = 0; i < a.length; i++){
            indeks[i] = i; //Fyller indeks-tabellen med verdier fra 0 til a.length
        }



        int temp;
        int j;
        for (int i = 1; i < a.length; i++) {
            for (temp = indeks[i], j = i-1; j >=0 && a[temp] < a[indeks[j]]; j--) {
                //Setter temp lik verdiene i indeks, og j lik i-1.
                //Så lenge j er mindre eller lik 0, og a[temp] er mindre enn a[indeks[j]], saa skal j dekrementeres.
                indeks[j+1] = indeks[j];
            }
            indeks[j+1] = temp;
        }

        return indeks;
    }

*/
 /*   public static int ombyttinger(int[] a) {


        int ombytt = 0;
        if (a.length < 1)
            throw new NoSuchElementException("Tabellen er tom");

        for (int j = 0; j < a.length - 1; j++) {
            if (a[j + 1] > a[j]) {
                int maksVerdi = a[j + 1];
                a[j + 1] = a[j];
                a[j] = maksVerdi;
                ombytt++;
            }
        }
        return ombytt;
    }
    */

    //Oppgave 2
    /*public static int antallUlikeSortert(int[] a){

        if (a.length < 1){
            return 0;
        }

        int i = 0;
        int teller = 1;

        for (int j= 0; j< a.length - 1; j++){
            if ( i <= a[j]){
                if ( a[j]!= i){
                    teller++;
                }
                i = a[j];
            }
            if (a[j] > a [j + 1]){
                throw new IllegalStateException("Tabellen er ikke sortert");
            }
        }
        return teller; 

    }*/


  /*  public static int antallUlikeUsortert(int[] a) {
        if (a.length < 1)
            return 0;           //sjekker om arrayet er tomt
        else {
            int teller = 0;
            int next = 0;
            for (int i = 0; i < a.length; i++) {    //kjører gjennom arrayet
                if (a[i] != next) {             //sjekker om nåværende indeks er lik forrige indeks i arrayet
                    teller++;
                }
                next = a[i];
            }
            return teller;
        }

    }*/

/*
    public static void delsortering(int[] a) {
        if (a.length < 1)
            System.out.println("0");

        int partall = 0, oddetall = a.length - 1;
        while (oddetall > partall)
        {
            while (a[oddetall]%2 == 0 && oddetall > partall)
                oddetall--;

            while (a[partall]%2 == 1 && oddetall >  partall)
                partall++;

            if (oddetall > partall)
            {
                int temp = a[partall];
                a[partall] = a[oddetall];
                a[oddetall] = temp;
                oddetall--;
                partall++;
            }
        }
    }
    */
/*

    //Oppgave 5

    public static void rotasjon(char[] a) {
        if (a.length < 2) {
            return;
        }

        char nyliste = a[a.length - 1];

        for (int i = a.length - 1; i >= 1; i--) {
            a[i] = a[i - 1];
        }

        a[0] = nyliste;
    }

*/

    //Oppgave 6

   /* public static void rotasjon(char[] a, int k) {
        int b = a.length;

        if (b < 2) {
            return;
        }

        k %= b;

        char[] tabell = new char[Math.abs(k)];
        int c = 0;

        // Mot venstre
        if (k < 0) {
            k = Math.abs(k);

            for (int i = 0; i < k; i++) {
                tabell[i] = a[i];
            }

            for (int i = 0; i <= b - k - 1; i++) {
                a[i] = a[k + i];
            }

            for (int i = 0; i < tabell.length; i++) {
                a[b - i - 1] = tabell[k - i - 1];
            }
        }

        // Mot høyre
        else if (k > 0) {
            for (int i = b - k; i < b; i++) {
                tabell[c++] = a[i];
            }

            for (int i = b - k - 1; i >= 0; i--) {
                a[k + i] = a[i];
                if (i < k) {
                    a[i] = tabell[i];
                }
            }

        }

        }*/


   /*public static String flett(String s, String t){
       int switch_ = 0;
       int j = 0;
       int k = 0;
       String newString = "";
       for (int i = 0; i < (s.length() + t.length()); i++){
           if (switch_ == 0){
               j++;
               newString += s.charAt(j-1);
               switch_ = 1;
           }
           else if (switch_ == 1){
               k++;
               newString += t.charAt(k-1);
               switch_ = 0;
           }
       } return newString;
   }*/

   /* public static String flett(String a, String b, String c, String d, String e){
        int lenght = a.length() + b.length() + c.length() + d.length() + e.length();
        String newString = "";

        for (int i = 1; i <= 4; i++) {
            newString += a.charAt(i - 1);
            newString += b.charAt(i - 1);
            newString += c.charAt(i - 1);
            newString += d.charAt(i - 1);
            newString += e.charAt(i - 1);
        }return newString;
    }
    */


    public static int[] indekssortering(int[] a) {
        int[] index = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
            }
        }

        int i = 0;
        while (i < a.length) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    index[i] = j;
                    i++;
                    if (i == a.length) {
                        break;
                    }
                }
            }
        }
        return index;
    }


    // Oppgave 9
    public static int[] tredjeMin(int[] a) {

        if (a.length < 3 ){
            throw new NoSuchElementException("a.length (" + a.length + ") < 3");
        }


        int[] firstThree = {a[0], a[1], a[2]};
        int[] sortert = indekssortering(firstThree);

        int min1 = sortert[0];
        int min2 = sortert[1];
        int min3 = sortert[2];


        int minst = a[min1];
        int nestminst = a[min2];
        int tredjeminst = a[min3];

        for (int i = 3; i < a.length; i++) {
            if (a[i] < tredjeminst) {
                if (a[i] < nestminst) {
                    if (a[i] < minst) {
                        min3 = min2;
                        tredjeminst = nestminst;

                        min2 = min1;
                        nestminst = minst;

                        min1 = i;
                        minst = a[i];
                    } else {
                        min3 = min2;
                        tredjeminst = nestminst;

                        min2 = i;
                        nestminst = a[i];
                    }
                } else {
                    min3 = i;
                    tredjeminst = a[i];

                }
            }
        }

        return new int[]{min1, min2, min3};

    }


}

/*
// Oppgave 10
    public static boolean inneholdt(String a, String b) {
        int[] x = new int[250];
        int[] y = new int[250];

        for (char c : a.toCharArray()) x[c]++;
        for (char c : b.toCharArray()) y[c]++;

        for (int i = 0; i < x.length; i++) if (x[i] > 0) if (y[i] < x[i]) return false;
        return true;
    }

}*/





