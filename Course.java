public class Course {
    //private Course attributes
    private String name; //Course name
    private Subject[] coreSubList; //list of core subjects for course
    private Major[] majorsList; //list of majors available within the course
    private Subject[] electiveSubList; //list of elective subjects for course
    private int minCreditsReq; //minimum credits required for course completion

    //public course constructor
    public Course(String name){
        this.name = name;
    }

    //public Course attribute setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCoreSubList(Subject[] coreSubList) {
        this.coreSubList = coreSubList;
    }
    public void setMajorsList(Major[] majorsList) {
        this.majorsList = majorsList;
    }
    public void setElectiveSubList(Subject[] electiveSubList) {
        this.electiveSubList = electiveSubList;
    }
    public void setMinCreditsReq(int minCreditsReq) {
        this.minCreditsReq = minCreditsReq;
    }

    //public Course attribute getters
    public String getName() {
        return name;
    }
    public Subject[] getCoreSubList() {
        return coreSubList;
    }
    public Major[] getMajorsList() {
        return majorsList;
    }
    public Subject[] getElectiveSubList() {
        return electiveSubList;
    }
    public int getMinCreditsReq() {
        return minCreditsReq;
    }

}
