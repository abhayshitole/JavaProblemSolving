import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int val = input.nextInt();
      while(input.hasNext()){
        int intValue = input.nextInt();
        int sum= 0;
        for(int i=1; i<=Math.sqrt(intValue);i++){
           if(intValue%i==0){
	        		sum=i+(intValue/i)+sum;	
	        	}
	     }
	        if((sum-intValue)==intValue){
            	System.out.println("YES");
            }  
            else{
            	System.out.println("NO");
            }

        }
    }
    }
