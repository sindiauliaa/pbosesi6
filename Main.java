package com.sesi6;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);


    void display() {

        System.out.println("Nama  : Sindi aulia alawiyah");
        System.out.println("Nim   : 20210040049");
        System.out.println("Kelas : TI21C");
        System.out.println("TUGAS PEMROGRAMAN BERORIENTASI OBJEK SESI 6");

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.display();


                Tabung tabung = new Tabung();
                tabung.display();
                Balok balok = new Balok();
                balok.display();


                Bola bola = new Bola();
                bola.display();

            }
        }
