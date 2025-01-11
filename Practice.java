class A extends Thread{
	public void run(){
	for(int i=1;i<=10;i++){
	System.out.println(i);
	}
	}
}



public class Practice{
	public static void main (String[] args){
	Thread s =new A();
	s.start();
	}
}

