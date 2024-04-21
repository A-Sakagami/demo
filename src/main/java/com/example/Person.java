package com.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String profession;

    /**
     * Personオブジェクトを初期化します。
     * 
     * @author @A-Sakagami
     * @param firstname 名前
     * @param lastname 姓
     * @param age 年齢
     * @param profession 職業
     */
    public Person() {

    }

    /* getter, setter（カプセル化） */
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
