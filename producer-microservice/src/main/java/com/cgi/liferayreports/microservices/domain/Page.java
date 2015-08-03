package com.cgi.liferayreports.microservices.domain;

import java.util.List;

public class Page {
    
    private Long pageId;
    private String pageName;
    private List<Portlet> portlets;
    private Object additionalConfig;
    public Page(Long pageId, String pageName, List<Portlet> portlets, Object additionalConfig) {
	super();
	this.pageId = pageId;
	this.pageName = pageName;
	this.portlets = portlets;
	this.additionalConfig = additionalConfig;
    }
    
    public Long getPageId() {
        return pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public List<Portlet> getPortlets() {
        return portlets;
    }
    
    public Object getAdditionalConfig() {
        return additionalConfig;
    }

    @Override
    public String toString() {
	return "Page [pageId=" + pageId + ", pageName=" + pageName + ", portlets=" + portlets + "]";
    }

    public Page() {
    }
    
}
