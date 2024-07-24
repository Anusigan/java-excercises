public class Exam5 {
    public static void main(String[] args) {
        f(2,4);
    }
    public static void f(int x,int y){
        if(x<y){
            f(x,y-1);
            System.out.println(y);
            f(x+1,y);
        }
    }
    
}
