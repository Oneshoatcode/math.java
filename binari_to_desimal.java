public class binari_to_desimal {
public static void main(String[] args) {
    int n=101;
    int lastdig;
    int sum=0;
    while(n>0){
        lastdig=n%10;
        System.out.println(lastdig);
        sum+=Math.pow(2,lastdig);
        n=n/10;

    }
    System.out.println("your decemal num = "+sum);

}    
}
