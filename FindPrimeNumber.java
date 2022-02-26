import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        int count =0;
        boolean falg=false;
        for(int i=1;i<=Math.sqrt(intValue);i++){
           if(intValue%i==0){
           count=count+2;
           }
            if(i==Math.sqrt(intValue)){
                count++;
            }
            
            if(count>2){
                break;
               
            }
        }

if(count==2){
    System.out.println("YES");
}
else{
    System.out.println("NO");
}
    
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    }
}
