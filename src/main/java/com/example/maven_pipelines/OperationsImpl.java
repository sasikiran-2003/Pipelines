package com.example.maven_pipelines;

public class OperationsImpl {
    public static void main(String[] args) {
        int add_result = Operations.add(100,25);
        System.out.println("Addition is: "+add_result);

        int sub_result = Operations.sub(100,25);
        System.out.println("Subtraction is: "+sub_result);
        
        int mul_result = Operations.mul(100,25);
        System.out.println("Multiplication is: "+mul_result);
        
        int div_result = Operations.div(100,25);
        System.out.println("Division is: "+div_result);
    }
}

class Operations {
    public static int add(int x,int y){ return (x+y); }
    public static int sub(int x,int y){ return (x-y); }
    public static int mul(int x,int y){ return (x*y); }
    public static int div(int x,int y){ return (x/y); }
}
