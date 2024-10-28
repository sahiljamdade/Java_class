public class vehicle{

   public String name;
   public int number;
   public vehicle(String name,int number)
   {
      this.name=name;
      this.number=number;
   }

   public void display()
   {
    System.out.println("name: "+name);
    System.out.println("number: "+number);
   }

    public static void main(String[] args){
       vehicle v=new vehicle("jawa",40);
       vehicle v2=new vehicle("duke",76);

       System.out.println("Bike details");
       v.display();
       System.out.println();

       System.out.println("Bike details");
       v2.display();
     

    }
}