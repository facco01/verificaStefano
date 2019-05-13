package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        riempi(a);
        System.out.println("Vettore: " + Arrays.toString(a));
        /**punto 1*/
        int[] b = visulalizzaPari(a);
        System.out.println("Punto 1: " + Arrays.toString(b));
        /**punto 2*/
        int[] c = unisciVettori(a, b);
        System.out.println("Punto 2: " + Arrays.toString(c));
        /**punto 3*/
        //il punto 3 si può fare in due modi, il metodo veloce ti facilita anche il 4o punto
        //metodo veloce
        /*int doppio = calcolaDoppio(a, 3);*/
        //metodo lento
        int doppio = calcolaDoppio(a);
        System.out.println("Punto 3: " + doppio);
        /**punto 4*/
        int triplo = calcolaTriplo(a);
        System.out.println("Punto 4: " + triplo);
        /**punto 5*/
        int t = sommaVettori(b, c, a.length);
        System.out.println("Punto 5: " + t);
        /**punto 6*/
        int sT = sommaNumeriB(b);
        System.out.println("Punto 5: " + sT);
    }

    private static int sommaNumeriB(int[] b) {
        int m = b.length, somma = 0;
        for (int i = 0; i < m; i++) {
            //somma veloce
            /*somma+= b[i];*/
            //somma lenta
            somma = somma + b[i];
        }
        return somma;
    }

    private static int sommaVettori(int[] b, int[] c, int n) {
        int m = b.length, z = n + m - 2;
        return b[0] + c[z - 1];
    }

    /*
    altro modo di fare il punto 4 (triplo di a[n-1]
     */
    private static int calcolaTriplo(int[] a, int posizione) {
        return a[posizione] * 3;
    }

    private static int calcolaTriplo(int[] a) {
        int n = a.length;
        return a[n - 1] * 3;
    }

    /*
    altro modo di fare il punto 3 (doppio di a[3]
     */
    private static int calcolaDoppio(int[] a, int posizione) {
        return a[posizione] * 2;
    }

    private static int calcolaDoppio(int[] a) {
        return a[3] * 2;
    }

    private static int[] unisciVettori(int[] a, int[] b) {
        int n = a.length, m = b.length;
        //Questo è il metodo lento
        int[] c = new int[n + m];
        for (int i = 0; i < m; i++) {
            c[i] = b[i];
        }
        for (int i = 0; i < n; i++) {
            c[i + m] = a[i];
        }
        //int[] c = new int[n + m];
        //Questo è il metodo veloce
        /*int[]c = Arrays.copyOf(b, n + m);
        for (int i = 0; i < n; i++) {
            c[i+ m] = a[i];
        }*/
        return c;
    }

    private static int[] visulalizzaPari(int[] a) {
        int j = 0, m = a.length;
        int[] temp = new int[m];

        //mette in u n vettore di grandezza di a tutti i numeri pari di a
        for (int i = 0; i < m; i++) {
            int num = a[i];
            if (num % 2 == 0) {
                temp[j] = num;
                j++;
            }
        }
        /*
         * taglia il vettore con i numeri pari tenendo solo la parte usata
         * si puo fare in due modi
         * */
        //questo è il metodo lungo
        int b[] = new int[j];
        for (int i = 0; i < j; i++) {
            b[i] = temp[i];
        }
        //questo è il metodo veloce:
        /*int b[] = Arrays.copyOf(temp, j);*/
        return b;
    }

    private static void riempi(int[] array) {
        //riempe il vettore
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        //riempe in meniera random
        /*for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random()*10);
        }*/
    }
}
