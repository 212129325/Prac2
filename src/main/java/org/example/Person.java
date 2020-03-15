package org.example;

public class Person {

    String name, surname;
    Boolean deadOrAlive;

    public Person(String name, String surname, Boolean deadOrAlive) {
        this.name = name;
        this.surname = surname;
        this.deadOrAlive = deadOrAlive;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Boolean getDeadOrAlive() {
        return deadOrAlive;
    }

    public void timeOut(){
        while(true){
            System.out.println("Running");
        }
    }

}
