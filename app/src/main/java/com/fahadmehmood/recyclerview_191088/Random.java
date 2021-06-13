package com.fahadmehmood.recyclerview_191088;

public class Random {
    String Name,Rollno,Department,Semester;

    public Random(String name, String rollno, String department, String semester) {
        Name = name;
        Rollno = rollno;
        Department = department;
        Semester = semester;
    }

    public String getName() {
        return Name;
    }

    public String getRollno() {
        return Rollno;
    }

    public String getDepartment() {
        return Department;
    }

    public String getSemester() {
        return Semester;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }
}
