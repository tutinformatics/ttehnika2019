package ee.veikosoomets.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello world";
    }
}
