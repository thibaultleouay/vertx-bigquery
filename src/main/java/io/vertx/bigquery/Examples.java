package io.vertx.bigquery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;

//import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
//import com.google.api.client.http.HttpTransport;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.jackson2.JacksonFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.vertx.bigquery.impl.BigQueryClientImpl;
import io.vertx.core.Vertx;

/**
 * Hello world!
 *
 */
public class Examples {
	public static void main(String[] args) throws IOException {
		Vertx vertx = Vertx.vertx();
//		
		BigQueryOptions options = new BigQueryOptions();
		options.setGoogleCredentialToken("my-credentials");
		
		BigQueryClientImpl client = new BigQueryClientImpl(vertx, options);
		client.getDataset("bigquery-public-data", "github_repos", accept -> {
			System.out.println("ok");
			System.err.println(accept.result().toString());
		});

	}
}
