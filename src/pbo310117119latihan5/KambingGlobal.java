/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan5;

/**
 *
 * @author user
 * Nama      : Arditya Yogaputra S
 * Kelas     : IF-3 / PBO-3
 * Nim       : 10117119
 * Deskripsi : Program ini Menampilkan jumlah kambing awal dan Jumlah kambing 
 *             yang telah ditambah
 */
public class KambingGlobal {
    /**
     * @param args the command line arguments
     */
    int jumlahKambing = 88;
        public void getJumlahKambing(){
            System.out.println("Jumlah Kambing : " + jumlahKambing);
        }
        public void tambahKambing(){
            jumlahKambing   =  jumlahKambing+5;
            System.out.println("Junlah kambing setelah ditambah = " + jumlahKambing);
        }
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal ();
        
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
    
    
    
    
    }
    
}
