package org.launchcode.java.demos.Ch4Exercises.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private float yearsTeaching;

    public void setFirstName(String aName){
        this.firstName = aName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String aLastName){
        this.lastName = aLastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSubject(String aSubject){
        this.subject = aSubject;
    }

    public String getSubject(){
        return subject;
    }

    public void setYearsTeaching(float num){
        this.yearsTeaching = num;
    }

    public float getYearsTeaching(){
        return yearsTeaching;
    }
}
