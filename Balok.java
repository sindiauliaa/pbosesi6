package com.sesi6;
import java.util.Scanner;
import com.Interfaces.*;

public class Balok extends BangunRuang implements Diagonal{
    Scanner input = new Scanner(System.in);

    int panjang,lebar,tinggi;
    int Diagonalsisi = 12;
    int DiagonalRuang = 4;
    int DiagonalBidang = 6;
    int LuasPermukaan ;
    double volume ;

    @Override
    public int RusukBangunRuang() {
        System.out.println("Jumlah Diagonal Panjang Adalah : "+Diagonalsisi);
        System.out.println("Jumlah Diagonal Lebar Adalah   : "+DiagonalRuang);
        System.out.println("Jumlah Diagonal Tinggi Adalah  : "+DiagonalBidang);

        return 12;
    }


    @Override
    public double LuasPermukaan() {
        System.out.println("MENGHITUNG LUAS PERMUKAAN BALOK");
        System.out.print("Masukan panjang : ");
        panjang =input.nextInt();
        System.out.print("Masukan Lebar   : ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi  : ");
        tinggi = input.nextInt();
        LuasPermukaan = 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
        System.out.println("Luas Permukaan Balok Tersebut Adalah : "+LuasPermukaan);
        return LuasPermukaan;

    }
    @Override
    public double Volume() {
        System.out.println("MENGHITUNG  VOLUME BALOK");
        System.out.print("Masukan panjang : ");
        panjang =input.nextInt();
        System.out.print("Masukan Lebar   : ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi  : ");
        tinggi = input.nextInt();
        volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok Tersebut Adalah : "+volume);
        RusukBangunRuang();
        return volume;

    }

    @Override
    public void display() {
        LuasPermukaan();
        Volume();

    }






}