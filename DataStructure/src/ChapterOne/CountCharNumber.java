package ChapterOne;
import java.util.HashMap;  
import java.util.Map;  
  
public class CountCharNumber {
	public  static void main(String args[]) {  
        String a="中国abcdefg12345678880ae中";  
        char []c=a.toCharArray();  //字符串转化为数组
        Map<String,Integer> m=new HashMap<String, Integer>(); //创建hashmap 
        for(int i=0;i<c.length;i++){  
            String cstr=String.valueOf(c[i]);  //字符数组转化为字符比较
            if(null!=m.get(cstr)){  
                int count=m.get(cstr); //如果map中已经存在，则计算它的数目
                m.put(cstr, count+1);  //并且把当前加入map，count值加1
            }else{  
                m.put(cstr,1);  //否则count值对应的是1
            }  
        }  
        System.out.println(m);  
    }  
}



