class Student {
    private String name;
    private int age;
    private int height;

    public Student() {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void  setAge(int){
	this.age=age;
	}
}

public class Lab20{
	public static void main(String[] args){
	Student anu=new Student();
	anu.setName("Pongal");
	anu.setAge(20);
	System.out.println("The name is:"+anu.getName());
	System.out.println("The age is: "+anu.getAge());
	}
}