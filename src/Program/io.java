package Program;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class io  {
    public void io() throws IOException{
    BufferedInputStream test = new BufferedInputStream(System.in);
        System.out.println("Masukan Huruf : ");
       try {
           InputStream input = new FileInputStream ("H://test.txt");
           BufferedInputStream buffer = new BufferedInputStream(input);
       int d = input.read();
       char a = (char) d;
       while (d !=-1) {
            System.out.print(a);
            d=input.read();
       }
        while (buffer.available()>0){
            char c = (char) buffer.read();
            System.out.print(c);
            }
        input.close();
       }
       catch (Exception e ){
       e.printStackTrace();
       
      }
    }   
    
}
