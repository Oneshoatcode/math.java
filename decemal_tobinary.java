public class decemal_tobinary {
    public static void main(String[] args) {
        int n=57;
        int i=0;
        int l[]=new int[n];
        while(n>0){
            l[i]=n%2;
            n=n/2;
            i++;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(l[j]);
            
        }
    }
    
}
