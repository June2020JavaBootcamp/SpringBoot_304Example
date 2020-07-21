package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    JobRepository jobRepository;

    @Override
    public void run(String... strings) throws Exception{
        Job job = new Job();
        job.setTitle("Programmer");
        job.setEmployer("Mont College");
        job.setDescription("entry level");
        job.setYears(3);
        job.setActive(true);

        Job job2 = new Job("Admin", "Mont College", "Manager", 1, true);

        jobRepository.save(job);
        jobRepository.save(job2);
    }
}
