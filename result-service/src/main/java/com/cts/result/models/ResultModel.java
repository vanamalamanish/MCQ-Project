package com.cts.result.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResultModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resultid;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user", referencedColumnName = "id")
	@Column
	private String username;
	@Column
	private float percentage;

	public int getResultid() {
		return resultid;
	}

	public void setResultid(int resultid) {
		this.resultid = resultid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public ResultModel() {
		super();
	}

	public ResultModel(int resultid, String username, float percentage) {
		super();
		this.resultid = resultid;
		this.username = username;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "ResultModel [resultid=" + resultid + ", username=" + username + ", percentage=" + percentage + "]";
	}

}
