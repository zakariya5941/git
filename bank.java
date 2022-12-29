package bank;
import java.util.Scanner;

class Kotak
{
    
     int acc_no;
     int depo;
     int wid;
     int total;
     
     
     int acc_1 = 12345;
     int acc_2 = 67890;
     
     int bal_1 = 10000;
     int bal_2 = 20000;
        
        
    public void Deposit()
    {
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("  Enter Your Account No.    ");
        acc_no = sc.nextInt();
        
        
        
        if(acc_no==acc_1)
        {
            System.out.println("Your Balance is:   "+bal_1);
            
            
            System.out.println("Enter Amount To Deposit:   ");
            depo=sc.nextInt();
            
            total=depo+bal_1;
            System.out.println("Your Total Amount is:  "+ total);
            
        }
    
        
        else if(acc_no==acc_2)
        {
             System.out.println("Your Balance is:  "+bal_2);
              
            
            System.out.println("Enter Amount To Deposit:   ");
            depo=sc.nextInt();
            
            total=depo+bal_2;
            System.out.println("Your Total Amount is:  "+ total);
        }
    
       else
        {
            System.out.println("Wrong Input.........!!!!!");
        }
  
    
}
    
    public void Widthraw()
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("  Enter Your Account No.    ");
         acc_no = sc.nextInt();

        if(acc_no==acc_1)
        {
              
                 
            System.out.println("Your Balance is:   "+bal_1);
            
            
            System.out.println("Enter Amount To Widthraw:   ");
            wid=sc.nextInt();
            
            total=bal_1-wid;
            System.out.println("Your Total Amount is:  "+ total);
            
        }
        else if(acc_no==acc_2)
        {
              System.out.println("Your Balance is:  "+bal_2);
              
            
            System.out.println("Enter Amount To Widthraw:   ");
            wid=sc.nextInt();
            
            total=bal_2-wid;
            System.out.println("Your Total Amount is:  "+ total);
        }
         else
        {
            System.out.println("Wrong Input.........!!!!!");
        }
  
    
    }
        
}


public class Bank {

    
   
    public static void main(String[] args) {
        Kotak kt= new Kotak();
        
        
        char Type;
        
        System.out.println("  Deposit OR Widthraw (Enter d for Deposit and w for Widthraw):        ");
        Scanner sc = new Scanner(System.in);

        Type = sc.next().charAt(0);
        
        if(Type=='d')
        {
        kt.Deposit();
        }
        else if(Type=='w')
        {
            kt.Widthraw();
        }
    }
    
}
