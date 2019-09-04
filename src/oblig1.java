
/*
    Sakina Salam - S331419
    Zarina Iljasova - S311806
 */

public class oblig1 {

    public static int maks(int[] a){
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen er tom!");

        int maksVerdi = 0;

        for(int i = 1; i < a.length; i++){
            if(a[i] > a[maksVerdi]) maksVerdi = i;
        }
        return maksVerdi;
    }

    public static void main(String[] args){
        int [] a = {1,5,3,2,6,8,1};

        System.out.println(oblig1.maks(a));
        System.out.println("ds");
    }
}


