package ChapterOne;

public class BubbleSort {
	public static void bubbleSort(int[] a)
	{
		int n=a.length;
		for(int i=1;i<n;i++)//i��ʾ�Ƚ�����
		{
			boolean flag=false;
			//�Ӻ���ǰ�Ƚϣ��ȱȽ�ÿһ�еĺ���ģ�i֮ǰ�Ķ����ĺ�˳��
			for(int j=n-1;j>=i;j--)//���е�I������
			{
				if(a[j]<a[j-1])//������ҵ��������⣬���������ȷ����
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					flag=true;
				}
			}
			if(flag==false) return;
			System.out.print("��"+i+"������Ϊ��");
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
