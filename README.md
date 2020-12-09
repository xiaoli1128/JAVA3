# JAVA3
Java课程作业项目仓库
实验目的

初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法 ；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

业务要求 
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。

对象示例：	
人员（编号、姓名、性别）
教师（编号、姓名、性别、所授课程、）
学生（编号、姓名、性别、所选课程
课程（编号、课程名称、上课地点、时间、授课教师）

实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

核心代码
package first;

public class Course {
	String id;
	String name;
	public int course;
	public Course(String name){
		this.id=id;
		this.name=name;
	}
	public void ChangeId(int a){
		this.id=a;
	}
	public Course(){
		
	}
}
package first;

public class Student {
	int id;
	String name;
	public Student(int num,String name){
		this.id=num;
		this.name=name;
	}
	public Student(){
	}
	public int compare(Student aa,Student bb){
		if(aa.id>bb.id) return 1;
		if(aa.id<bb.id) return -1;
		return 1;
	}

}
package first;

public class Teacher {
	private int id;
	private String teacherName;
	private Course[] courses;
	//¹¹Ôìº¯Êý
	public Teacher(){
		super();
		courses=new Course[3];
	}
	public Teacher(int id,String teacherName){
		this.id=id;
		this.teacherName=teacherName;
		courses=new Course[3];
	}
	

}
实验感想
初步掌握了面向对象的类设计方法（属性、方法）掌握类的继承用法，通过构造方法实例化对象；对于extends继承函数也有了初步的了解。
