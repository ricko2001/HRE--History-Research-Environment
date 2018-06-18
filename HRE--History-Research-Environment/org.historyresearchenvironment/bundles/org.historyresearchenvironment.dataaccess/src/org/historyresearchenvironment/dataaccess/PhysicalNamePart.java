package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the PHYSICAL_NAME_PARTS database table.
 * 
 */
// @Entity
// @Table(name="PHYSICAL_NAME_PARTS")
// @NamedQuery(name="PhysicalNamePart.findAll", query="SELECT p FROM PhysicalNamePart p")
public class PhysicalNamePart implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short elementPid;
	private String langCode;
	private int nextNameEventPid;
	private int physicalNamePartPid;
	private short setKey;
	private int shared;
	private int thisNameEventPid;
	private String trans;

	public PhysicalNamePart() {
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


	// @Column(name="ELEMENT_PID")
	public short getElementPid() {
		return this.elementPid;
	}

	public void setElementPid(short elementPid) {
		this.elementPid = elementPid;
	}


	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}


	// @Column(name="NEXT_NAME_EVENT_PID")
	public int getNextNameEventPid() {
		return this.nextNameEventPid;
	}

	public void setNextNameEventPid(int nextNameEventPid) {
		this.nextNameEventPid = nextNameEventPid;
	}


	// @Column(name="PHYSICAL_NAME_PART_PID", nullable=false)
	public int getPhysicalNamePartPid() {
		return this.physicalNamePartPid;
	}

	public void setPhysicalNamePartPid(int physicalNamePartPid) {
		this.physicalNamePartPid = physicalNamePartPid;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	public int getShared() {
		return this.shared;
	}

	public void setShared(int shared) {
		this.shared = shared;
	}


	// @Column(name="THIS_NAME_EVENT_PID")
	public int getThisNameEventPid() {
		return this.thisNameEventPid;
	}

	public void setThisNameEventPid(int thisNameEventPid) {
		this.thisNameEventPid = thisNameEventPid;
	}


	// @Column(length=160)
	public String getTrans() {
		return this.trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

}