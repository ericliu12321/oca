import java.util.function.*;

/*
interface Predicate<T> {
    boolean test(T t);
}
*/

public class A { 
    public static void main(String[] args) 
    { 
         Predicate<Integer> lessthan = (i) -> i < 18;  
       // Predicate<Integer> lessthan = (int i) -> i < 18;  	    
       // Predicate<Integer> lessthan = i -> i < 18;  
       // Predicate<Integer> lessthan = (i) -> { return i < 18;}  ;
        
        System.out.println(lessthan.test(10));  
    } 
} 

/*
() -> System.out.println("Zero parameter lambda");
(p) -> System.out.println("One parameter: " + p);
p->System.out.println("One parameter: " + p);
(p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
*/

//////////////////////////////////////////////

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
 
 
