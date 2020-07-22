import java.util.*;
class Estimate
{
    int material;
    double area;
    int[] rate = new int[]{1200,1500,1800,2500};
 
    Estimate(int m,double a){
        material=m;
        area=a;
    }
    void display(){
        double cost = area*rate[material-1];
        System.out.println(cost);
    }
    
}
class HouseConstruction
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one from the given standars\n1.Standard material\n2.Above Standard material\n3.High Standard material\n");
        int material = sc.nextInt();
        System.out.println("Enter the area of lan(in sq feet : "));
        double area = sc.nextDouble();
        if(material==3){
            System.out.println("Do you want fully automated home?[y/n]");
            char ch = sc.next().charAt(0);
            if(ch=='Y' || ch=='y'){
                material=4;
            }
            
        }
        
        Estimate es = new Estimate(material,area);
        es.display();
        
    }
}