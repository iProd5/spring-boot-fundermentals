package io.turntabl.springboot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class MathController {
    @Autowired
    private Maths newMaths;
@ApiOperation("add two integers")
    @GetMapping("/add")
    public Numbers add(
            @RequestParam(value="num1") String num1,
            @RequestParam(value="num2") String num2){
        Integer x = Integer.parseInt(num1);
        Integer y = Integer.parseInt(num2);
       // return new Numbers(x + y);
       return new Numbers(this.newMaths.add(x,y));
    }

    @ApiOperation("Subtract two numbers")
    @GetMapping ("/sub")
    public Numbers subtract(
            @RequestParam(value="num1") String num1,
            @RequestParam(value="num2") String num2){
        Integer x = Integer.parseInt(num1);
        Integer y = Integer.parseInt(num2);
        // return new Numbers(x - y);
       return  new Numbers(this.newMaths.substract(x,y));
    }

}
