package Program;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class baca_web {
    public void web (){
    String m = null;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    URLConnection koneksi =null;
    try {
        System.out.println("Masukan URL WEB (dengan htpp : ");
        String w = in.readLine();
        koneksi = new URL(w).openConnection();
        Scanner  s = new Scanner(koneksi.getInputStream());
        s.useDelimiter("\\Z");
        m=s.next();
    } catch (Exception e){
        e.printStackTrace();
    }
        System.out.println(m);
    }
}
