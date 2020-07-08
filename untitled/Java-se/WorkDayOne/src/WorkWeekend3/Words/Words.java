package WorkWeekend3.Words;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Words {
    /**
     * 统计每个单词的出现次数，并按照格式输出
     * 单词1=xx次
     * 单词2=xx次
     * 单词3=xx次
     */
    public static final String words = "Shall I compare thee to a summer's day?\n"
            + "Thou art more lovely and more temperate:\n"
            + "Rough winds do shake the darling buds of May,\n"
            + "And summer's lease hath all too short a date:\n"
            + "Sometime too hot the eye of heaven shines,\n"
            + "And often is his gold complexion dimmed,\n"
            + "And every fair from fair sometime declines,\n"
            + "By chance, or nature's changing course untrimmed:\n"
            + "But thy eternal summer shall not fade,\n"
            + "Nor lose possession of that fair thou ow'st,\n"
            + "Nor shall death brag thou wand'rest in his shade,\n"
            + "When in eternal lines to time thou grow'st,\n"
            + "So long as men can breathe or eyes can see,\n"
            + "So long lives this, and this gives life to thee.";
    //根据 空格， \n , : , 内容进行拆分；
    //遍历拆分的数组，把遍历的字符串保存到Map中，作为key,单词的数量作为value;
    //
    public static void main(String[] args) {
        int count = 0;
        String[] split = words.split("|\\?|,|\\n|\\.|:");
        System.out.println(Arrays.toString(split));
        Map<String ,Integer> stringIntegerMap = new HashMap<>();
        for(String s : split){
            if(s.length() == 0 ){
                continue;
            }else if(stringIntegerMap.containsKey(s)){
                count ++;
                stringIntegerMap.put(s,stringIntegerMap.get(s)+1);
            }else {
                stringIntegerMap.put(s,1);
                count ++;
            }
        }
        System.out.println();
    }
}

