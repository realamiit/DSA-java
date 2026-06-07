public class LearnGenerics {
    public static void main(String[]args){

        Human<String, String> H1 = new Human<>("Ayush123", "Laudaaa");

        Human<String, Integer> H2 = new Human<>("Ankit233",123);

        // Human<String> H3 = new Human<>("Yogesh123");

        // Human<Boolean> H4 = new Human<>(true);

        // Human<String> H5 = new Human<>("Navneet");

        Human<Integer,String> H6 = new Human<>(1234567,"amit");
    

        System.out.println(H1.getId());
        System.out.println(H2.getId());
        // System.out.println(H3.getId());
        // System.out.println(H4.getId());
        // System.out.println(H5.getId());
        System.out.println(H6.getId());

        
    }

}

class Human< H  , N> {

   H id;

   N name;

    public Human(H id , N name){
        this.id = id;
        this.name = name;
    }


    H getId(){
        return id;
    }

}