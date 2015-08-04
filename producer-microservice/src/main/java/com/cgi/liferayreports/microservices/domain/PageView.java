package com.cgi.liferayreports.microservices.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;



public class PageView {
	private String id;
	private String applicationId;
	private String nodeId;
	private Long companyId;
	private Viewer viewer;
	private Page page;
	private Date viewTimestamp;
	private Device device;
	private Long processTime;
	private List<Parameter> parameters = new ArrayList<Parameter>(10);
	private Map<String,String> headers;
	private Object advanced;

	public PageView(String id, String applicationId, String nodeId, Long companyId, Viewer viewer, Page page, List<Parameter> parameters, Object advanced) {
	    super();
	    this.id = id;
	    this.applicationId = applicationId;
	    this.nodeId = nodeId;
	    this.companyId = companyId;
	    this.viewer = viewer;
	    this.page = page;
	    this.parameters = parameters;
	}

	public String getId() {
	    return id;
	}
	public String getApplicationId() {
	    return applicationId;
	}
	public String getNodeId() {
	    return nodeId;
	}
	public Long getCompanyId() {
	    return companyId;
	}
	public Viewer getViewer() {
	    return viewer;
	}
	public Page getPage() {
	    return page;
	}
	public Object getAdvanced() {
	    return advanced;
	}
	public Date getViewTimestamp() {
	    return viewTimestamp;
	}
	public Device getDevice() {
	    return device;
	}
	public Long getProcessTime() {
	    return processTime;
	}
	public List<Parameter> getParameters() {
	    return parameters;
	}

	public Map<String,String> getHeaders() {
	    return headers;
	}

	@Override
	public String toString() {
	    return "PageView [id=" + id + ", applicationId=" + applicationId + ", nodeId=" + nodeId + ", companyId=" + companyId
		    + ", viewer=" + viewer + ", page=" + page + "]";
	}

	public PageView() {

	}
}
