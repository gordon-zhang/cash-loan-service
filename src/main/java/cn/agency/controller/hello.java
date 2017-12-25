package cn.agency.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gordon on 17/12/25.
 */
@RestController
public class hello {
    @GetMapping("/hello")
    public String hello(){
        return "heell";
    }
}
