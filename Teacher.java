package first;

public class Teacher {
	private int id;
	private String teacherName;
	private Course[] courses;
	//¹¹Ôìº¯Êı
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
