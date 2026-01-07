public class missingNumber {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5};
        int n= 5;
        int sum=1;
        for(int i =1;i<arr.length;i++) {
            sum=sum+arr[i];

        }
        int total = n*(n+1)/2;
        System.out.println("missing number:"+(total-sum));

    }
}
