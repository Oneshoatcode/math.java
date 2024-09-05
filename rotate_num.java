public class rotate_num {
    public static void main(String[] args) {
      // System.out.println(2%3); 
       int n=12345;
       int temp=n;
       int k=5;

       int num_dig=0;
        while (temp>0) {
            temp=temp/10;
         num_dig++;   
    }
    k=k%num_dig;
    if(k<0){
        k=k+num_dig;
    }
    int div=1;
    int mul=1;
    for(int i=1;i<=num_dig;i++){
if(i<=k){
    div*=10;
}
else{
    mul*=10;
}
    }
    int q=n/div;
    int r=n%div;
    int res=r*mul+q;
    System.out.println(res);
        }
    
}
 