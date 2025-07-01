/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight in kilograms:");
        float weight = sc.nextInt();
        System.out.println("Enter the height in meters:");
        float height = sc.nextFloat();
        if(weight>0&&height>0){
            float bmi = (float)(weight/Math.pow(height,2));
            if(bmi<20){
                System.out.println("UnderWeight "+bmi);
            }else if(bmi>=20&&bmi<25){
                System.out.println("Healthy "+bmi);
            }else if(bmi>=25&&bmi<30){
                System.out.println("OverWeight "+bmi);
            }else if(bmi>=30){
                System.out.println("Obesity "+bmi);
            }
                
            }else{
                System.out.println("Enter only positive values");
            }
            
        }
    }
    
