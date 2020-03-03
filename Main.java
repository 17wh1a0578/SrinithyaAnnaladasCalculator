package epam.Calculator;
import java.util.*;
public class Main {
	
				public static void main(String[] args) throws Exception {
					int num1 = 0;
					int num2 = 0;
					calculator calci = new calculator();
					System.out.println("1.ADD(+)");
				    System.out.println("2.SUB(-)");
				    System.out.println("3.MUL(*)");
				    System.out.println("4.DIV(/)");
				    while(true){
			   	     System.out.println("SELECT OPTION");
			   	     Scanner sc= new Scanner(System.in);
			   	     int options = sc.nextInt();
			   	     if(options == 5){
			   	    	 System.out.println("Thank you");
			   	    	 break;
			   	     }
			   	     if ((options < 1) || (options > 5)) throw new Exception("please enter value");
			   	     System.out.println("enter number num1");
			   	     num1 = sc.nextInt();
			   	     System.out.println("enter number num2");
			   	     num2 = sc.nextInt(); 
			   	     int [] operations = {calci.add(num1,num2),calci.sub(num1,num2),calci.mul(num1,num2),calci.div(num1,num2)};  
			   	     System.out.println(operations[options-1]);
				    }
				}
			}
