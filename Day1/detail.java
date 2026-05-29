package Day1;

public class detail {
    String name;
    int age;
    double cgpa;

    void features() {
        System.out.println("meraa name " + name + "mera age " + age + "mera CGPA overall" + cgpa + " hai thanku");
    }

    public static void main(String[] args) {
        detail s = new detail();

        s.name = "Amit";
        s.age = 22;
        s.cgpa = 8.8;

        s.features();

    }
}
