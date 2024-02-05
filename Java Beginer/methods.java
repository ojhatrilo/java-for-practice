package tutorial.src;

public class methods {
      static void  practical(){
        System.out.println("Got executed");
    }

     public String add(){
        return ("i am talented");
    }

    public static void main(String[] args) {
    practical();
    methods world = new methods();
    String word = world.add();
        System.out.println(word);



    }
}

