interface animal{
    
    void walk();
}

interface herbivore{
    int eye =2;
}

class Horse implements animal, herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}


public class interfac {
    public static void main(String[] args) {
        Horse h1= new Horse();
        h1.walk();
    }
    
}
