
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


public static int ombyttinger(int[] a) {
        int ombytt = 0;
        if (a.length < 1)
            throw new NoSuchElementException("Tabellen er tom");

        for (int j = 0; j < a.length - 1; j++) {
            if (a[j + 1] < a[j]) {
                int maksVerdi = a[j + 1];
                a[j + 1] = a[j];
                a[j] = maksVerdi;
                ombytt++;
            }
        }
        return ombytt;
    }

    /*
    Vi forutsetter at tabellen består av en tilfeldig permutasjon av tallene fra 1 til n.
    Det blir mest ombyttinger (n-1) når den storste verdien er fordelt i a[0].
    Det blir minst ombyttinger (0) når den storste verdien er fordelt i a[n].
    Naar vi kjorer metoden faar vi i snitt 100 diverse permutasjoner av en tabell med tallene 1 til 10,
    så vil det i snitt bli ca. 7 ombyttinger. Dette fører til at det er mindre effektivt enn maksmetoden siden vi ikke utfører noen ombyttninger. 
     */

    //Oppgave 2
    public static int antallUlikeSortert(int[] a)
    {
        if (a.length < 2)
        {
            return a.length;
        }

        int UlikeA = 1;

        for (int j = 1; j < a.length; j++)
        {
            if (a[j - 1] > a[j])
            {
                throw new IllegalStateException(" Usortet tabell!!");
            }
            else
            {
                if (a[j - 1] < a[j])
                {
                    UlikeA++;
                }
            }
        }
        return UlikeA;
    }

    
    // oppggave 3
    public static int antallUlikeUsortert(int[] a) {
        int teller = 1;
        int z;

        if (a.length < 1) {
            return 0;
        }
        for (int i = 1; i < a.length; i++) {
            for (z = 0; z < i; z++) {
                if (a[z] == a[i])
                    break;
            }
            if (z == i)
                teller++;
        }
        return teller;
    }

    // oppgave 4
    public static void delsortering(int[] a) {
        int oddetall = 0;
        int partall = a.length-1;

        while (true) {

            while (oddetall < a.length && (a[oddetall] % 2) != 0) oddetall++;
            while (partall >= 0 && ((a[partall] % 2) == 0)) partall--;
            if(oddetall < partall) {
                Oblig1Test.bytt(a, oddetall, partall);
            } else {
                break;
            }
        }
        Arrays.sort(a,0,oddetall);
        Arrays.sort(a,oddetall,a.length);
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


    //oppgave 8
    public static int[] indekssortering(int[] a) {

            int[] index = new int[a.length];
            int t;
            int x;

            for (int i = 0; i < a.length; i++) {
                index[i] = i;
            }


            for (int i = 1; i < a.length; i++) {
                for (t = index[i], x = i - 1; x >= 0 && a[t] < a[index[x]]; x--) {

                    index[x + 1] = index[x];
                }
                index[x + 1] = t;
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





