class DrawRect1{
	public static void main(String[] args){
		int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}