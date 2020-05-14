package main.webapp.multiplethread;

import main.webapp.TestFile;

import java.io.File;
import java.io.FileReader;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());

        TestFile testFile = new TestFile();
        File file = new File("e:");


        while (testFile.findJavaFile(file)) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {

                }
            });
        }


    }
}