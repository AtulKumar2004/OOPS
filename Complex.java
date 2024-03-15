// L14 Q1
import java.util.*;
public class Complex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entering the first complex number");
        System.out.print("Enter its real part first: ");
        int cr1=sc.nextInt();
        System.out.print("Enter its imaginary part: ");
        int ci1=sc.nextInt();
    
        System.out.println("Entering the second complex number");
        System.out.print("Enter its real part first: ");
        int cr2=sc.nextInt();
        System.out.print("Enter its imaginary part: ");
        int ci2=sc.nextInt();
        sum(cr1,cr2,ci1,ci2);
        difference(cr1,cr2,ci1,ci2);
        product(cr1,cr2,ci1,ci2);
    }
    public static void sum(int cr1,int cr2,int ci1,int ci2){
        int sumofreal=cr1+cr2;
        int sumofimag=ci1+ci2;
        System.out.println("sum = "+sumofreal+" + "+sumofimag+"i");
    }
    public static void difference(int cr1,int cr2,int ci1,int ci2){
        int diffofreal=cr1-cr2;
        int diffofimag=ci1-ci2;
        System.out.println("difference = "+diffofreal+" + "+diffofimag+"i");
    }
    public static void product(int cr1,int cr2,int ci1,int ci2){
        int pr1=cr1*cr2;
        int pr2=ci1*ci2;
        int pr3=cr1*ci2;
        int pr4=ci1*cr2;
        int s1=pr1-pr2;
        int s2=pr3+pr4;
        System.out.println("product = "+s1+" + "+s2+"i");
    }
}