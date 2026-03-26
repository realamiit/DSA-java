public class LearnAnonymous {

    public static void main(String[] args){

        // Anonymous class (class)
        Outerclass obj = new Outerclass(){
            @Override
            public void outerMethod(){
                System.out.println("Outer method overridden");
            }
        };

        obj.outerMethod();

        // Anonymous class (interface)
        SuperInterface obj2 = new SuperInterface(){
            @Override
            public void interfaceMethod(){
                System.out.println("Interface implemented");
            }
        };

        obj2.interfaceMethod();

        // Lambda
        WalkAble walkAble = (steps) -> {
            System.out.println("Walked " + steps + " steps");
            return steps;
        };

        walkAble.walks(5);

        // Short lambda
        WalkAble obj3 = (steps) -> 2 * steps;

        System.out.println(obj3.walks(8));
    }
}

interface WalkAble {
    int walks(int steps);
}

class Outerclass {
    public void outerMethod(){
        System.out.println("Original method");
    }
}

@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
}


//        ******output*******

// Walked 5 steps
// 16