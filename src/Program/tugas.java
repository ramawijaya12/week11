package Program;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.*;
import java.util.Scanner;
public class tugas {
   

    public static void main(String[] args) throws Exception {
        int pilih;
        io i = new io();
        test t = new test ();
        baca_web bw = new baca_web();
        Scanner a = new Scanner(System.in);
        System.out.println("Menu Pilihan ");
        System.out.println("1. BufferedInputStream dan InputStream ");
        System.out.println("2. Membaca File Halaman Website ");
        System.out.println("3. Membaca file txt");
        System.out.println("Pilih : ");
        pilih=a.nextInt();
        switch (pilih){
            case 1:
             i.io();
             break;
            case 2 :
                bw.web();
                break;
             case 3 :
                t.read();
                t.write();
              break;
        
        }
    }
    
}
