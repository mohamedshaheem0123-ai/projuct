import java.util.Scanner;
public class multiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter MUltiplication Table:");
        int table=sc.nextInt();
           int i=1;
        while (i<=10) { 
          System.out.println(i+"*"+table+"="+i*table);
          i++;
        }



    }
}