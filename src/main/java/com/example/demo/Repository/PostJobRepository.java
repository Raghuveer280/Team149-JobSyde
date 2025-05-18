package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.PostJob;

@Repository
public interface PostJobRepository extends CrudRepository<PostJob, Integer> {
	public List<PostJob> findByJobtitleIgnoreCase(String jobtitle);
	public List<PostJob> findByCompanyIgnoreCase(String company);
	public List<PostJob> findByPhn(String phn);
}
