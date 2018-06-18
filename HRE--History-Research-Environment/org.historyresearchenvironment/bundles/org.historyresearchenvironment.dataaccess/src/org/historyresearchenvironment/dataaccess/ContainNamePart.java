package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the CONTAIN_NAME_PARTS database table.
 * 
 */
// @Entity
// @Table(name="CONTAIN_NAME_PARTS")
// @NamedQuery(name="ContainNamePart.findAll", query="SELECT c FROM ContainNamePart c")
public class ContainNamePart implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private int containNamePartPid;
	private short elementTypeKey;
	private boolean isSystem;
	private String langCode;
	private short setKey;
	private int shared;
	private String trans;

	public ContainNamePart() {
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


	// @Column(name="CONTAIN_NAME_PART_PID", nullable=false)
	public int getContainNamePartPid() {
		return this.containNamePartPid;
	}

	public void setContainNamePartPid(int containNamePartPid) {
		this.containNamePartPid = containNamePartPid;
	}


	// @Column(name="ELEMENT_TYPE_KEY")
	public short getElementTypeKey() {
		return this.elementTypeKey;
	}

	public void setElementTypeKey(short elementTypeKey) {
		this.elementTypeKey = elementTypeKey;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="LANG_CODE", length=4)
	public String getLangCode() {
		return this.langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
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


	// @Column(length=160)
	public String getTrans() {
		return this.trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

}