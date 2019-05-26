package com.sloan.jpegoptim;

import java.io.File;

public class JpegOptim {

    static {
        String path = System.getenv("jpegoptim");
        if (path == null || path.length() == 0) {
            path = new File(".").getAbsolutePath();
            if (path.endsWith(".")) {
                path = path.substring(0, path.length() - 1);
            }
        }
        System.load(path+"jpegoptim.dll");
    }

    public static void main(String[] args) {
        doExec("jpegoptim -d out -m 80 a.jpg");
    }

    public static void doExec(String args) {
        exec(args.replace(' ', '\0').getBytes());
    }

    private static native int exec(byte[] args);
}
