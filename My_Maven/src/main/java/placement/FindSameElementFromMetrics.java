package placement;

public class FindSameElementFromMetrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {1,2,3,7};
		int[] array2= {1,6,2,5};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
			}
		}
	}

}
