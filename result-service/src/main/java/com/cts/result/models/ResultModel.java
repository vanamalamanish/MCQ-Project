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
	private int userid;
	@Column
	private float percentage;

	public int getResultid() {
		return resultid;
	}

	public void setResultid(int resultid) {
		this.resultid = resultid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public ResultModel(int resultid, int userid, float percentage) {
		super();
		this.resultid = resultid;
		this.userid = userid;
		this.percentage = percentage;
	}

}
