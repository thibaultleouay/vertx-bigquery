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

	/**
	 * Create and return a client
	 * @param vertx
	 * @return this
	 */
	static BigQueryClient create(Vertx vertx) {
		return new BigQueryClientImpl(vertx, new BigQueryOptions());
	}
	
	/**
	 * Create and return a client but takes a {@link BigQueryOptions}
	 * @param vertx
	 * @param options
	 * @return this
	 */
	static BigQueryClient create(Vertx vertx, BigQueryOptions options) {
		return new BigQueryClientImpl(vertx, options);
	}
	
	/**
	 * @param projectId
	 * @param datasetId
	 * @param succesHandler
	 * @return
	 */
	@Fluent
	public BigQueryClient getDataset(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler);
	
	/**
	 * Deletes the dataset specified by the datasetId value.
	 * 
	 * @param projectId Project ID of dataset being deleted
	 * @param datasetId Dataset ID of dataset being deleted
	 * @param succesHandler
	 * @return
	 * 
	 *  <a href="https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/delete">/v2/datasets/delete </a>
	 */
	@Fluent
	public BigQueryClient deleteDataset(String projectId, String datasetId, Handler<AsyncResult<Void>> succesHandler);
	
	/**
	 * Creates a new empty dataset
	 * 
	 * @param projectId Project ID of the new dataset
	 * @param succesHandler
	 * @param payload a {@link Dataset} ressource 
	 * @return
	 * 
	 * <a href="https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/insert">/v2/datasets/insert </a> endpoint
	 */
	@Fluent
	public BigQueryClient insertDataset(String projectId,  Handler<AsyncResult<Dataset>> succesHandler, Dataset payload);
	
	/**
	 * Lists all datasets in the specified project.
	 * 
	 * @param projectId Project ID of the datasets to be listed
	 * @param succesHandler
	 * @return
	 * 
	 *  <a href="https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/list">/v2/datasets/list </a>
	 */
	@Fluent
	public BigQueryClient listDatasets(String projectId, Handler<AsyncResult<DatasetList>> succesHandler);
	
	/**
	 * Lists all datasets in the specified project with options.
	 * 
	 * @param projectId
	 * @param succesHandler
	 * @param options
	 * @return
	 * 
	 * <a href="https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/list">/v2/datasets/list </a>
	 */
	@Fluent
	public BigQueryClient listDatasetsWithOptions(String projectId, Handler<AsyncResult<DatasetList>> succesHandler, JsonObject options);
	
	/**
	 * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource. 
	 * 
	 * @param projectId Project ID of the dataset being updated
	 * @param datasetId Dataset ID of the dataset being updated
	 * @param succesHandler
	 * @param payload
	 * @return
	 * 
	 * <a href="https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/patch"> /v2/datasets/patch </a>
	 */
	@Fluent
	public BigQueryClient patchDataset(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler, Dataset payload);
	
	/**
	 * Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource. 
	 * 
	 * @param projectId Project ID of the dataset being updated
	 * @param datasetId Dataset ID of the dataset being updated
	 * @param succesHandler
	 * @param payload
	 * @return
	 * 
	 *  <a href="https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/update"> /v2/datasets/update </a>
	 */
	@Fluent
	public BigQueryClient updateDataSet(String projectId, String datasetId, Handler<AsyncResult<Dataset>> succesHandler, Dataset payload);
	
	/**
	 * Requests that a job be cancelled. 
	 * 
	 * @param projectId  Project Id  of the job to cancel
	 * @param jobId  Job ID of the job to cancel
	 * @param successHandler
	 * @return
	 * 
	 *  <a href="https://cloud.google.com/bigquery/docs/reference/rest/v2/jobs/cancel">/v2/jobs/cancel </a>
	 */
	@Fluent
	public BigQueryClient cancelJobs(String projectId, String jobId, Handler<AsyncResult<JobCancelResponse>> successHandler);
	
	/**
	 * 
	 * @param projectId
	 * @param jobId
	 * @param succesHandler
	 * @return
	 */
	@Fluent
	public BigQueryClient getJob(String projectId, String jobId, Handler<AsyncResult<Job>> succesHandler);
	
	/**
	 * 
	 * @param projectId
	 * @param jobId
	 * @param succesHandler
	 * @return
	 */
	@Fluent
	public BigQueryClient getQueryResult(String projectId, String jobId,  Handler<AsyncResult<GetQueryResultsResponse>> succesHandler);

	/**
	 * 
	 * @param projectId
	 * @param jobId
	 * @param succesHandler
	 * @param options
	 * @return
	 */
	@Fluent
	public BigQueryClient getQueryResultWithOptions(String projectId, String jobId,  Handler<AsyncResult<GetQueryResultsResponse>> succesHandler, JsonObject options);

	/**
	 *
	 * @param projectId
	 * @param succesHandler
	 * @return
	 */
	@Fluent
	public BigQueryClient insertJob(String projectId, Handler<AsyncResult<Job>> succesHandler, Job job);

	/**
	 * 
	 * @param projectId
	 * @param succeshandler
	 * @return
	 */
	@Fluent
	public BigQueryClient listJobs(String projectId, Handler<AsyncResult<JobList>> succeshandler);
	
	/**
	 * 
	 * @param projectId
	 * @param succeshandler
	 * @param options
	 * @return
	 */
	@Fluent
	public BigQueryClient listJobsWithOptions(String projectId, Handler<AsyncResult<JobList>> succeshandler, JsonObject options);
	
	/**
	 * 
	 * @param projectId
	 * @param succeshandler
	 * @param payload
	 * @return
	 */
	@Fluent
	public BigQueryClient queryJob(String projectId, Handler<AsyncResult<QueryResponse>> succeshandler, QueryRequest payload);
	
	/**
	 * 
	 * @param succeshandler
	 * @return
	 */
	@Fluent
	public BigQueryClient listProject(Handler<AsyncResult<ProjectList>> succeshandler);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param tableId
	 * @param succeshandler
	 * @param payload
	 * @return
	 */
	@Fluent
	public BigQueryClient insertAllTableData(String projectId, String datasetId, String tableId, Handler<AsyncResult<TableDataInsertAllResponse>> succeshandler, TableDataInsertAllRequest payload);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param tableId
	 * @param succeHandler
	 * @return
	 */
	@Fluent
	public BigQueryClient deleteTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Void>> succeHandler);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param tableId
	 * @param succeshandler
	 * @return
	 */
	@Fluent
	public BigQueryClient getTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>>succeshandler);

	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param tableId
	 * @param succeshandler
	 * @param options
	 * @return
	 */
	@Fluent
	public BigQueryClient getTableWithOptions(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>>succeshandler, JsonObject options);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param succeshandler
	 * @param payload
	 * @return
	 */
	@Fluent
	public BigQueryClient insertTable(String projectId, String datasetId, Handler<AsyncResult<Table>> succeshandler, Table payload);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param succeshandler
	 * @return
	 */
	@Fluent
	public BigQueryClient listTables(String projectId, String datasetId, Handler<AsyncResult<TableList>> succeshandler);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param succeshandler
	 * @param options
	 * @return
	 */
	@Fluent
	public BigQueryClient listTablesWithOptions(String projectId, String datasetId, Handler<AsyncResult<TableList>> succeshandler, JsonObject options);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param tableId
	 * @param succeshandler
	 * @param payload
	 * @return
	 */
	@Fluent
	public BigQueryClient patchTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>> succeshandler, Table payload);
	
	/**
	 * 
	 * @param projectId
	 * @param datasetId
	 * @param tableId
	 * @param succeshandler
	 * @param payload
	 * @return
	 */
	@Fluent
	public BigQueryClient updateTable(String projectId, String datasetId, String tableId, Handler<AsyncResult<Table>> succeshandler, Table payload);

	/**
	 * 
	 */
	public void close();
	
}
