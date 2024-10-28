public class Singleinheritance{


    public void play(){
        System.out.println("I am playing Astronear game");
    }
}
class game extends Singleinheritance{

    public void disp(){
        System.out.println("Here is the Game ");
    }
    public static void main(String args[]){
        game g=new game();
        g.disp();
        g.play();
    }
}