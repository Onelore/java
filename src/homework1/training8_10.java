package homework1;

public class training8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int[][]randomlist=new int[4][4];
    for(int i=0;i<4;i++)
    {
    	for(int j=0;j<4;j++)
    		randomlist[i][j]=random();
    		
    }
    for(int i=0;i<4;i++)
    {
    	for(int j=0;j<4;j++)
    		System.out.print(randomlist[i][j]+"  ");
    	System.out.println("");
    }
    int[] maxrow=rowlist(randomlist);
    for(int i=0;i<4;i++)
    {
      System.out.print(maxrow[i]+" ");
    }
    System.out.println(" ");
    int maxrowindex=maxindex(maxrow);
    int[]maxcolumn=columnlist(randomlist);
    for(int i=0;i<4;i++)
	{
	  System.out.print(maxcolumn[i]+" ");
	}
    System.out.println("");
    int maxcolumnindex=maxindex(maxcolumn);
    System.out.println("the largest row index is "+maxrowindex+"\nlargest column index is "+maxcolumnindex);
    
	}
	public static int random()
	{
		int r=(int)(Math.random()*2);
		return r;
	}
	public static int []rowlist(int[][]a)
	{
		int []rowindex=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==1)
					rowindex[i]++;
			}
		}
		
		return rowindex;
	}
	public static int []columnlist(int[][]a)
	{
		int []columnindex=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j][i]==1)
					columnindex[i]++;
			}
		}
		
		return columnindex;
	}
	
	public static int maxindex(int[]list)
	{
         
         
		int maxindex=0;
		int maxrow=list[0];
		int temp;
		for(int i=1;i<list.length;i++)
		{
			
			if(list[i]>maxrow)
			{
				maxindex=i;
				
				temp=maxrow;
				maxrow=list[i];
				list[i]=temp;
				
			}
			
		}
		return maxindex;
	}

}
