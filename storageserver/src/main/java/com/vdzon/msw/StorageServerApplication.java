package com.vdzon.msw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class StorageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageServerApplication.class, args);
        System.out.println("APPLICATION IS STARTED IN "+new File(".").getAbsolutePath());

    }
}
