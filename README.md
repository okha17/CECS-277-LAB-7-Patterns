# CECS-277-LAB-7-Patterns
CECS 277
LAB ASSIGNMENT 7
Assigned date: 10/29
Due date: 11/8
30 points

1. Adapter pattern
//interface NameInterface
interface NameInterface {
public void setName(String n);

public String getName();
}

//Adaptee class
class SimpleName implements NameInterface {
String name;

public void setName(String n) {
name = n;
}

public String getName() {
return name;
}
}

//Target interface
interface FullNameInterface {
public void setFirstName(String f);

public void setLastName(String l);

public String getFirstName();

public String getLastName();
}
 

a. Create an adapter to convert the interface NameInterface to FullNameInterface
b. Write a main method test the adapter.
