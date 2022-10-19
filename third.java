import java.util.Scanner;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num = scan.nextInt();
        switch(num){
            case 0:
                System.out.println("this is 0");
                break;
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");
                break;
            case 3:
                System.out.println("This is 3");
                break;
            default:
                System.out.println("There is no number given");
        }
    }
}
