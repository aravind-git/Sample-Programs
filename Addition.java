package sample;



public class Addition {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,6};
		int sum=0;
		Addition add=new Addition();
		add.sumUsingFor(arr);
		System.out.println(add.sumUsingRecursion(arr,arr.length-1,0));
		add.sumUsingWhile(arr);
	}
	public  void sumUsingFor(int arr[]){
	int sum=0;
		for(int i=0;i<arr.length;i++){
		sum+=arr[i];
	}
		System.out.println("Sum using for"+sum);
	}
	public  int sumUsingRecursion(int arr[],int n,int i){
		if(i<=n){
			return arr[i]+sumUsingRecursion(arr, n, ++i);
		}
		else{
			return 0;
		}
		
		
		
	}
	public void sumUsingWhile(int arr[]){
		int i = 0,sum =0 ;
		while(i<arr.length){
			sum+=arr[i];
			i++;
		}
		System.out.println("Sum using while"+sum);
		
	}
}
