package com.zhixiao.readclass;

public class Hello {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        String c = "abc";
        System.out.println(a + b + c + get3());
    }

    private static int get3() {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result ++;
        }
        return result;
    }
}
