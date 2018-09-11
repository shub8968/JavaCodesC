import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
       
        if(n==0){
           return 0;
        }
            else if(n==1){
               return 1;
           }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
        
    }
      
public static int prime (int n){
    int k = (n/2);
    List <Integer> l = new ArrayList <> ();
    l.add(2);
    
    for (int i = 3; i <= 1000 ;i++)
    {
        for(int j = 2; j< i ; j++){
            if(i%j==0){
                j = i;
            }
            else{
                int f=0;
                f=j;
                if(f+1==i){
                 l.add(i); 
                }
            }
            }
        
        }
        
        
    return l.get(k-1);
    
}
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if(n%2==0)
        System.out.println(prime(n));  
        else
        System.out.println(fibonacci((n/2)+1));
    }
}