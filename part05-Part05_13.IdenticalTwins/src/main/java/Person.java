
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Person)){
            return false;
        }
        
        Person compPerson = (Person)compared;
        
        if(this.name.equals(compPerson.name) &&
            (this.birthday.equals(compPerson.birthday) &&
            (this.height == compPerson.height &&
            (this.weight == compPerson.weight)))){
            return true;
        }
        
        return false;
    }
}
