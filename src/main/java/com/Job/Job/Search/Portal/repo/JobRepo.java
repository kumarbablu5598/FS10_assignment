package com.Job.Job.Search.Portal.repo;

import com.Job.Job.Search.Portal.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends CrudRepository<Job,Integer> {
}
