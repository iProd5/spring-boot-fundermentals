package io.turntabl.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MathController {
    @RequestMapping ("/add")
    public Numbers add(
            @RequestParam(value="num1") String num1,
            @RequestParam(value="num2") String num2){
        Integer x = Integer.parseInt(num1);
        Integer y = Integer.parseInt(num2);
        return new Numbers(x + y);
    }
    @RequestMapping ("/sub")
    public Numbers subtract(
            @RequestParam(value="num1") String num1,
            @RequestParam(value="num2") String num2){
        Integer x = Integer.parseInt(num1);
        Integer y = Integer.parseInt(num2);
        return new Numbers(x - y);
    }

}
