package com.es.Entity;

/**
 * Created by wang on 2017/8/17.
 */
public class PDF {

	private String PDF;

	private String PNG;

	public PDF(String PDF, String PNG) {

		this.PDF = PDF;
		this.PNG = PNG;
	}

	public PDF() {}

	public String getPDF() {

		return PDF;
	}

	public void setPDF(String PDF) {

		this.PDF = PDF;
	}

	public String getPNG() {

		return PNG;
	}

	public void setPNG(String PNG) {

		this.PNG = PNG;
	}
}
