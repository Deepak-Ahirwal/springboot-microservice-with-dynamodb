package com.cts.microservices.messageretrievalservice.configuration;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

@Configuration
@EnableDynamoDBRepositories(basePackages = "com.cts.microservices.messageretrievalservice.repository")
public class DbConnectionConfig {

	@Value("${amazon.dynamodb.endpoint}")
	private String dBEndpoint;
 
	@Value("${amazon.dynamodb.region}")
	private String region;
 
	@Bean
	public AmazonDynamoDB amazonDynamoDB() {
		AmazonDynamoDB dynamoDB;
		 ProfileCredentialsProvider credentialsProvider;
		 try {
			 credentialsProvider = new ProfileCredentialsProvider();
			credentialsProvider.getCredentials();
		} catch (Exception e) {
			 throw new AmazonClientException(
	                    "Cannot load the credentials from the credential profiles file. " +
	                    "Please make sure that your credentials file is at the correct " +
	                    "location (C:\\Users\\...\\.aws\\credentials), and is in valid format.",
	                    e);
		}
		 
		 System.out.println(credentialsProvider.getCredentials().getAWSAccessKeyId());
		 System.out.println(credentialsProvider.getCredentials().getAWSSecretKey());
		 dynamoDB =  AmazonDynamoDBClientBuilder.standard()
				.withCredentials(credentialsProvider).withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(dBEndpoint, region))
	            .build();
		return dynamoDB;
	}

}
