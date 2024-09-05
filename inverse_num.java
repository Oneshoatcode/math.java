public class inverse_num {
    public static void main(String[] args) {
        int n=21453;
        int orig_pos=1;
        int inv=0;
        while(n!=0){
            int orig_dig=n%10;
            int id=orig_pos;
            int inverse_pos=orig_dig;
            inv=inv+id*(int )Math.pow(10,inverse_pos-1);
            n=n/10;
            orig_pos++;
        }
        System.out.println(inv);
    }
    
}
