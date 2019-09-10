
/*
    Soukaina Salam - S331419
    Zarina Iljasova - S311806
 */

import java.util.Arrays;
import java.util.NoSuchElementException;

public class oblig1 {

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
        //int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        //System.out.println(oblig1.maks(a));
        //System.out.println(oblig1.ombyttinger(a));
        //System.out.println(oblig1.antallUlikeSortert(a));
        //System.out.println(oblig1.antallUlikeUsortert(a));
        //delsortering(a);
        // System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(a));
        rotasjon(a,3); System.out.println(Arrays.toString(a));
        rotasjon(a,-2); System.out.println(Arrays.toString(a));
    }


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
    }





