/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author ASUS
 */
public class ContohMethod {
    //contohprosedur
    void LuasPersegiPanjang() {
        int P=10;
        int L= 5;
        int l= P*L;
        System.out.println("Luas Persegi Panjang adalah : "+ l);
        
    
    }
    //contohfungsi
    int LuasPersegi(){
        int sisi = 10;
        int Luas = sisi*sisi;
        System.out.println("Luas Persegi"+Luas);
        return Luas;
        
    }
    public static void main(String[] args) {
        ContohMethod Prosedur = new ContohMethod();
        
        Prosedur.LuasPersegiPanjang();
        
        ContohMethod Fungsi = new ContohMethod();
        
        Fungsi.LuasPersegi();
    }
}

