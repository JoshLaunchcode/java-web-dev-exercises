package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;


public class Course {
    private int classId;
    private String className;
    private ArrayList<Student> studentList;

    public int getClassId(){
        return classId;
    }

    public String getClassName(){
        return className;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setClassId(int aClassId){
        this.classId = aClassId;
    }

    public void setClassName(String aClassName){
        this.className = aClassName;
    }

    public void setStudentList(ArrayList<Student> aStudentList){
        this.studentList = aStudentList;
    }
}
