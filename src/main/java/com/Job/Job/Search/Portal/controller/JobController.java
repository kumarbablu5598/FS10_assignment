package com.Job.Job.Search.Portal.controller;

import com.Job.Job.Search.Portal.model.Job;
import com.Job.Job.Search.Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class JobController {
    @Autowired
    JobService jobService;
    @GetMapping("getalljobs")
    public Iterable<Job>  getAllJobs(){
        return jobService.getAllJob();
    }
    @GetMapping("job/{Id}")
    public Job getjobById(@PathVariable Integer Id){
        return jobService.getJobById(Id);
    }
    @PostMapping("addjob")
    public String addjob(@RequestBody Job job){
        return jobService.addjob(job);
    }
    @PostMapping("addjobs")
    public String addjobs(@RequestBody List<Job> jobs){
        return  jobService.addjobs(jobs);
    }
    @PutMapping("update/{Id}")
    public String updateById(@PathVariable Integer Id,@RequestBody Job job){
        return jobService.UpdateById(Id,job);
    }
    @DeleteMapping("delete/{Id}")
    public String deleteById(@PathVariable Integer Id){
        return jobService.deleteById(Id);
    }

}
