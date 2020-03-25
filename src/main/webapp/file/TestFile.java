package main.webapp.file;

import java.io.File;

public class TestFile {
    private long maxSize;
    private long minSize=Long.MAX_VALUE;
    private File maxFile;
    private File minFile;
    private File dir;
    public  TestFile(String path){
        this.dir=new File(path);
        findMaxMinFile(this.dir);
    }
    private void findMaxMinFile(File dir){
        if(dir!=null&&dir.exists()) {
            if (dir.isFile()) {
                if (dir.length() > maxSize) {
                    maxSize = dir.length();
                    maxFile = dir;
                }
                if (dir.length() < minSize) {
                    minSize = dir.length();
                    minFile = dir;
                }
            } else {
                File[] nextDir = dir.listFiles();
                if (nextDir == null) {
                    return;
                }
                for (File f : nextDir) {
                    findMaxMinFile(f);
                }
            }
        }
    }

    public long getMaxSize() {
        return maxSize;
    }

    public long getMinSize() {
        return minSize;
    }

    public File getMaxFile() {
        return maxFile;
    }

    public File getMinFile() {
        return minFile;
    }

    public static void main(String[] args) {
        TestFile find=new TestFile("F:\\迅雷下载");
        System.out.println("最大的文件是："+find.getMaxFile().getAbsolutePath()+",其大小是"+find.getMaxSize()+"字节。");
        System.out.println("最小的文件是："+find.getMinFile().getAbsolutePath()+",其大小是"+find.getMinSize()+"字节。");
    }
}
