package io.vertx.bigquery;

import org.junit.Test;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.testing.auth.oauth2.MockGoogleCredential;

import io.vertx.test.core.VertxTestBase;

public class BigQueryClientTest extends VertxTestBase {

	private BigQueryClient client;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		GoogleCredential mock = MockGoogleCredential.getApplicationDefault().createScoped(BigqueryScopes.all());
		BigQueryOptions options = new BigQueryOptions();
		options.setGoogleCredentialToken(mock.getAccessToken());
		client = BigQueryClient.create(vertx, options);
	}

	@Test
	public void shouldFail() throws InterruptedException {
		// we dont provide any info we should failed
		client.getDataset("", "", handler -> {
			assertFalse(handler.succeeded());
			testComplete();
		});
	    await();

	}
	
	@Test
	public void listDatasets() throws InterruptedException {
		client.listDatasets("bigquery-public-data", handler -> {
			assertTrue(handler.succeeded());
			assertNotNull(handler.result());
			testComplete();
		});
	    await();
	}
	
	
	@Test
	public void getDataset() throws InterruptedException {
		client.getDataset("bigquery-public-data","github_repos", handler -> {
			assertTrue(handler.succeeded());
			assertNotNull(handler.result());
			testComplete();
		});
	    await();
	}
	
	@Test
	public void listProjects() throws InterruptedException {
		client.listProject( handler -> {
			assertTrue(handler.succeeded());
			assertNotNull(handler.result());
			testComplete();
		});
	    await();
	}
	
	@Test
	public void listTables() throws InterruptedException {
		client.listTables("bigquery-public-data","github_repos", handler -> {
			assertTrue(handler.succeeded());
			assertNotNull(handler.result());
			testComplete();
		});
	    await();
	}
	
	@Test
	public void getTable() throws InterruptedException {
		client.getTable("bigquery-public-data","github_repos", "commits", handler -> {
			assertTrue(handler.succeeded());
			assertNotNull(handler.result());
			testComplete();
		});
	    await();
	}
	
}
