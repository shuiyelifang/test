package ChapterOne;

public class InsertSort {
	public static void insertsort(int[] a)
	{
		int n=a.length;
		int temp =0;
		for(int i=1;i<n;i++)//外循环n-1次
		{
			temp =a[i];//把带插入元素放到temp中
			int j;
			for(j=i-1 ;j>=0;j--)//扫描有序表，寻找插入位置
			{
				/*比较带插入元素和有序表中i之前最大的元素,
				 *如果比最大的元素小，则把最大元素位置后移*/
				if(temp < a[j])
				{
					a[j+1]=a[j];
				}
				else 
					break;
			}
			a[j+1]=temp;//否则直接把带插入元素直接放入有序表中的最大位置
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51}; 
		 insertsort(a);
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	}

	

}
