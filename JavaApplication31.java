
package javaapplication31;

import java.util.Scanner;


public class JavaApplication31 {

   
    public static void main(String[] args) {
     Scanner sh=new Scanner(System.in);
    int a=sh.nextInt();
    int b=sh.nextInt();
    char operator=sh.next().charAt(0);
    
    switch(operator)
    {
        case '+' :
            System.out.println(a+b);
            break;
           
        case'-' :
            System.out.println((a-b));
            break;
               
        case'*' :
            System.out.println(a*b);
            break ;
            
        case '/' :
            System.out.println(a/b);
                    
                default :
                    System.out.println("error");
                
    }
        
    }
    
}
