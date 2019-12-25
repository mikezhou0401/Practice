package main.webapp;

public interface StringBuffer {
    void append(String str); //追加字符串
    void append(char c);  //追加字符
    void insert(int pos, char b) throws MyStringBuffer.IndexIsOutofRangeException, MyStringBuffer.IndexIsNagetiveException; //指定位置插入字符
    void insert(int pos, String b) throws MyStringBuffer.IndexIsNagetiveException, MyStringBuffer.IndexIsOutofRangeException; //指定位置插入字符串
    void delete(int start) throws MyStringBuffer.IndexIsNagetiveException, MyStringBuffer.IndexIsOutofRangeException; //从开始位置删除剩下的
    void delete(int start, int end) throws MyStringBuffer.IndexIsNagetiveException, MyStringBuffer.IndexIsOutofRangeException; //从开始位置删除结束位置-1
    void reverse(); //反转
    int length(); //返回长度
}
