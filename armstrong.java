import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    int n=sc.nextInt();
    int armstrong=0;
    int original=n;
    int lastdig;
    while(n>0){
    lastdig=n%10;
    System.out.println(lastdig);
    armstrong+=lastdig*lastdig*lastdig;
    n=n/10;
    }
    System.out.println(armstrong);
    if (armstrong==original) {
        System.out.println("number is arm strong");
    }
else{
    System.out.println("not armstrong");
}
    }
    
}
