package main.webapp;

public class MyStringBuffer implements StringBuffer {
    String str;

    public MyStringBuffer(String str) {
        append(str);
    }

    @Override
    public void append(String str) {
        this.str=str;
    }
    @Override
    public void append(char c) {
        this.str+=str;
    }
    @Override
    public void insert(int pos, char b) throws IndexIsNagetiveException ,IndexIsOutofRangeException {

            this.str=str.substring(0,pos)+b+str.substring(pos);

        if(pos<0){
            throw  new IndexIsNagetiveException ("下标为负数");
        }
        if(pos>this.length()){
            throw  new IndexIsOutofRangeException("下标越界");
        }
//        if(null==b){
//            throw  new IndexIsOutofRangeException("下标越界");
//        }
    }

    @Override
    public void insert(int pos, String b) throws IndexIsNagetiveException, IndexIsOutofRangeException {

        if(pos<0){
            throw  new IndexIsNagetiveException ("下标为负数");
        }
        if(pos>this.length()){
            throw  new IndexIsOutofRangeException("下标越界");
        }
        if(null==b){
            throw  new NullPointerException("空指针");
        }
        this.str=str.substring(0,pos)+b+str.substring(pos);
    }

    @Override
    public void delete(int start) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        if(start<0){
            throw  new IndexIsNagetiveException ("下标为负数");
        }
        if(start>this.length()){
            throw  new IndexIsOutofRangeException ("下标越界");
        }
              this.str = str.substring(0,start);
    }

    @Override
    public void delete(int start, int end) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        if(start<0 || end<0){
            throw  new IndexIsNagetiveException ("下标为负数");
        }
        if(start>this.length()  || end>this.length() || start>=end ){
            throw  new IndexIsOutofRangeException ("下标越界");
        }
        this.str= str.substring(0,start)+ str.substring(end);
    }

    @Override
    public void reverse() {
        for(int i=0;i<str.length()/2;i++){
            char tmp;
            tmp=str.toCharArray()[i];
            str.toCharArray()[i]=str.toCharArray()[str.length()-i-1];
            str.toCharArray()[str.length()-i-1]=tmp;
        }
        this.str=str;
    }

    @Override
    public int length() {
       return   this.str.length();
    }

    class  IndexIsNagetiveException extends Exception{
        public  IndexIsNagetiveException(){

        }
        public  IndexIsNagetiveException(String msg){
            super(msg);
        }
    }

    class  IndexIsOutofRangeException  extends Exception{
        public  IndexIsOutofRangeException (){
        }
        public  IndexIsOutofRangeException (String msg){
            super(msg);
        }
    }

    public  static  void main(String[] args){
        String  str="sd";
        MyStringBuffer sb=new MyStringBuffer("123456");
        try{
            sb.insert(-1,str);
        } catch (Exception e) {
            System.out.println("有错误");
            e.printStackTrace();
        }


    }
}
