package com.cgi.liferayreports.microservices;

import java.util.List;
import java.util.Map;


public class Portlet {
    
    private String portletId;
    private Map<String, List<String>> portletSetup;
    private Object additionalConfig;
    
    public Portlet(String portletId, Map<String, List<String>> portletSetup, Object additionalConfig) {
	super();
	this.portletId = portletId;
	this.portletSetup = portletSetup;
	this.additionalConfig = additionalConfig;
    }

    public String getPortletId() {
        return portletId;
    }
    public Object getPortletSetup() {
        return portletSetup;
    }
    public Object getAdditionalConfig() {
        return additionalConfig;
    }
    
    @SuppressWarnings("unused")
    private Portlet() {
    }
    
}
