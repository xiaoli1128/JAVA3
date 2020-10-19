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
