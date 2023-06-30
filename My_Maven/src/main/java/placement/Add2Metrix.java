package placement;


public class Add2Metrix {

	public static void main(String[] args) {
		
		int[][]a= {{3,4,5},{5,6,7},{3,4,5}};
		int[][]b= {{1,2,3},{5,6,7},{3,4,5}};
		int i,j;
		int c[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
 

	}

}
