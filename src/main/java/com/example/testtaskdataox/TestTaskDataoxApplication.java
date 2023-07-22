package com.example.testtaskdataox;

import com.example.testtaskdataox.service.JobListingScraper;
import com.example.testtaskdataox.service.JobListingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestTaskDataoxApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestTaskDataoxApplication.class, args);
        JobListingService jobListingService = new JobListingScraper();
        jobListingService.scrapeAndSaveJobListings();
    }

}
