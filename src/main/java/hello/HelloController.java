package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hej")
    public String index() {
        return "pozdrawiam Jawegiel";
    }
}
