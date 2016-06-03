package ChapterOne;

public class BubbleSort {
	public static void bubbleSort(int[] a)
	{
		int n=a.length;
		for(int i=1;i<n;i++)//i表示比较趟数
		{
			boolean flag=false;
			//从后往前比较，先比较每一行的后面的，i之前的都被拍好顺序
			for(int j=n-1;j>=i;j--)//进行第I趟排序
			{
				if(a[j]<a[j-1])//如果查找到存在问题，对其进行正确排序
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					flag=true;
				}
			}
			if(flag==false) return;
			System.out.print("第"+i+"次排序为：");
			for(int m=0;m<n;m++)
			{
				System.out.print(a[m]+"\t");
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51}; 
		 bubbleSort(a);
		/* for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }*/
	}

}
