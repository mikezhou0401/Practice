package main.webapp;

public class MyStringBuffer implements StringBuffer {
    String str;
    @Override
    public void append(String str) {
        this.str=str;
    }

    @Override
    public void append(char c) {
        this.str+=str;
    }

    @Override
    public void insert(int pos, char b) {
            this.str=str.substring(0,pos)+b+str.substring(pos);
    }

    @Override
    public void insert(int pos, String b) {
        this.str=str.substring(0,pos)+b+str.substring(pos);
    }

    @Override
    public void delete(int start) {
              this.str = str.substring(0,start);
    }

    @Override
    public void delete(int start, int end) {
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
}
