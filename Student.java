import java.util.Date;

public class Student {
    //private Student attributes
    private String name;
    private int studentNo;
    private String sex;
    private Date dob;

    //Student constructor
    public Student(String name, int studentNo, String sex, Date dob){
        this.name = name;
        this.studentNo = studentNo;
        this.sex = sex;
        this.dob = dob;
    }

    //public attribute setters
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    //public attribute getters
    public String getName() {
        return name;
    }
    public int getStudentNo() {
        return studentNo;
    }
    public String getSex() {
        return sex;
    }
    public Date getDob() {
        return dob;
    }

}
