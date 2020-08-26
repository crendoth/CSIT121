public class Subject {
    //private Subject attributes
    private String name; //Subject name
    private String code; //Subject code
    private int credits; //Subject credit points

    //Subject constructor
    public Subject(String code, String name, int credits){
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    //public subject attribute setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //public subject attribute getters
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public int getCredits() {
        return credits;
    }

}
