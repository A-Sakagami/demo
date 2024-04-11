package com.example;
/* クラス */
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    public String profession;

    /* コンストラクタ */
    public Person(String profession) {
        this.profession = profession;
    }

    /* その他のメソッドも定義できる。 */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
