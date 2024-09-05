
import java.util.Scanner;

public class gcd_lcm{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int org1=n1;
        int org2=n2;
        while(n1%n2!=0)
        {
        int rem=n1%n2;
        n1=n2;
        n2=rem;
       
        } 
        //here number of gcd is=
        int gcd=n2;
        System.out.println("HCF of two num="+gcd);//print gcd
       // here lcm of the original number
        System.out.println("LCM of the two num=" +(org1*org2)/gcd);
        
    }
}