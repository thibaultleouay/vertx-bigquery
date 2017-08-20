package io.vertx.bigquery.impl;


import io.vertx.bigquery.model.Dataset;
import io.vertx.bigquery.model.DatasetList;
import io.vertx.bigquery.model.GetQueryResultsResponse;
import io.vertx.bigquery.model.Job;
import io.vertx.bigquery.model.JobCancelResponse;
import io.vertx.bigquery.model.JobList;
import io.vertx.bigquery.model.ProjectList;
import io.vertx.bigquery.model.QueryRequest;
import io.vertx.bigquery.model.QueryResponse;
import io.vertx.bigquery.model.Table;
import io.vertx.bigquery.model.TableDataInsertAllRequest;
import io.vertx.bigquery.model.TableDataInsertAllResponse;
import io.vertx.bigquery.model.TableList;

import io.vertx.bigquery.BigQueryClient;
import io.vertx.bigquery.BigQueryOptions;
import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.HttpRequest;
import io.vertx.ext.web.client.WebClient;

public class BigQueryClientImpl implements BigQueryClient {

	private static final String DEFAULT_ENDPOINT = "/bigquery/v2/projects/";
	private BigQueryOptions options;
	private WebClient client;
	private Context ctx;

	public BigQueryClientImpl(Vertx vertx, BigQueryOptions options) {
		this.options = options;
		options.setDefaultHost("www.googleapis.com");
		options.setDefaultPort(443);
		options.setSsl(true);
		this.client = WebClient.create(vertx, options);
	}

	@Override
	public BigQueryClient deleteDataset(String projectId, String datasetId, Handler<AsyncResult<Void>> succesHandler) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId;
		createDeleteRequest(path, succesHandler);
		return this;
	}

	@Override
	public BigQueryClient getDataset(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId;
		createGetRequestWithOptions(path, succesHandler, null);
		return this;

	}

	@Override
	public BigQueryClient insertDataset(String projectId, Handler<AsyncResult<Dataset>> succesHandler,
			Dataset payload) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/";
		createPostRequest(path, succesHandler,  payload);
		return this;
	}

	@Override
	public BigQueryClient listDatasets(String projectId, Handler<AsyncResult<DatasetList>> succesHandler) {
		listDatasetsWithOptions(projectId, succesHandler, null);
		return this;
	}

	@Override
	public BigQueryClient listDatasetsWithOptions(String projectId, Handler<AsyncResult<DatasetList>> succesHandler,
			JsonObject options) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/";
		createGetRequestWithOptions(path, succesHandler, options);
		return this;
	}

	@Override
	public BigQueryClient patchDataset(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler,
			Dataset payload) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId;
		createPatchRequest(path, succesHandler, payload);
		return this;
	}

	@Override
	public BigQueryClient updateDataSet(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler,
			Dataset payload) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId;
		createPutRequest(path, succesHandler,  payload);
		return this;
	}

	@Override
	public BigQueryClient cancelJobs(String projectId, String jobId,
			Handler<AsyncResult<JobCancelResponse>> successHandler) {
		String path = DEFAULT_ENDPOINT + projectId + "/jobs/" + jobId + "/cancel";
		createGetRequest(path, successHandler);
		return this;
	}

	@Override
	public BigQueryClient getJob(String projectId, String jobId, Handler<AsyncResult<Job>> succesHandler) {
		String path = DEFAULT_ENDPOINT + projectId + "/jobs/" + jobId ;
		createGetRequest(path, succesHandler);
		return this;
	}
	
	@Override
	public BigQueryClient getQueryResult(String projectId, String jobId,
			Handler<AsyncResult<GetQueryResultsResponse>> succesHandler) {

		getQueryResultWithOptions(projectId, jobId, succesHandler, null);
		return this;
	}
	
	@Override
	public BigQueryClient getQueryResultWithOptions(String projectId, String jobId,
			Handler<AsyncResult<GetQueryResultsResponse>> succesHandler, JsonObject options) {
		String path = DEFAULT_ENDPOINT + projectId + "/queries/" + jobId ;
		createGetRequestWithOptions(path, succesHandler, options);
		return this;
	}
	
	@Override
	public BigQueryClient listJobs(String projectId, Handler<AsyncResult<JobList>> succeshandler) {
		listJobsWithOptions(projectId, succeshandler, null);
		return this;
	}
	@Override
	public BigQueryClient listJobsWithOptions(String projectId, Handler<AsyncResult<JobList>> succeshandler,
			JsonObject options) {
		String path  = DEFAULT_ENDPOINT + projectId + "/jobs";
		createGetRequestWithOptions(path, succeshandler, options);
		return this;
	}
	
	@Override
	public BigQueryClient queryJob(String projectId, Handler<AsyncResult<QueryResponse>> succeshandler,
			QueryRequest payload) {
		String path  = DEFAULT_ENDPOINT + projectId + "/queries";
		createPostRequest(path, succeshandler, payload);
		return this;
	}
	
	@Override
	public BigQueryClient listProject(Handler<AsyncResult<ProjectList>> succeshandler) {
		createGetRequest(DEFAULT_ENDPOINT, succeshandler);
		return this;
	}
	
	@Override
	public BigQueryClient insertAllTableData(String projectId, String datasetId, String tableId,
			Handler<AsyncResult<TableDataInsertAllResponse>> succeshandler, TableDataInsertAllRequest payload) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId + "/tables/" + tableId+ "/insertAll";
		createPostRequest(path, succeshandler,  payload);
		return this;
	}
	
	@Override
	public BigQueryClient deleteTable(String projectId, String datasetId, String tableId,
			Handler<AsyncResult<Void>> succeHandler) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId + "/tables/" + tableId;
		createDeleteRequest(path, succeHandler);
		return this;
	}

	@Override
	public BigQueryClient getTable(String projectId, String datasetId, String tableId,
			Handler<AsyncResult<Table>> succeshandler) {
		getTableWithOptions(projectId, datasetId, tableId, succeshandler, null);
		return this;
	}

	@Override
	public BigQueryClient getTableWithOptions(String projectId, String datasetId, String tableId,
			Handler<AsyncResult<Table>> succeshandler, JsonObject options) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId + "/tables/" + tableId;
		createGetRequestWithOptions(path, succeshandler,  options);
		return this;
	}

	@Override
	public BigQueryClient insertTable(String projectId, String datasetId, Handler<AsyncResult<Table>> succeshandler,
			Table payload) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId + "/tables/";
		createPostRequest(path, succeshandler, payload);
		return this;
	}

	@Override
	public BigQueryClient listTables(String projectId, String datasetId,
			Handler<AsyncResult<TableList>> succeshandler) {
		listTablesWithOptions(projectId, datasetId, succeshandler, null);
		return this;
	}

	@Override
	public BigQueryClient listTablesWithOptions(String projectId, String datasetId,
			Handler<AsyncResult<TableList>> succeshandler, JsonObject options) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId + "/tables/";
		createGetRequestWithOptions(path, succeshandler, options);
		return this;
	}

	@Override
	public BigQueryClient patchTable(String projectId, String datasetId, String tableId,
			Handler<AsyncResult<Table>> succeshandler, Table payload) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId + "/tables/" + tableId;
		createPatchRequest(path, succeshandler,  payload);
		return this;
	}

	@Override
	public BigQueryClient updateTable(String projectId, String datasetId, String tableId,
			Handler<AsyncResult<Table>> succeshandler, Table payload) {
		String path = DEFAULT_ENDPOINT + projectId + "/datasets/" + datasetId + "/tables/" + tableId;
		createPutRequest(path, succeshandler, payload);
		return this;
	}

	private <T> void createDeleteRequest(String path, Handler<AsyncResult<T>> handler) {
		request(HttpMethod.DELETE, path, handler,  null, null);
	}

	private <T> void createGetRequest(String path, Handler<AsyncResult<T>> handler) {
		request(HttpMethod.GET, path, handler,  null, null);
	}

	private <T> void createGetRequestWithOptions(String path, Handler<AsyncResult<T>> handler,
			JsonObject queryParam) {
		request(HttpMethod.GET, path, handler,  null, queryParam);
	}

	private <T> void createPatchRequest(String path, Handler<AsyncResult<T>> handler,
			Object payload) {
		request(HttpMethod.PATCH, path, handler,  payload, null);

	}

	private <T> void createPostRequest(String path, Handler<AsyncResult<T>> handler,
			Object payload) {
		request(HttpMethod.POST, path, handler,  payload, null);

	}

	private <T> void createPutRequest(String path, Handler<AsyncResult<T>> handler,
			Object payload) {
		request(HttpMethod.PUT, path, handler,  payload, null);

	}

	private <T> void request(final HttpMethod method, final String path, Handler<AsyncResult<T>> resultHandler,
			 final Object payload, JsonObject queryParam) {

		if (Vertx.currentContext() == ctx) {
			requestOnContext(method, path, resultHandler,  payload, queryParam);
		} else {
			ctx.runOnContext(action -> request(method, path, resultHandler,  payload, queryParam));
		}

	}

	private <T> void requestOnContext(final HttpMethod method, final String path, Handler<AsyncResult<T>> resultHandler,
			 final Object payload, JsonObject queryParam) {

		HttpRequest<Buffer> request = client.request(method, path);
		request.putHeader("Authorization", "Bearer " + options.getGoogleCrendiatlToken());
		if (queryParam != null) {
			queryParam.getMap().forEach((k, v) -> request.addQueryParam(k, (String) v));
		}
		request.sendJson(payload, handler -> {
				resultHandler.handle((AsyncResult<T>) Future.succeededFuture(handler.result()));
		
		});

	}

	@Override
	public void close() {
		client.close();
	}

}
