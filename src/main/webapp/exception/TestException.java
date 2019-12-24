package main.webapp.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {
    public  static  void main (String[] args) throws FileNotFoundException {
        File f=new File("d:/LOL.exe");
        new FileInputStream(f);
    }
}
