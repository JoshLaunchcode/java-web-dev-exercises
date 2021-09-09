package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSubject(){
        return subject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }

    public void setName(String aFirstName, String aLastName){
        this.firstName = aFirstName;
        this.lastName = aLastName;
    }

    public void setSubject(String aSubject){
        this.subject = aSubject;
    }

    public void setYearsTeaching(int aYearsTeaching){
        this.yearsTeaching = aYearsTeaching;
    }
}
