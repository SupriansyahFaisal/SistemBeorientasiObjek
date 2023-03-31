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
public class Segitiga {
    int N;
    String s;
    public void Jumlah() {
        int jum = 0;
        s = "";
            for (int i = 1; i < N; i++) {
            s += i + " + ";
            jum += i;
        }
            jum += N;
             s += N + " = " + jum;
    }
    public void Gambar() {
        int jum = 0;
        s = "";
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    s += "*";
                }
                for (int j = i; j <= N; j++) {
                s += " ";
                }
                s += " | "+i+"\n";
        }
    }
}
