import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        new TwoDArray().ReverseArray();
    }


}
class TwoDArray{
    int arr[][]=new int[2][2];
    TwoDArray(){

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                Scanner sc=new Scanner(System.in);
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public void ReverseArray(){
        for(int i=1;i>=0;i--)
        {
            for(int j=1;j>=0;j--)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
