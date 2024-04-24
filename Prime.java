import java.util.*;
public class Prime
  {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
      int number=s.nextInt();
      int c=0;
      if(number<1){
System.out.print("Not a prime number");}
        for(int i=1;i<=number/2;i++){
        if(number%i==0){
        c++;
        }
        }

        if(c>1){
          System.out.print("Not a prime no");
        }
        else{
          System.out.print("Prime no");
        }
        
      }
  }
