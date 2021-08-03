package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SpringBootRunnerWithInputData implements CommandLineRunner {
	@Value("${my.info.product.id}")
	private int productId;
	@Value("${my.info.product.code}")
	private String porductCode;
	@Value("${my.info.product.model-version}")
	private double modelVersion;
	@Value("${my.info.product.release_dtl_enable}")
	private boolean isDetEnable;
	@Value("${my.info.product.start-key}")
	private char startKey;
	
	public SpringBootRunnerWithInputData() {
		
	}

	public SpringBootRunnerWithInputData(int productId, String porductCode, double modelVersion, boolean isDetEnable,
			char startKey) {
		this.productId = productId;
		this.porductCode = porductCode;
		this.modelVersion = modelVersion;
		this.isDetEnable = isDetEnable;
		this.startKey = startKey;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getPorductCode() {
		return porductCode;
	}
	public void setPorductCode(String porductCode) {
		this.porductCode = porductCode;
	}

	public double getModelVersion() {
		return modelVersion;
	}
	public void setModelVersion(double modelVersion) {
		this.modelVersion = modelVersion;
	}

	public boolean isDetEnable() {
		return isDetEnable;
	}
	public void setDetEnable(boolean isDetEnable) {
		this.isDetEnable = isDetEnable;
	}

	public char getStartKey() {
		return startKey;
	}
	public void setStartKey(char startKey) {
		this.startKey = startKey;
	}



	@Override
	public String toString() {
		return "SpringBootRunnerWithInputData [productId=" + productId + ", porductCode=" + porductCode
				+ ", modelVersion=" + modelVersion + ", isDetEnable=" + isDetEnable + ", startKey=" + startKey + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
