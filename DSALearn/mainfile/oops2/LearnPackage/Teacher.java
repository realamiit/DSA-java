public class Teacher {

    public int teachingClass;

    private String id;

    public String getId() {
        return id;
    }

    String digree;  //default access modifier or package private

    protected int salary;  //protected access modifier


    public static void main(String[] args){
        Teacher obj = new Teacher();
        obj.teachingClass =12;
        // obj.id = 123;
    }



}
