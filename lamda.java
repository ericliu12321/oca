import java.util.function.*;

/*
interface Predicate<T> {
    boolean test(T t);
}
*/

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        // ...
    }

    public void printPerson() {
        // ...
    }
}

class A {
	public static void main(String[] args) {
		printPersonsWithPredicate(roster,  p -> p.getAge() >= 18 );
		printPersonsWithPredicate(roster,  p -> p.getGender() == Person.Sex.MALE  );
		printPersonsWithPredicate(roster,  p -> p.getGender() == Person.Sex.MALE  && p.getAge() >= 18 && p.getAge() <= 25 );		
	}

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
	    for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	} 
 }
 
 