public class Book{

   public void display(){
       System.out.println("This is a Book named as Java");
   }


    public static void main(String args[]){
        System.out.println("Here access modifier is public so we have created object ");
        Book b=new Book();
        b.display();
        
    }
}