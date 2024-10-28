interface Multilevelinheritance{
    public void disp();
}
class animal implements Multilevelinheritance{

   public void disp(){
    System.out.println("This is multilevel inheritance");
   }

   public static void main(String args[]){
     animal a=new animal();
     a.disp();
   }
}