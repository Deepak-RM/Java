package Array;

public class reverse {
    public static void main(String args[]) {
        int arr[]={5,4,6,2,7,8,9};
        int s=0,e=arr.length-1;
        while (s<e) {
            int temp;
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s+=1;
            e-=1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}

   
