
/*
    Soukaina Salam - S331419
    Zarina Iljasova - S311806
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1

      public static int maks(int[] a){
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

public static int ombyttinger(int[] a) {


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


    //Oppgave 2
    public static int antallUlikeSortert(int[] a){

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

    }

    // oppggave 3
    public static int antallUlikeUsortert(int[] a) {
        int teller = 1;

        if (a.length < 1) {
            return 0;
        }

        for (int i = 1; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[j] == a[i])
                    break;
            }
            if (j == i)
                teller++;
        }
        return teller;
    }

    // oppgave 4
    public static void delsortering(int[] a) {
        int v = 0;
        int h = a.length-1;

        while (v < a.length && (a[v] & 1) != 0) v++;
        while (h >= 0 && ((a[h] & 1) == 0)) h--;

        while (true) {

            while (v < a.length && (a[v] & 1) != 0) v++;
            while (h >= 0 && ((a[h] & 1) == 0)) h--;
            if(v < h) {
                Oblig1Test.bytt(a, v, h);
            } else {
                break;
            }

        }
        Arrays.sort(a,0,v);
        Arrays.sort(a,v,a.length);
    }



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



    //Oppgave 6

    public static void rotasjon(char[] a, int k) {
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

        }


   public static String flett(String s, String t){
       StringBuilder sb = new StringBuilder();
       int i = 0, j = 0, k = 0;                 // lokkevariabler

       while (i < s.length() - 1 && j < t.length()) {
           sb.append(s.charAt(i++));      // forst en verdi fra s
           sb.append(t.charAt(j++));       // saa en verdi fra t
       }
       // vi maa ta med resten

       if (i < s.length()) sb.append(s.substring(i));
       if (j < t.length()) sb.append(t.substring(j));

       return sb.toString();
   }

    public static String flett(String... s){
        StringBuilder sb2 = new StringBuilder();

        boolean done = false;
        int i = 0;
        while (!done) {
            done = true;

            for (int j = 0; j < s.length; j++) {
                if (s[j].length() > i) {
                    sb2.append(s[j].charAt(i));

                    done = false;
                }
            }
            i++;

        }
        return sb2.toString();
    }



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





// Oppgave 10
    public static boolean inneholdt(String a, String b) {
        int[] x = new int[250];
        int[] y = new int[250];

        for (char c : a.toCharArray()) x[c]++;
        for (char c : b.toCharArray()) y[c]++;

        for (int i = 0; i < x.length; i++) if (x[i] > 0) if (y[i] < x[i]) return false;
        return true;
    }

}





