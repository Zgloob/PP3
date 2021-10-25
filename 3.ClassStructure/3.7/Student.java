
/*6*/
class Student{
  String name;
  int semester;
  int studentId;
  int s;
  String course;
  int age;
  double averageGrade;
  boolean isIdValid;
  
  
  void sayHello(){
    System.out.println(name + "says Hello!");
    } ;
  void displayName(){
    System.out.println(name);
    };
  
  void displayAge(){
    System.out.println(age);
    };
  
  void studentInfo(){
    System.out.println(name + " " + semester + " " + averageGrade);
    };  
    
  public static void main(String[] args){
    Student s1 = new Student();
    s1.name = "John";
    s1.semester = 3;
    s1.studentId = 255876;
    s1.course = "CSE";
    s1.age = 21;
    s1.averageGrade = 3.53;
    Student s2 = new Student();
    s2.name = "Adam";
    s2.semester = 1;
    s2.studentId = 153876;
    s2.course = "CSE";
    s2.age = 20;
    Student s3 = new Student();
    s3.name = "Marlene";
    s3.semester = 4;
    s3.studentId = 255822;
    s3.course = "Economics";
    s3.age = 22;
    }
      
    
    
}
