public class Person {
    private int age;
    private String name;

     boolean canBechanged = true;

     boolean canBeaccessed = false;

    public int getAge() {
        if (canBeaccessed); return age;
        return -1;
    }

    public void setAge(int age) {
        if (canBechanged){
            if (age > 0){
            this.age = age;
            }
        }   
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}