// write a program to reverse an array;
public class F {
    public static void main(String[] args) {
        int[] n={1,2,3,4,5};
        
        int l=0;int r=4;
        while(l<r){
            int temp=n[l];
            n[l]=n[r];
            n[r]=temp;
            l++;
            r--;
        }
        // below code is to print the reversed array
        for(int i=0;i<5;i++){
            System.out.print(n[i]+" ");
        }
    }

    }

