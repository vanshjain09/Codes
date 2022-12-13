import java.util.*;
class selectionSort{
    public static void main(String[] args) {
    int a[] ={5,4,3,2,1};
    selectionSortfunc(a,0);
    System.out.print(Arrays.toString(a));
    }
    public static int[] selectionSortfunc(int a[],int index){
        if(index==a.length-1) return a;
        int min,temp,i;
        min=index;
        for(i=index+1;i<a.length;i++){
            if(a[i]<a[min]) min=i;
            }
            temp=a[min];
            a[min]=a[index];
            a[index]=temp;
        return selectionSortfunc(a,index+1);
        }
    }
