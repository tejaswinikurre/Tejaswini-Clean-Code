import java.util.*;
class Interest{
    double p,t,r,si,ci;
    public Interest(double principle,double time,double rate){
        p=principle;
        t=time;
        r=rate;
    }
    double simpleCalci(){
       si = (p*t*r)/100;
       return si;
    }
    
    double compoundCalci(){
        ci=p*Math.pow((1+r/100),t);
        return ci;
    }
    void display(){
            
        System.out.printf("Simple Interest : %.2f\n",si);
        System.out.printf("Compound Interest : %.2f",ci);
    }
    
}
class InterestProgram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s","Principle Amount : ");
        double P=sc.nextDouble();
        System.out.printf("%s","Time(in years): ");
        double T=sc.nextDouble();
        System.out.printf("%s","Rate of Interest: ");
        double R=sc.nextDouble();
        Interest si =  new Interest(P,T,R);
        si.display();
    }
}