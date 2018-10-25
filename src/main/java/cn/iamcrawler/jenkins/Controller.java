package cn.iamcrawler.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuliang on 2018/10/25.
 */
@RestController
@RequestMapping("/api/test")
public class Controller {
    @GetMapping
    public String aa(){
        return "aa";
    }
}
