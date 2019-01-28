//If a class doesn't define a constructor, the compiler will add a default, no-arg constructor. the default constructor 
//will set all the primitive to their default value.

class Employee {
  String name;
  int age;
  Employee(int age, String name) {
    this.age=age;
    this.name=name;
  }
}

class Office {
  public static void main(String[] args) {
    Employee emp=new Employee();   //wont compile.
  }
}
    
