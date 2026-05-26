/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author ASUS
 */
public class ContohMethodParameter {

    void LuasSegitiga (int alas, int tinggi){
        int a = alas;
        int t = tinggi;
        double l = 0.5*a*t;
        System.out.println("Luas Segitiga : "+ l);
    }
    double LuasLingkaran (double jarijari){
        double phi = 3.14;
        double r = jarijari;
        double L = phi*r*r;
        System.out.println("Luas Lingkaran : "+ L);
        return L;
    }
    public static void main(String[] args) {
        ContohMethodParameter rumus1Prosedur = new ContohMethodParameter();
        ContohMethodParameter rumus2Fungsi = new ContohMethodParameter();
        
        rumus1Prosedur.LuasSegitiga(10, 5);
        rumus2Fungsi.LuasLingkaran(5);
        
    }        
        
    
}
