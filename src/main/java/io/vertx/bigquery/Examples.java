package io.vertx.bigquery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.testing.auth.oauth2.MockGoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

//import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.jackson2.JacksonFactory;

import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.vertx.bigquery.impl.BigQueryClientImpl;
import io.vertx.bigquery.model.Job;
import io.vertx.bigquery.model.JobConfiguration;
import io.vertx.bigquery.model.JobConfigurationLoad;
import io.vertx.bigquery.model.TableReference;
import io.vertx.core.Vertx;

public class Examples {
	public static void main(String[] args) throws IOException {
		Vertx vertx = Vertx.vertx();
		BigQueryOptions options = new BigQueryOptions();
		GoogleCredential mock = GoogleCredential.getApplicationDefault().createScoped(BigqueryScopes.all());
		
		options.setGoogleCredentialToken(mock.getAccessToken());
		
		BigQueryClientImpl client = new BigQueryClientImpl(vertx, options);
		TableReference table = new TableReference()
				.setProjectId("test-project")
				.setDatasetId("test-dataset")
				.setTableId("testTable");
		JobConfigurationLoad load = new JobConfigurationLoad()
				.setDestinationTable(table)
				.setSourceUris(ImmutableList.of("gs://test-bucket/table.csv"));
		JobConfiguration configuration = new JobConfiguration().setLoad(load);
		Job job = new Job().setConfiguration(configuration);
		client.insertJob("test-project", accept -> {
			if(accept.succeeded()) {
				System.out.println(accept.result().getId());
				}
			else {
				System.out.println(accept.cause());
				
			}
		}, job);

	}
}
