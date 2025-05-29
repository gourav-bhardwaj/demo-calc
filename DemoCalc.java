import java.util.*;

class DemoCalc {

   public static void main(String[] args) {
       DemoCalc obj=new DemoCalc();
       obj.fkwerjkjad();
   }

    public int uiuigjbbubu() {
        Integer n1=0, n2=0, op=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number - 1::");
        n1=sc.nextInt();

        AGAIN:
        while(true) {
            System.out.println("Select any one operator name :: \n1. ADD\n2. SUBTRACT\n3. MULTIPLY\n4. DIVIDE");
            op=sc.nextInt();

            System.out.println("Enter second number");
            n2=sc.nextInt();

            switch(op){
                case 1:
                    n1=n1+n2;
                    break;
                case 2:
                    n1=n1-n2;
                    break;
                case 3:
                    n1=n1*n2;
                    break;
                case 4:
                    n1=n1/n2;
                    break;
                default:
                    System.out.println("invalid operator!!");
                    continue AGAIN;
            }
        }
        return n1;
    }

}
