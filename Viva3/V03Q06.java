import java.util.Scanner;
import java.util.ArrayList;
public class PersonTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person> personlist = new ArrayList<>();
        
        while(true){
            int no = input.nextInt();
            input.nextLine();
            if(no==0){
                break;
            }
            String nama=input.nextLine();
            int age=input.nextInt();
            input.nextLine();
            Person p = new Person(nama,age);
            personlist.add(p);
        }
        Person P1 = new Person();
        P1.setName("Suherman");
        P1.setAge(30);
        
        Person P2 = new Person("Suherman", 30);
        Person P3 = new Person("Suherman", 30);
        Person P4 = new Person("Bahlil", 56);
        
        for(Person p: personlist){
            System.out.println("compare "+p.getName()+" with p2 "+p.compareTo(P3));
        }
        System.out.println("is it same P2 and P3?"+ P2.compareTo(P3));
        System.out.println("is it same P2 and P4?"+ P3.compareTo(P4));
        System.out.println(P1.compareTo(P3));
        
        try{
            P4.setAge(-9);
        } catch(IllegalArgumentException e){
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Total student:"+Person.getPersonCount());
    }
}
