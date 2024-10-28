public class practice{
    practice(int a,String b){
        System.out.println("Hello");
    }
    practice(){
        System.out.println("Hello from default constructor");
    }
    public static void main(String args[]){
     System.out.println("This is parameterized constructor");
     practice p=new practice(40,"sahil");
     practice p1=new practice();

    }
}