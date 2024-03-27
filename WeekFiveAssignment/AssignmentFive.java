import java.util.Arrays;
public class AssignmentFive{
    public static void main(String [] args){
        forMethod();
        doMethod();
        whileMethod();
        wholeMethod();
        naturalMethod();
        pattern();
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        }
        
        
        
    
    public static void forMethod(){
        for(int i=1;i<=10;i++){
            int series = i * 2;
            System.out.print(series);
            if(i !=10){
                System.out.print(",");
            }else{
                System.out.println(".");
            }
        }
    }
    public static void doMethod(){
        int i=1;
        do{
            int series = i*2;
            System.out.print(series);
            if(i != 10){
                System.out.print(",");
            }else{
                System.out.println(".");
            }
            i++;
        }while(i<=10);
    }
    public static void whileMethod(){
        int i =1;
        while(i<=10){
            int series = i *2;
            System.out.print(series);
            i++;
            if(i!=10){
                System.out.print(",");
            }else{
                System.out.println(".");
            }
        }
        
    }
    public static void wholeMethod(){
        for(int i = 1; i<=10;i++){
            double square = Math.sqrt(i);
            System.out.println("The square root of " + i + " is " +square);
        }
        
    }
    public static void naturalMethod(){
        int i =1;
        do{
            double square = Math.sqrt(i);
            double finalSquare = square + square;
            System.out.println("The square root of given natural number " + i + " is " + finalSquare);
            i++;
        }while(i<=10);
    }
    public static void pattern(){
        int rows = 4;
        for( int i =0;i < rows; i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
        }
    }
    public static void pattern1(){
        
        for(int i =0; i <= 5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for(int i =1; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        for(int i =5;i>0;i--){
            for(int j = 0; j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        for(int i =1;i<=5;i++){
            for(int j =5;i<=j;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern5(){
        int i =1;
        do{
            int j=5;
            do{
                System.out.print(i);
                j--;
            }while(i<=j);
            System.out.println();
            i++;
            
        }while(i<=5);
    }
    public static void pattern6(){
        int i =0;
        do{
            int j=0;
            do{
                System.out.print(i);
                j++;
            }while(j<i);
            System.out.println();
            i--;
        }while(i>0);
    }
    public static void fabonassi(){
        
    }
}
