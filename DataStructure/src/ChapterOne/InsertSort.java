package ChapterOne;

public class InsertSort {
	public static void insertsort(int[] a)
	{
		int n=a.length;
		int temp =0;
		for(int i=1;i<n;i++)//��ѭ��n-1��
		{
			temp =a[i];//�Ѵ�����Ԫ�طŵ�temp��
			int j;
			for(j=i-1 ;j>=0;j--)//ɨ�������Ѱ�Ҳ���λ��
			{
				/*�Ƚϴ�����Ԫ�غ��������i֮ǰ����Ԫ��,
				 *���������Ԫ��С��������Ԫ��λ�ú���*/
				if(temp < a[j])
				{
					a[j+1]=a[j];
				}
				else 
					break;
			}
			a[j+1]=temp;//����ֱ�ӰѴ�����Ԫ��ֱ�ӷ���������е����λ��
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
