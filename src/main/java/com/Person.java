package com;
/* 抽象クラス */
public abstract class Person {
    
    /* 抽象メソッド:中身は継承先のクラスで柔軟に設定できるが、必ず定義しないといけない */
    abstract public String abstractMethod();

    private String firstName;
    private String lastName;
    private int age;
    public String profession;


    /* コンストラクタ　*/
    Person(String firstName, String lastName, int age, String profession){
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
