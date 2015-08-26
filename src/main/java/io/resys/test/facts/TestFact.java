package io.resys.test.facts;

import java.io.Serializable;

public class TestFact implements Serializable {
	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
