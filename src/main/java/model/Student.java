package model;

import java.util.Date;

public class Student extends Class implements GradeAVG {
    private int id;
    private String nameStudent;
    private Date dob;

    private double gradeToan;
    private double gradeVan;
    private double gradeAnh;

    public Student() {
    }

    public Student(int id, String nameClass, int studentId, String nameStudent, Date dob, double gradeToan, double gradeVan, double gradeAnh) {
        super(id, nameClass);
        this.id = studentId;
        this.nameStudent = nameStudent;
        this.dob = dob;
        this.gradeToan = gradeToan;
        this.gradeVan = gradeVan;
        this.gradeAnh = gradeAnh;
    }

    public int getStudentId() {
        return id;
    }

    public void setStudentId(int studentId) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getGradeToan() {
        return gradeToan;
    }

    public void setGradeToan(double gradeToan) {
        this.gradeToan = gradeToan;
    }

    public double getGradeVan() {
        return gradeVan;
    }

    public void setGradeVan(double gradeVan) {
        this.gradeVan = gradeVan;
    }

    public double getGradeAnh() {
        return gradeAnh;
    }

    public void setGradeAnh(double gradeAnh) {
        this.gradeAnh = gradeAnh;
    }

    @Override
    public double scoreAVG() {
        return (getGradeToan()+getGradeVan()+getGradeAnh())/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + id +
                ", nameStudent='" + nameStudent + '\'' +
                ", nameClass=" + getNameClass() +
                ", dob=" + dob +
                ", gradeToan=" + gradeToan +
                ", gradeVan=" + gradeVan +
                ", gradeAnh=" + gradeAnh +
                ", gradeAVG=" + scoreAVG() +
                '}';
    }
}

