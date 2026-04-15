class Student {
    private String name;
    private int rollNo;
    private String course;

    public void setdetails(String name,int rollNo,String course){
        this.name=name;
        this.rollNo=rollNo;
        this.course=course;
    }
    public void getdetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Course: "+course);
    }
}
public class gettersetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setdetails("raju",102,"Java");
        s1.getdetails();
    }
}
