/*

 E31192134_Fii Ahsan Qauly_D

 */

package E31192175_Stack;



import java.util.Scanner;



class Stack {

    

    Baju top; //Inisialisasi variabel baju adalah top

    public Stack(){

        top=null; //Nilai pada top bernilai null atau tidak memiliki nilai

    }

    public void push(Baju x){ //konstruktor push untuk memasukkan data

        if(top==null) top=x; //Kondisi dimana jika top bernilai null 

        else{

            x.next=top; //Kondisi di nmana jika data x ditambahkan maka bernilai sama dengan top

            top=x;

        }

    }

    public void pop(){ //Konstruktor untuk mengeluarkan data yang paling atas

        if(top==null) System.out.println("data kosong"); //Kondisi dimana jika nilai top sama dengan null maka akan menampilkan data kosong

        else{

            System.out.println("Melakukan popping"); //Menampikan output tulisan melakukan popping

            top.display();//Kondisi dimana menampilkan data yaitu pop

            top=top.next; //Memunculkan data yang sudah dikeluarkan

        }

    }

    public void display(){

        if(top==null) System.out.println("data kosong"); //Kondisi dimana jika nilai top sama dengan null maka akan menampilkan data ksoong

        else{

            Baju ptr=top; //Insialisasi nilai ptr sama dengan top pada variabel baju

            while(ptr!=null){ //Kondisi dimana jika ptr bernilai null

                System.out.println("-----"); //Memunculkan tulisan ----- saat di run

                ptr.display(); //Menampilkan data yang ada pada stack

                ptr=ptr.next;

            }

        }

    }

}

public class Baju {

        int kode, rak;

    String jenis;

    Baju next;

    /*

    Kode diatas adalah pendeklarasian tipe data dan variabel dimana kode dan

    rak berupa angka maka dari itu menggunakan integer,jenis berupa kalimat 

    menggunakan String.

     */

    public static Scanner input = new Scanner(System.in);

    public static Scanner string = new Scanner(System.in);



    /*

    Kode diatas adalah menggunakan static diamana agar objek dari kelas lain

    dapat mengaksesnya tanpa membuat instansinya.Kode [ertama "input" digunaka

    untuk inputan bertipe string dan kode kedua "string" digunakan untuk input 

    data bertipe String

     */

    public void input() {

        System.out.print("Masukkan kode baju    : ");

        kode = input.nextInt();

        System.out.print("Masukkan jenis baju   : ");

        jenis = string.nextLine();

        System.out.print("Masukkan rak baju     : ");

        rak = input.nextInt();

        next = null;

    }



    /*

    Kode diatas adalah konstruktor yang dipakai untuk menginputkan data yang di

    inginkan sesuai tipe data yang ada

     */

    public void display() {

        System.out.println("kode baju     : " + kode); //Menampilkan output berupa kode

        System.out.println("jenis baju    : " + jenis); //Menampilkan output berupa jenis

        System.out.println("rak baju      : " + rak); // menampilkan output berupa rak

    }



    public static void main(String[] args) {

        int pilihan; //Deklarasi nilai variabel menu yaitu 0 dengan tipe data integer

        Stack st = new Stack(); //Deklarasi st sebagai pengganti nilai stack

        do { 

            System.out.println("1.PUSH"); //Menampilkan output tulisan push saat di run

            System.out.println("2.POP"); //Menampilkan output tulisan pop saat di run

            System.out.println("3.Lihat isi data"); //Menampilkan output tulisan Lihat isi data saat di run

            System.out.println("4.KELUAR"); //Menampilkan output tulisan Keluar saat di run

            System.out.println("Masukkan pilihan :"); // Menampilkan output tulisan saat di run

            pilihan = input.nextInt(); //Menggunakan fungsi scanner pada variabel menu yang bertipe integer

            if (pilihan == 1) { //Kondisi diamana jika nilai pilihan sama dengan satu maka akan melakukan..

                Baju baru = new Baju(); //Deklarasi baru sebagai pengganti variabel baju

                baru.input(); //Variabel baru di mana mengembalikan nilai dari input

                st.push(baru); //Program melakukan perintah push pada data yang sudah diinput

            } else if (pilihan == 2) {

                st.pop(); //Kondisi jika memilih pilihan dua maka akan melakukan perintah pop

            } 

            else if (pilihan == 3) {

                st.display(); //Kondisi jika memilih pilihan tiga maka akan melakukan

            } 

            else if (pilihan == 4) {

                System.exit(0); //Kondisi di mana jika memilih pilihan 4 maka program selesai

            } else {

                System.out.println("pilihan tidak ada"); // Kondisi di mana jika memilih selain 4 pilihan maka akan muncul tulisan pilihan tidak ada

            }

        } while (pilihan != 0);

    }

}

