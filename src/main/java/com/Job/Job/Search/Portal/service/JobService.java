package com.Job.Job.Search.Portal.service;

import com.Job.Job.Search.Portal.model.Job;
import com.Job.Job.Search.Portal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;
    public Iterable<Job> getAllJob(){
        return jobRepo.findAll();
    }
   public Job getJobById(Integer Id){
        return  jobRepo.findById(Id).get();

   }
   public String addjob( Job job){
        jobRepo.save(job);
        return  "job added ";
   }
   public String addjobs(List<Job> jobs){
        jobRepo.saveAll(jobs);
        return "added list of jobs ";
   }
   public String deleteById(Integer Id) {
       jobRepo.deleteById(Id);
       return "deleted " + Id;
   }

   public String UpdateById(Integer Id,Job job){
        Job job1 = getJobById(Id);
        job1.setJobType(job.getJobType());
        job1.setTitle(job.getTitle());
        job1.setDescription(job.getDescription());
        job1.setLocation(job.getLocation());
        job1.setSalary(job.getSalary());
        job1.setCompanyEmail(job.getCompanyEmail());
        job1.setCompanyName(job.getCompanyName());
        job1.setEmployerName(job.getEmployerName());
        job1.setJobType(job.getJobType());
        job1.setAppliedDate(job.getAppliedDate());
        if(job1 !=null) return "updated "+Id;
        else return "Unable to update";
   }
}
