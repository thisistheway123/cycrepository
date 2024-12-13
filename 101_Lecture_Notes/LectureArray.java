/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5,7,1,5,3,5,234,333,8008,303030303,123};
        for(int i = 1;i<arr.length-1;i = i + 2){
            System.out.print(arr[i]+" "+arr[i+1]);
        }
	}
}