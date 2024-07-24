public class Exam2 {
    public static void main(String[] args) {
        int[][]table=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                table[i][j]=j;
                table[j][i]=i;
            }

        }
        
    }
    
}
