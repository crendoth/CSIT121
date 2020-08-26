public class Major {
    //private Major attributes
    private String name; //name of Major
    private Subject[] subjectList; //Array of subjects in Major

    //public Major class constructor
    public Major(String name){
        this.name = name;
    }

    //public Major attribute setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSubjectList(Subject[] subjectList) {
        this.subjectList = subjectList;
    }

    //public Major attribute getters
    public String getName() {
        return name;
    }
    public Subject[] getSubjectList() {
        return subjectList;
    }

}
