package com.github_action.CI.CD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    @GetMapping("/welcome")
    public String Welcome() {
        return "SpringBoot Is Cool";
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
//echo "# CI-CD-with-SpringBoot" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/SyedAdnan009/CI-CD-with-SpringBoot.git
//git push -u origin main