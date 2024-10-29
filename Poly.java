public class Poly{

    public String name(String a,String b){
        
         return "Welcome to springboot";
    
    }

    public String name(int a){
        System.out.println("Hello sahil");
        return "completed";
    }
    public String name(String j,int b){

        return "compile time polymorphism";
    }

    public static void main(String args[]){
       Poly p=new Poly();
       System.out.println(p.name("sahil ","jamdade"));
       System.out.println(p.name(40));
       System.out.println(p.name("session",1));
    
    }
}