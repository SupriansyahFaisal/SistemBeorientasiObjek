/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1700016083;

/**
 *
 * @author Labkom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static int N;
    static String s;
    public static void Jumlah() {
        int jum = 0;
        s = "";
            for (int i = 1; i < N; i++) {
            s += i + " + ";
            jum += i;
        }
            jum += N;
             s += N + " = " + jum;
    }
    public static void main(String[] args) {
        N = 10;
        Jumlah();
        System.out.print("Hasil :"+ s + "\n");
        Segitiga s3 = new Segitiga();
        s3.N = 20;
        s3.Jumlah();
        System.out.print("Hasil dari objek :"+ s3.s + "\n" );
        s3.N = 20;
        s3.Gambar();
        System.out.print("Hasil dari objek : \n"+ s3.s + "\n" );
    }
    
}
