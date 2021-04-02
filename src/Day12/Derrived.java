package Day12;

public class Derrived extends Base {

    public Derrived(){
       super(4);
        System.out.println("-----------Default constructor----------");
    }
    public Derrived(int a){
        super(a);

        System.out.println("-----------Argument constructor----------");
    }
}
