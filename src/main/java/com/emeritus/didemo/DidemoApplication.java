package com.emeritus.didemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DidemoApplication
	implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING UP THE APPLICATION");
		SpringApplication.run(DidemoApplication.class, args);
		LOG.info("SHUTTING DOWN THE APPLICATION");
	}

	@Override
	public void run(String... args){
		LOG.info("Executing: command line runner");
		for(int i=0; i< args.length; ++i){
			LOG.info("args[{}]: {}", i, args[i]);
		}
	}

}
