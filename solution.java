import java.util.*;
class BRKBKS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int S=sc.nextInt();
            int w1=sc.nextInt();
            int w2=sc.nextInt();
            int w3=sc.nextInt();
            
            if(S>=(w1+w2+w3)){
                System.out.println("1");
            }else if(S>=(w1+w2) || S>=(w2+w3)){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }
    }
    
}
