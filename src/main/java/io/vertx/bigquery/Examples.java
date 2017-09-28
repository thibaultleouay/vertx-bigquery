package io.vertx.bigquery;

import java.io.IOException;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.testing.auth.oauth2.MockGoogleCredential;

import io.vertx.bigquery.impl.BigQueryClientImpl;
import io.vertx.bigquery.model.TableDataInsertAllRequest;
import io.vertx.core.Vertx;

public class Examples {
	public static void main(String[] args) throws IOException {
		
		Vertx vertx = Vertx.vertx();
		BigQueryOptions options = new BigQueryOptions();
		GoogleCredential mock = MockGoogleCredential.getApplicationDefault().createScoped(BigqueryScopes.all());
		
		options.setGoogleCredentialToken(mock.getAccessToken());
		
		BigQueryClient client = BigQueryClient.create(vertx, options);
		client.getDataset("bigquery-public-data", "github_repos", accept -> {
			if(accept.succeeded()) {
				System.out.println(accept.result().getId());
				}
			else {
				System.out.println(accept.cause());
				
			}
		});
		

		}
}
