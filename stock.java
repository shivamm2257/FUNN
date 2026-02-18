package stock;
interface Animal{

   public void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class stock {
    public  static  void  main(String  args[]){
        Horse hourse = new Horse ();
       hourse.walk();

    }
} 
