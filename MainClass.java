class Check{
    private int amount=0;
    public int getAmount(){
     return amount;
    }
    public void setAmount(int amt){
     amount=amt;
    } 
  }
  public class MainClass{
    public static void main(String[] args){
     int amt=0;
     Check obj_variable_name= new Check();
     obj_variable_name.setAmount(200);
     amt=obj_variable_name.getAmount(); 
     System.out.println("Your current amount is: "+amt);
     }
  }