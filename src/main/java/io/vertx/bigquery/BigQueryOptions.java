package io.vertx.bigquery;


import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClientOptions;

@DataObject(generateConverter = true)
public class BigQueryOptions extends WebClientOptions {

	private String token;

	public BigQueryOptions() {
		super();
	}

	
	public BigQueryOptions(JsonObject object) {
		this();
	}
	
	public void setGoogleCredentialToken(String token) {
		this.token = token;
	}

	public String getGoogleCrendiatlToken() {
		return this.token;
	}

}
