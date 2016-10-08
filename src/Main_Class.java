
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Okan
 */
public class Main_Class {
    
    static Scanner input = new Scanner(System.in);
    static int n,m;
    static int g,t,u;
    
    public static void main(String[] args) {
        
        System.out.print("n : ");
        n = input.nextInt();
        System.out.print("m : ");
        m = input.nextInt();
        
        System.out.println();
        
        System.out.println("n\tm\tg\tt\tu");
        extended_gcd(n,m);
        
        System.out.println();
        
        System.out.format("t.n + u.m = (%d)*(%d) + (%d)*(%d) : %d",n,t,m,u,g);
        
        System.out.println();
        
    }
    
    public static void extended_gcd(int n,int m){
        int temp = 0;
        if (m == 0){
            g = n;
            t = 1;
            u = 0;
            System.out.format("%d\t%d\t%d\t%d\t%d",n,m,g,t,u);
            System.out.println();
        }
        else{           
            
            extended_gcd(m,n%m);
            
            
            
            try{
                temp = u;
                u = t-(n/m)*u;
                t = temp;
            }
            catch(ArithmeticException e){
                //
            }
            finally{
                System.out.format("%d\t%d\t%d\t%d\t%d",n,m,g,t,u);
                System.out.println();
            }
        }
        
        
        
        
        
    }
}
