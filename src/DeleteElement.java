import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int ele;
        System.out.println("enter element to delete");
        ele=sc.nextInt();
        DE obj=new DE();
        obj.remove(arr,ele);
    }
}
class DE{
    public void remove(int arr1[],int ele){
        //int flag=0;
        int n= arr1.length;
        for(int i=0;i<n;i++) {
                if (arr1[i]==ele) {
             //       flag = 1;
                    for (int j = i; j < n-1; j++) {
                        arr1[j] = arr1[j+1];
                    }
                    i--;
                    n--;
                }
            }
        for(int i=0;i<n;i++)
            System.out.println(arr1[i]);//("%d ",a[i]);
      //  System.out.println(Arrays.toString(arr1));
    }
}
