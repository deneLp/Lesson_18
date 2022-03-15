package lesson18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Calculator{

    ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

    public int calculate(int arg1, String op, int arg2){
        int result;

        switch (op){
            case "+":{
                result = sum(arg1, arg2);
            }
            break;
            case "-":{
                result = subtract(arg1, arg2);
            }
            break;
            case "*":{
                result = multiply(arg1, arg2);
            }
            break;
            case "/":{
                result = divide(arg1, arg2);
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }
        return result;


    }

    private int sum(int arg1, int arg2){

        MultiplyProcessor multiplyProcessor = context.getBean(MultiplyProcessor.class);
        return multiplyProcessor.process(arg1, arg2);
    }

    private int subtract(int arg1, int arg2){
        SubtractProcessor subtractProcessor = context.getBean(SubtractProcessor.class);
        return subtractProcessor.process(arg1, arg2);

    }

    private int divide(int arg1, int arg2){
        DivideProcessor divideProcessor = context.getBean(DivideProcessor.class);
        return divideProcessor.process(arg1, arg2);

    }

    private int multiply(int arg1, int arg2){
        MultiplyProcessor multiplyProcessor = context.getBean(MultiplyProcessor.class);
        return multiplyProcessor.process(arg1, arg2);
    }

}
