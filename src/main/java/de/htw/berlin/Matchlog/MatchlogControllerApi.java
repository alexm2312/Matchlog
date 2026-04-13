package de.htw.berlin.Matchlog;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MatchlogControllerApi {
    
    @GetMapping
    public String test(){
        return "Hello World";
    }
}
