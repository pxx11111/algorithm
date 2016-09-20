package erfen_chazhao;

public class Test {
public static void main(String[] args) {
	int[] str=new int[]{1,2,3,4,5,6,7,9};
	//System.out.println(digui(str,0,str.length-1,3));
	System.out.println(feidigui(str,9));
}
public static int digui(int[]array,int begin,int end, int key)
{
	if(begin<=end){
	int mid=(begin+end)/2;
	if(array[mid]==key)
	
		return mid;
	else if(array[mid]>key)
		
			return digui(array,0,mid-1,key);
		
	else if(array[mid]<key)
			return digui(array,mid+1,end,key);
		}
	return -1;
	}
public static int feidigui(int[] srcArray, int des) {
    int low = 0;
    int high = srcArray.length - 1;
 
    while ((low <= high) && (low <= srcArray.length - 1)
            && (high <= srcArray.length - 1)) {
        int middle = (high + low) >> 1;
        if (des == srcArray[middle]) {
            return middle;
        } else if (des < srcArray[middle]) {
            high = middle - 1;
        } else {
            low = middle + 1;
        }
    }
    return -1;
}
	}
        
	

