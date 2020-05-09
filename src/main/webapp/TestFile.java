package main.webapp;

import java.io.*;

public class TestFile {



    public  void findJavaFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().contains(".java")) {
                     findContent(f);
                    }
                }
                if (f.isDirectory()) {
                    findJavaFile(f);
                }
            }
        }

    }

    public  boolean findContent(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("法国发过")) {
                    System.out.println("找到目标字符串" + "在文件" + f.getAbsolutePath());
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
