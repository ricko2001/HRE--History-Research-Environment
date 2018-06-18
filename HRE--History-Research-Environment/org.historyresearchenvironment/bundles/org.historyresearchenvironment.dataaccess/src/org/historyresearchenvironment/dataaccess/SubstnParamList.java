package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the SUBSTN_PARAM_LISTS database table.
 * 
 */
// @Entity
// @Table(name="SUBSTN_PARAM_LISTS")
// @NamedQuery(name="SubstnParamList.findAll", query="SELECT s FROM SubstnParamList s")
public class SubstnParamList implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isSystem;
	private short paramSetKey;
	private short reminderKey;
	private short setKey;
	private boolean show;
	private int substnParamListPid;

	public SubstnParamList() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="DISPLAY_ORDER")
	public short getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(short displayOrder) {
		this.displayOrder = displayOrder;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="PARAM_SET_KEY")
	public short getParamSetKey() {
		return this.paramSetKey;
	}

	public void setParamSetKey(short paramSetKey) {
		this.paramSetKey = paramSetKey;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="\"SHOW\"")
	public boolean getShow() {
		return this.show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}


	// @Column(name="SUBSTN_PARAM_LIST_PID")
	public int getSubstnParamListPid() {
		return this.substnParamListPid;
	}

	public void setSubstnParamListPid(int substnParamListPid) {
		this.substnParamListPid = substnParamListPid;
	}

}