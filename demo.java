class demo{

	public static void main(String[]args){

		int num=468;
		int reverse=0;
		int n=100;
		int i;
		int no;
	
          for(i=0;i<3;i++)
	   {
		
		no=num%10;
	        reverse=reverse+no*n;
		num=num/10;
		n=n/10;
	
                
                
            }
		
      System.out.println(reverse);

	
	

	}


}
