package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the OCCASN_TIMELINE_DEFNS database table.
 * 
 */
// @Entity
// @Table(name="OCCASN_TIMELINE_DEFNS")
// @NamedQuery(name="OccasnTimelineDefn.findAll", query="SELECT o FROM OccasnTimelineDefn o")
public class OccasnTimelineDefn implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private short displayOrder;
	private boolean isDefault;
	private boolean isSystem;
	private short occasnSubTypeKey;
	private int occasnTimelineDefnPid;
	private short reminderKey;
	private short setKey;
	private boolean show;

	public OccasnTimelineDefn() {
	}


	// @Id
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="COMMIT_PID")
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


	// @Column(name="IS_DEFAULT")
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="OCCASN_SUB_TYPE_KEY")
	public short getOccasnSubTypeKey() {
		return this.occasnSubTypeKey;
	}

	public void setOccasnSubTypeKey(short occasnSubTypeKey) {
		this.occasnSubTypeKey = occasnSubTypeKey;
	}


	// @Column(name="OCCASN_TIMELINE_DEFN_PID", nullable=false)
	public int getOccasnTimelineDefnPid() {
		return this.occasnTimelineDefnPid;
	}

	public void setOccasnTimelineDefnPid(int occasnTimelineDefnPid) {
		this.occasnTimelineDefnPid = occasnTimelineDefnPid;
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

}