/*------------------------------------------------------
My name: Connor Rendoth
My student number: 5963370
My course code: CSIT121
My email address: cjr033@uowmail.edu.au
Assignment number: 1
-------------------------------------------------------*/

public class Enrollment {
    public static void main(String[] args){
        //Subjects available
        Subject CSIT111 = new Subject("CSIT111", "Programming Fundamentals", 6);
        Subject CSIT113 = new Subject("CSIT113", "Problem Solving", 6);
        Subject CSIT114 = new Subject("CSIT114", "System Analysis", 6);
        Subject CSIT115 = new Subject("CSIT115", "Data Management and Security", 6);
        Subject CSIT121 = new Subject("CSIT121", "Object Oriented Design and Programming", 6);
        Subject CSIT127 = new Subject("CSIT127", "Networks and Communications", 6);
        Subject CSIT128 = new Subject("CSIT128", "Introduction to Web Technology", 6);
        Subject CSCI251 = new Subject("CSCI251", "Database Systems", 6);
        Subject CSCI235 = new Subject("CSCI235", "Advanced Programming", 6);
        Subject CSIT214 = new Subject("CSIT214", "IT Project Management", 6);
        Subject MATH221 = new Subject("MATH221", "Mathematics for Computer Science", 6);
        Subject CSCI203 = new Subject("CSCI203", "Algorithms and Data Structures", 6);
        Subject CSIT226 = new Subject("CSIT226", "Human Computer Interaction", 6);
        Subject CSIT314 = new Subject("CSIT314", "Software Development Methodologies", 6);
        Subject CSIT321 = new Subject("CSIT321", "Project", 12);
        Subject CSCI317 = new Subject("CSCI317", "Database Performance Tuning", 6);
        Subject INFO411 = new Subject("INFO411", "Data Mining and Knowledge Discovery", 6);
        Subject CSCI316 = new Subject("CSCI316", "Big Data Mining Techniques and Implementation", 6);
        Subject ISIT312 = new Subject("ISIT312", "Big Data Management", 6);
        Subject CSCI301 = new Subject("CSCI301", "Contemporary Topics in Security", 6);
        Subject CSCI262 = new Subject("CSCI262", "System Security", 6);
        Subject CSCI369 = new Subject("CSCI369", "Ethical Hacking", 6);
        Subject CSIT302 = new Subject("CSIT302", "Cybersecurity", 6);
        Subject CSCI361 = new Subject("CSCI361", "Crypography and Secure Applications", 6);
        Subject CSCI368 = new Subject("CSCI368", "Network Security", 6);
        Subject CSCI376 = new Subject("CSCI376", "Multicore and GPU Programming", 6);
        Subject CSCI236 = new Subject("CSCI236", "3D Modelling and Animation", 6);
        Subject CSCI336 = new Subject("CSCI336", "Interactive Computer Graphics", 6);
        Subject CSCI366 = new Subject("CSCI366", "Mobile Multimedia", 6);
        Subject CSCI356 = new Subject("CSCI356", "Game Engine Essentials", 6);
        Subject CSCI334 = new Subject("CSCI334", "Software Design", 6);
        Subject ISIT219 = new Subject("ISIT219", "Knowledge and Information Engineering", 6);
        Subject CSCI318 = new Subject("CSCI318", "Software Engineering Practices and Principles", 6);
        Subject ISIT315 = new Subject("ISIT315", "Semantic Web", 6);

        //Majors available
        Major bigData = new Major("Big Data");
        Subject[] bDataCores = {CSCI317, INFO411, CSCI316, ISIT312};
        bigData.addMCores(bDataCores);

        Major cyberSec = new Major("Cyber Security");
        Subject[] cyberSecCores = {CSCI301, CSCI262, CSCI369, CSIT302};
        cyberSec.addMCores(cyberSecCores);

        Major digitalSysSec = new Major("Digital System Security");
        Subject[] digitalSysSecCores = {CSCI361, CSCI262, CSCI368, CSCI376};
        digitalSysSec.addMCores(digitalSysSecCores);

        Major gameMobDev = new Major("Game and Mobile Development");
        Subject[] gameMobDevCores = {CSCI236, CSCI336, CSCI366, CSCI356, CSCI376};
        gameMobDev.addMCores(gameMobDevCores);

        Major softEng = new Major("Software Engineering");
        Subject[] softEngCores = {CSCI334, ISIT219, CSCI318, ISIT315};
        softEng.addMCores(softEngCores);

        //Adding Majors available in BCS Course
        Major[] BCSMajors = {bigData, cyberSec, digitalSysSec, gameMobDev, softEng};

        //BCS Course core subjects
        Subject[] cCores = {CSIT111, CSIT113, CSIT114, CSIT115, CSIT121, CSIT127, CSIT128, CSCI235, CSCI251, CSIT214, MATH221, CSCI203, CSIT226, CSIT314, CSIT321};

        //BCS Course elective subjects
        Subject[] cEles = {CSCI317, INFO411, CSCI316, ISIT312, CSCI301, CSCI262, CSCI369, CSIT302, CSCI361, CSCI368, CSCI376, CSCI236, CSCI336, CSCI366, CSCI356, CSCI334, ISIT219, CSCI318, ISIT315};

        Course bcs = new Course("Bachelor of Computer Science");
        bcs.addCores(cCores);
        bcs.addMajors(BCSMajors);
        bcs.addElectives(cEles);

    }
}
