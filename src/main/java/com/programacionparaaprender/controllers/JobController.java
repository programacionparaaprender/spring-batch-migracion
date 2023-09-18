package com.programacionparaaprender.controllers;


public class JobController {
	
}

/*
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobExecutionNotRunningException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.batch.core.launch.NoSuchJobExecutionException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacionparaaprender.request.JobParamsRequest;
import com.programacionparaaprender.service.JobService;

@RestController
@RequestMapping("/api/job")
@CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 3600)
public class JobController {

	@Autowired
	JobService jobService;
	
	@Autowired
	JobOperator jobOperator;
	
	@GetMapping("/start/{jobName}")
	public String startJob(@PathVariable String jobName
			,@RequestBody List<JobParamsRequest> jobParamsRequestList) {
		jobService.startJob(jobName, jobParamsRequestList);
		return "Job Started...";
	}
	
	@GetMapping("/stop/{executionId}")
	public String stopJob(@PathVariable long executionId) {
		try {
			jobOperator.stop(executionId);
		} catch (NoSuchJobExecutionException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (JobExecutionNotRunningException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return "Job Stopped...";
	}
}
*/