package cn.ilimhumar.springbootbook.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloController {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public  String  hello(){

        return  "Hello Spring boot book";
    }
}
