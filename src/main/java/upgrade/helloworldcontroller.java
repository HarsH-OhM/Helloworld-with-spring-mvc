package upgrad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloworldcontroller {

    @RequestMapping("/hellospring")
    public String helloSpring() {
        return "index";
    }

}

