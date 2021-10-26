import java.util.*; //

class Main 
{
    public static void main( String [] args){
        Scanner uI = new Scanner(System.in);    //
      int l=0;
      int w=0;
        do{                                     //
        System.out.println("Please enter the length of your rectangle in cm");
        l = uI.nextInt();
        System.out.println("Please enter the width of your rectangle in cm");
        w = uI.nextInt();
        if(!(l>=1 && l<=5 && w>=1 && w<=5))
        check();
        }while(!(l>=1 && l<=5 && w>=1 && w<=5));         // && ||
        rectangle(l,w);                        //name(*param*s)
        }
    public static void rectangle(int l, int w){      //public static void Nameof|Method(*optional*=>parameters){}
        Scanner uI = new Scanner(System.in);
        System.out.println("The area of your rectangle is " +l*w+" cm");
    } 
    public static void check(){
        System.out.println("This is a mistake");
        System.out.println("Please enter the right numbers");
        System.out.println("The number should be between 1 and 5");
    }
}