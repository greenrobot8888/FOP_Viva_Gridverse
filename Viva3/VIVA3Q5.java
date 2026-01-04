public class Person {
    private String name;
    private int age;
    private static final int DEFAULT_AGE = 18;
    private static int personCount = 0;
    public Person(){
        this.name = "unknown";
        this.age = DEFAULT_AGE;
        personCount++;
    }
    public Person(String name, int age){
        setName(name);
        setAge(age);
        personCount++;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
    public static int getPersonCount(){
        return personCount;
    }
    public boolean compareTo(Person other){
        if (other==null){
            return false;
        }
        return this.name.equals(other.name)&&this.age == other.age;
    }
}
