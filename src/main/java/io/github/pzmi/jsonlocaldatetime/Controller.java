package io.github.pzmi.jsonlocaldatetime;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @PostMapping("/")
    public SomethingWithDate post(@RequestBody SomethingWithDate somethingWithDate) {
        return somethingWithDate;
    }
}
