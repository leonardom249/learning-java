public class AddTwoNumbers{
    public static void main(String[] args){
        System.out.println("Adding numbers example:");
        //declare variable and turn argument into an integer by using Integer.parseInt():
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a+b;
        System.out.println("Here's the output sum: " + sum);
    }
}