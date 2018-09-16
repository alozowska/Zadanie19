package pl.javastart.zadanie19;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PersonRepository {
    private List<Person> people;
    public PersonRepository(){
        people.add(new Person("Janek", 0)) ;
        people.add(new Person("Zosia", 0)) ;
        people.add(new Person("Basia", 0)) ;
    }
}
