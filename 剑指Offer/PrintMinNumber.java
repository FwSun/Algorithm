//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        /*if(numbers.length<=0) return "";
        for(int i=0;i<numbers.length;++i){
           for(int j=0;j<numbers.length-1-i;++j){
               int a = numbers[j];
               int b = numbers[j+1];
               if(compare(a,b)>0){
                   int temp = numbers[j];
                   numbers[j] = numbers[j+1];
                   numbers[j+1] = temp;
               }
           }
        }
        ArrayList<String>list = new ArrayList<String>();
        for(int i=0;i<numbers.length;++i)list.add(String.valueOf(numbers[i]));
        String str = "";
        for(int i=0;i<list.size();++i) str += list.get(i);
        return str;
        */
        if(numbers.length<=0) return "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numbers.length;++i){
            list.add(numbers[i]);
        }
        
        Collections.sort(list,new Comparator<Integer>(){
            //自定义比较两数大小的方法，以两数组合后哪个在前会导致合体数更小为比较标准
            public int compare(Integer a,Integer b){
                String aAndb = a+""+b;
                String bAnda = b+""+a;
                return aAndb.compareTo(bAnda);
            }
            
        });
         String ans = "";
        for(int i=0;i<list.size();++i) ans += list.get(i);
        return ans;

    }
    public int compare(int a,int b){
        //String i = String.valueOf(a);
        //String j = String.valueOf(b);
        String aAndb = a+""+b;
        String bAnda = b+""+a;
        return aAndb.compareTo(bAnda);
    }
}