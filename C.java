class A{
  public void fun1(double x){
   System.out.println(x + "int in A");
  }
  
}

class B extends A{
    public void fun2 (double x, double y){
        fun1(x);
        double sum= x/y;
        System.out.println(sum);
    }
}

public class C{
    public static void main (String[] args){
        B obj= new B();
        obj.fun2(3, 5);
    }
}