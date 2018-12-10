package Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
        
public class test{
    public void read () throws IOException{
        String t = null;
try {
    FileReader file = new FileReader ("H:/input.txt");
    BufferedReader buffer = new BufferedReader(file);
    while ((t = buffer.readLine())!=null){
        System.out.println(t);
    }
    buffer.close();
   }catch (FileNotFoundException e ){
    System.out.println("Tidak Ada ");
   } catch (IOException e ){
       e.printStackTrace();
   }
    
}
    public void write () throws IOException {
        BufferedReader  a = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter ("H:/write.txt");
            BufferedWriter wr = new BufferedWriter(fw);
            System.out.println("Masukan Kata : ");
            String kata =a.readLine();
            wr.write(kata);
            wr.close();
        }catch (IOException e){
            System.out.println("Eror File");
            e.printStackTrace();
        }
    } 
    
}

