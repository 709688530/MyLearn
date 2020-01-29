package com.example.day06.task01;
/*
由于字符串是常量，被创建后，其长度和内容不在改变。若需要进行修改，只能创建新的字符串。
StringBuffer类和String类的最大区别是：StringBuffer长度和内容都可以改变。
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcd");//添加参数到StringBuffer对象中
        stringBuffer.insert(2, "vvv");//在字符串2的位置前中插入字符串“vvv”
        stringBuffer.deleteCharAt(2);//移除2位置的字符串
        stringBuffer.delete(4,5);//删除4-5范围内的所有字符串(不包括5位置)
        stringBuffer.replace(0,1,"qqq");//把0-1中所有的字符串用qqq替换(不包括1位置)
        stringBuffer.setCharAt(2,'o');//将2位置处的字符串用o替换(一换一)
        String s = stringBuffer.toString();//返回StringBuffer缓冲区中的字符串

        stringBuffer.reverse();//将此字符串反转并取代（qqobvvd------dvvboqq）

        System.out.println(s);
        System.out.println(stringBuffer);
    }
}
