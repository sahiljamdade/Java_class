public class Getset{
   private int rollno;
   private String name;
   private int age;

   public int getRollno(){
    return rollno;
   }
   public void setRollno(int rollno){
    this.rollno=rollno;
   }
   public String getName(){
    return name;
   }
   public  void setName(String name){
    this.name=name;
   }
   public int getAge(){
    return age;
   }
   public void setAge(int age){
    this.age=age;
   }

    public static void main(String args[]){
      Getset g=new Getset();
      g.setRollno(40);
      System.out.println("Roll n0: "+g.getRollno());
      g.setName("Sahil Arjun jamdade");
      System.out.println("Name is: "+g.getName());
      g.setAge(21);
      System.out.println("Age is: "+g.getAge());
    }
}