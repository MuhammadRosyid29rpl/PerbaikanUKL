/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaselkon;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class Cobaselkon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id[] = {1, 2, 3, 4};//id pelanggan
        String nama[] = {"Galuh", "Indro", "Jedi", "Kanu"};//namapelanggan
        String alamat[] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        int golongan[] ={1,3,2,3};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan");
        String idIn = input.nextLine();
        int iId = Integer.valueOf(idIn);

        System.out.println("Masukkan jumlah kwh");
        int kwh = input.nextInt();
        //System.out.println("Golongan :");
        int igolongan = Integer.valueOf(idIn) ;
        if (igolongan == 1) {
            igolongan = kwh * 1000 + 13000;

        } else if (igolongan == 2) {
            igolongan = kwh * 1300 + 13000;

        } else if (igolongan == 3) {
            igolongan = kwh * 1500 + 13000;
        }
        if (igolongan < 50000) {
            igolongan = 50000 + 13000;
        }
        System.out.println("ID        :" + idIn);
        System.out.println("Nama      :" + nama[iId - 1]);
        System.out.println("Golongan  :" +golongan[iId - 1]);
        System.out.println("Alamat    :" + alamat[iId - 1]);
        System.out.println("Jumlah Tagihan :" + igolongan + ",-");
    }

}
