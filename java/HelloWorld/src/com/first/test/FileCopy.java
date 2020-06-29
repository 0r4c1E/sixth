package com.first.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try{
            // ./�� �����θ� �ǹ��մϴ�.
        	String dir = new File(".").getCanonicalPath() + "/src";
        	String path = new File(".").getCanonicalPath() + "/src/file.txt";
        	System.out.println(new File(".").getCanonicalPath());
            is = new FileInputStream(path);
            os = new FileOutputStream(dir+"/dest.file");

            int data = -1;
            while( (data = is.read()) != -1 ){
                os.write(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("���� ����");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("I/O ����");
            e.printStackTrace();
        }
        finally {
            // ���ܰ� �߻����� ���� ��Ʈ���� �ݾƾ� �ϹǷ� finally���� ��Ʈ���� �ݾ��ݴϴ�.
            try {
                if( is != null ){
                  is.close();  
                }
                if( os != null ){
                    os.close();
                }
            }
            catch ( IOException e){
                e.printStackTrace();
            }
        }
    }
}