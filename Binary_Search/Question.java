package Binary_Search;

public class Question {

  public static void main(String[] args) {

    int [] arr={1,2,5,7,8,12,15,20,25};
    int target=13;

    index_insert(arr, target);
    
    // int [] arr={1,2,3,3,3,3,4,8,12,15};
    // int target=3;

    // upperbound(arr, target);

    int left=0;
    int right=arr.length-1;

    while(left <= right){

      int mid=(left+right)/2;

      if(arr[mid]== target){

        if( mid != 0 && arr[mid-1]==target){
          right=mid-1;
        }
        else{
          System.out.println("index is found" + " " + mid);
        }
      }
      if(arr[mid]< target){
        left=mid+1;
      }
      else{
        right=mid-1;
      }

    }
  }

  public static void index_insert(int [] arr,int target){
    int left=0;
    int right=arr.length-1;
     while(left <= right){

      int mid=(left+right)/2;

      if(arr[mid]== target ){

        System.out.println("same value found  at index"+" " + mid);
      }

      if(arr[mid] > arr[left] && arr[mid ] < arr[right]){
        System.out.println("value place at the index of " + " " + right);
      }
      if(arr[mid]< target){
        left=mid+1;
      }
      else{
        right=mid-1;
      }
  }

  }

  // public static void upperbound(int [] arr,int target){
  //   int left=0;
  //   int right=arr.length-1;

  //   while(left <= right){

  //     int mid=(left+right)/2;

  //     if(arr[mid]== target){

  //       if( mid != arr.length-1 && arr[mid+1]==target){
  //         left=mid+1;
  //       }
  //       else{
  //         System.out.println("index is found" + " " + mid);
  //       }
  //     }
  //     if(arr[mid]< target){
  //       left=mid+1;
  //     }
  //     else{
  //       right=mid-1;
  //     }
  // }
  
}
