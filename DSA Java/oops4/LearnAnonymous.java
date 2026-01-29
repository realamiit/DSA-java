public class LearnAnonymous{

    // class learninnerclass extends Outerclass{

    // }
    

    Outerclass obj = new Outerclass(){             //class
        void sing(){                         //method


        }
        public void outerMethod(){

        }
    };

    SuperInterface obj2 = new SuperInterface(){

        @Override
        public void interfaceMethod(){

        }
    };

    

    public static void main(String[] args){
       WalkAble walkAble = (int steps) ->{
        System.out.println("walked"+steps+"steps");
        return steps;
    };
    walkAble.walks(5);

    WalkAble obj2 = (int steps) -> 2*steps;
    
    System.out.println(obj2.walks(8));

    }
}


interface WalkAble{

    int walks(int steps);
}

class Outerclass{                                    //Class
    public void outerMethod(){        //Method

    }  
}

@FunctionalInterface
interface SuperInterface{
    void interfaceMethod();
}


//        output

// walked5steps
// 16