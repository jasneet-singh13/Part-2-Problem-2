/**
 * Created by jnarula on 3/3/2017.
 */
public class Rotation {
    public void leftRotate(int arr[], int rotationNumber, int size){
        for (int i = 0;i<rotationNumber;i++){
            leftRotateByOne(arr,size);
        }
    }

    public void leftRotateByOne(int arr[], int size){
        int i,temp;
        temp = arr[0];
        for (i = 0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[i] = temp;
    }
    public void resultArray(int arr[], int size){
        for (int i = 0; i<size;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
