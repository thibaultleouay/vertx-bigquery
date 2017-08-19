package io.vertx.bigquery;


import io.vertx.bigquery.impl.BigQueryClientImpl;
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
import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

@VertxGen
public interface BigQueryClient {

	static BigQueryClient create(Vertx vertx) {
		return new BigQueryClientImpl(vertx, new BigQueryOptions());
	}
	
	static BigQueryClient create(Vertx vertx, BigQueryOptions options) {
		return new BigQueryClientImpl(vertx, options);
	}
	
	@Fluent
	public BigQueryClient getDataset(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler);
	
	@Fluent
	public BigQueryClient deleteDataset(String projectId, String datasetId, Handler<AsyncResult<Void>> succesHandler);
	
	@Fluent
	public BigQueryClient insertDataset(String projectId,  Handler<AsyncResult<Dataset>> succesHandler, Dataset payload);
	
	@Fluent
	public BigQueryClient listDatasets(String projectId, Handler<AsyncResult<DatasetList>> succesHandler);
	
	@Fluent
	public BigQueryClient listDatasetsWithOptions(String projectId, Handler<AsyncResult<DatasetList>> succesHandler, JsonObject options);
	
	@Fluent
	public BigQueryClient patchDataset(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler, Dataset payload);
	
	@Fluent
	public BigQueryClient updateDataSet(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler, Dataset payload);
	
	@Fluent
	public BigQueryClient cancelJobs(String projectId, String jobId, Handler<AsyncResult<JobCancelResponse>> successHandler);
	
	@Fluent
	public BigQueryClient getJob(String projectId, String jobId, Handler<AsyncResult<Job>> succesHandler);
	
	@Fluent
	public BigQueryClient getQueryResult(String projectId, String jobId,  Handler<AsyncResult<GetQueryResultsResponse>> succesHandler);

	@Fluent
	public BigQueryClient getQueryResultWithOptions(String projectId, String jobId,  Handler<AsyncResult<GetQueryResultsResponse>> succesHandler, JsonObject options);

	@Fluent
	public BigQueryClient listJobs(String projectId, Handler<AsyncResult<JobList>> succeshandler);
	
	@Fluent
	public BigQueryClient listJobsWithOptions(String projectId, Handler<AsyncResult<JobList>> succeshandler, JsonObject options );
	
	@Fluent
	public BigQueryClient queryJob(String projectId, Handler<AsyncResult<QueryResponse>> succeshandler, QueryRequest payload);
	
	@Fluent
	public BigQueryClient listProject(Handler<AsyncResult<ProjectList>> succeshandler);
	
	@Fluent
	public BigQueryClient insertAllTableData(String projectId, String datasetId, String tableId, Handler<AsyncResult<TableDataInsertAllResponse>> succeshandler, TableDataInsertAllRequest payload);
	
	@Fluent
	public BigQueryClient deleteTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Void>> succeHandler);
	
	@Fluent
	public BigQueryClient getTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>>succeshandler);

	@Fluent
	public BigQueryClient getTableWithOptions(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>>succeshandler, JsonObject options);
	
	@Fluent
	public BigQueryClient insertTable(String projectId, String datasetId, Handler<AsyncResult<Table>> succeshandler, Table payload);
	
	@Fluent
	public BigQueryClient listTables(String projectId, String datasetId, Handler<AsyncResult<TableList>> succeshandler);
	
	@Fluent
	public BigQueryClient listTablesWithOptions(String projectId, String datasetId, Handler<AsyncResult<TableList>> succeshandler, JsonObject options);
	
	@Fluent
	public BigQueryClient patchTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>> succeshandler, Table payload);
	
	@Fluent
	public BigQueryClient updateTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>> succeshandler, Table payload);

	public void close();
	
}
