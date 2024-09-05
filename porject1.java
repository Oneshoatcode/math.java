import java.util.*;
public class porject1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter size of pizza");
    char size=sc.next().charAt(0);
    sc.close();
    int bill=0;
    if(size=='s' ||size=='S'){
        bill+=100;
        System.out.println(bill);
    }
    else if (size=='m' || size=='M') {
        bill+=200;
        System.out.println(bill);
            }
            else if(size=='l' ||size=='L'){
                bill+=300;
                System.out.println(bill);
            }          
    
}
}
