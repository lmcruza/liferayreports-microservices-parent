package com.cgi.liferayreports.microservices;


public class Device {

  private String brand;
	private String browser;
	private String model;
	private String os;
	private String osVersion;
	private String pointingMethod;
	private Dimensions screenPhysicalSize;
	private Dimensions screenResolution;
	private Boolean qwertyKeyboard;
	private Boolean tablet;
	public Device(String brand, String browser, String model, String os, String osVersion, String pointingMethod,
		Dimensions screenPhysicalSize, Dimensions screenResolution, Boolean qwertyKeyboard, Boolean tablet) {
	    super();
	    this.brand = brand;
	    this.browser = browser;
	    this.model = model;
	    this.os = os;
	    this.osVersion = osVersion;
	    this.pointingMethod = pointingMethod;
	    this.screenPhysicalSize = screenPhysicalSize;
	    this.screenResolution = screenResolution;
	    this.qwertyKeyboard = qwertyKeyboard;
	    this.tablet = tablet;
	}
	public String getBrand() {
	    return brand;
	}
	public String getBrowser() {
	    return browser;
	}
	public String getModel() {
	    return model;
	}
	public String getOs() {
	    return os;
	}
	public String getOsVersion() {
	    return osVersion;
	}
	public String getPointingMethod() {
	    return pointingMethod;
	}
	public Dimensions getScreenPhysicalSize() {
	    return screenPhysicalSize;
	}
	public Dimensions getScreenResolution() {
	    return screenResolution;
	}
	public Boolean getQwertyKeyboard() {
	    return qwertyKeyboard;
	}
	public Boolean getTablet() {
	    return tablet;
	}

	@SuppressWarnings("unused")
	private Device(){}

}
