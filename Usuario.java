package panel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.time.LocalDate;

/**
 *
 * @author bryan
 */
class Usuario {
    
    
    
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String gender;
    private String isAlive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(String isAlive) {
        this.isAlive = isAlive;
    }

    private int age(){
        return LocalDate.now().getYear() - birthDay.getYear();
    }
    
    @Override
    public String toString() {
        return  id + ": " + lastName + ", " + firstName  + " - " + age() + " years old - " + gender + " - " + isAlive;
    }
    
    

    public Usuario(int id, String firstName, String lastName, LocalDate birthDay, String gender, String isAlive) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.isAlive = isAlive;
    }
}
