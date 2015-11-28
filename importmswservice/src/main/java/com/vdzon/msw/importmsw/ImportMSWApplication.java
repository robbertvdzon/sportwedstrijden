package com.vdzon.msw.importmsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ImportMSWApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImportMSWApplication.class, args);
        System.out.println("APPLICATION IS STARTED IN "+new File(".").getAbsolutePath());

    }
}
