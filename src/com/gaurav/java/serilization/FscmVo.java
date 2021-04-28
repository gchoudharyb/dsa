package com.gaurav.java.serilization;
import java.io.Serializable;

class FscmVo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	transient static String productName;
	transient String productId;
	final String productDesc;
	public FscmVo(String productName, String productId, String productDesc) {
		this.productName = productName;
		this.productId = productId;
		this.productDesc=productDesc;
	}
	@Override
	public String toString() {
		return "FscmVo [productName ="+ productName+", productId=" + productId + ", productDesc=" + productDesc + "]";
	}
	
	
}