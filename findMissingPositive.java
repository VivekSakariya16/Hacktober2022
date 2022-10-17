package DSA.sorting;

public class findMissingPositive {
    public static void main(String[] args) {
        int []ar={0,2,1};
        System.out.println(missedPositive(ar));
    }
    public static int missedPositive(int[] ar){
        int i=0;
        while (i<ar.length) {
            int coorectI = ar[i]-1;
            if(ar[i]<=ar.length&&ar[i]>0&&ar[coorectI]!=ar[i]){
                selectionSort.swap(ar,coorectI,i);
            }else {
                i++;
            }

        }
        for (int index = 0; index < ar.length ; index++) {
            if(ar[index]!=index+1){
                return index+1;
            }
        }
        return ar.length+1;
    }
}
