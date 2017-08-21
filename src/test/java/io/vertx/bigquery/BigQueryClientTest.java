package io.vertx.bigquery;

import java.util.concurrent.CountDownLatch;

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
}
