package com.example.inflearndesignpattern._03_behavioral_patterns._22_template._03_after_template_callback;


public class Client {

    public static void main(String[] args) {
        FileProcessorWithTemplateCallBack templateCallBack = new FileProcessorWithTemplateCallBack("number.txt");
        //방법1: Anonymous Inner Class
        int result1 = templateCallBack.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result += number;
            }
        });
        System.out.println("result1 = " + result1);

        //방법2: Lambda Expression
        int result2 = templateCallBack.process((result, number) -> result += number);
        System.out.println("result2 = " + result2);

        //방법3: Class implements Interface
        int result3 = templateCallBack.process(new Plus());
        System.out.println("result3 = " + result3);
    }
}
