package ChapterOne;
import java.util.HashMap;  
import java.util.Map;  
  
public class CountCharNumber {
	public  static void main(String args[]) {  
        String a="�й�abcdefg12345678880ae��";  
        char []c=a.toCharArray();  //�ַ���ת��Ϊ����
        Map<String,Integer> m=new HashMap<String, Integer>(); //����hashmap 
        for(int i=0;i<c.length;i++){  
            String cstr=String.valueOf(c[i]);  //�ַ�����ת��Ϊ�ַ��Ƚ�
            if(null!=m.get(cstr)){  
                int count=m.get(cstr); //���map���Ѿ����ڣ������������Ŀ
                m.put(cstr, count+1);  //���Ұѵ�ǰ����map��countֵ��1
            }else{  
                m.put(cstr,1);  //����countֵ��Ӧ����1
            }  
        }  
        System.out.println(m);  
    }  
}



