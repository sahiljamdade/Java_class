abstract class Animal{
    abstract void display();

    public void show(){
        System.out.println("This is a concreate method of abstraction");
    }
}
class dog extends Animal{
    public void display(){
        System.out.println("This is a display method from a Abstract method");
    }
    public static void main(String args[]){
        System.out.println("Welcome to Abstraction");
        System.out.println();
        dog d=new dog();
        d.display();
        d.show();
    }
}