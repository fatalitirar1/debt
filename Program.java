import java.util.Scanner;

public class Program {
       public static  void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           if (scanner.hasNext()) {
               String arg = scanner.next();
               System.out.println(arg);
           }
       }

}
