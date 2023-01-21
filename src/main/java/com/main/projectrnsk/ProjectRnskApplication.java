package com.main.projectrnsk;

import com.main.projectrnsk.models.Admonition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ProjectRnskApplication {

    public static void main(String[] args) {

//        SpringApplication.run(ProjectRnskApplication.class, args);
        Admonition admonition = new Admonition("1","2",3,"4","5","6","7","asd","1/1/1/1","2","1");

    }

}
