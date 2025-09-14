package webinar_13;

public class Dog {
    public static void main(String[] args) {

    }

    private String name;
    private int age;
    private double weight;
    private boolean isMale;

    public Dog() {
    }

    public Dog(String name, int age, double weight, boolean isMale) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
        else System.out.println("unknown");

//        if (name == null)
//            this.name = "unknown";
//        else
//            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30)
            this.age = age;
        else System.out.println("wrong age");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0 )
        this.weight = weight;
        else System.out.println("wrong weight");

    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isMale=" + isMale +
                '}';
    }
}
