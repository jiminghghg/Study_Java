package pack02.exswitch;

public class EX02_For {
	public static void main(String[] args) {
		
		 //지역에 대한 이해도
		int sum = 0, oddSum=0 , evenSum=0;
		for(int i=0; i<=9; i++ ) {
			if(i%2==1) {
				oddSum +=i;
			} else {
				evenSum +=i;
			}
			sum=sum + i; 
			
			sum = sum + i;//sum+i;
}
	System.out.println("홀수의합(1~9) : "+oddSum);
	System.out.println("짝수의합(1~9): "+ evenSum);
	System.out.println();
		
		
	
	
	
	}

}
