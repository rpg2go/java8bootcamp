package com.acme.ch11.interfaces.domain;

public class Service implements Product {
	private String name;
	private int estimatedTaskDuration;
	private boolean timeAndMaterials;
	
	private String serialNo = "1234-5678#qwerty#90";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEstimatedTaskDuration() {
		return estimatedTaskDuration;
	}
	public void setEstimatedTaskDuration(int estimatedTaskDuration) {
		this.estimatedTaskDuration = estimatedTaskDuration;
	}
	public boolean isTimeAndMaterials() {
		return timeAndMaterials;
	}
	public void setTimeAndMaterials(boolean timeAndMaterials) {
		this.timeAndMaterials = timeAndMaterials;
	}
	/**
	 * Service constructor
	 * @param n = service name
	 * @param etd = estimated task duration
	 * @param tam = time and materials
	 */
	
	public Service(String n, int etd, boolean tam) {
		this.name = n;
		this.estimatedTaskDuration = etd;
		this.timeAndMaterials = tam;
	}

	public String toString() {
		return name + " (a " + estimatedTaskDuration + " day service)";
	}
	
	public String getSerialNo() {
		return this.serialNo;
	}
}
