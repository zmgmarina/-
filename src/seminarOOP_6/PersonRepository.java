package seminarOOP_6;

import java.util.List;

public interface PersonRepository extends Repository<Person, Integer>{

    List<Person> getByAge(int age);

}
