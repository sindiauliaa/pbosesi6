package com.sesi6;
import java.util.Scanner;

public class Tabung extends BangunRuang {
    Scanner input = new Scanner(System.in);
    int tinggi;
    int r;
    double phi = 3.14;
    double LuasPermukaan ;
    double Volume ;


    @Override
    public double LuasPermukaan() {
            System.out.println("MENGHITUNG LUAS PERMUKAAN TABUNG");
            System.out.print("Masukan Tinggi : ");
            tinggi =input.nextInt();
            System.out.print("Masukan Jari-Jari : ");
            r =input.nextInt();
            LuasPermukaan = 2 * phi * r * (r + tinggi);
            System.out.println("Luas Permukaan Tabung Tersebut Adalah : "+LuasPermukaan);
            return LuasPermukaan;
    }

    @Override
    public double Volume () {
            System.out.println("MENGHITUNG VOLUME TABUNG");
            System.out.print("Masukan Tinggi : ");
            tinggi =input.nextInt();
            System.out.print("Masukan Jari-jari : ");
            r =input.nextInt();
            Volume = phi * (r * r) * tinggi;
            System.out.println("Volume Tabung Tersebut Adalah : "+Volume);
            return Volume;
    }

    @Override
    public void display() {
        LuasPermukaan();
        Volume();

    }

}