package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the BIO_NAMES database table.
 * 
 */
// @Entity
// @Table(name="BIO_NAMES")
// @NamedQuery(name="BioName.findAll", query="SELECT b FROM BioName b")
public class BioName implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioNamePid;
	private int commitPid;
	private byte[] elementsEntered;
	private boolean isSystem;
	private int memoSetPid;
	private short nameStyleKey;
	private short nameTagKey;
	private boolean nextHdateInferred;
	private int nextHdatePid;
	private int nextNameEventPid;
	private int parentPid;
	private short parentSubTypeKey;
	private short sentceSetKey;
	private short sentceStyleKey;
	private short sentceTypeKey;
	private short setPid;
	private short themeKey;
	private boolean thisHdateInferred;
	private int thisHdatePid;
	private int thisNameEventPid;

	public BioName() {
	}


	// @Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @Column(name="RECORD_NUM", unique=true, nullable=false)
	public int getRecordNum() {
		return this.recordNum;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}


	// @Column(name="BIO_NAME_PID", nullable=false)
	public int getBioNamePid() {
		return this.bioNamePid;
	}

	public void setBioNamePid(int bioNamePid) {
		this.bioNamePid = bioNamePid;
	}


	// @Column(name="COMMIT_PID")
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="ELEMENTS_ENTERED")
	public byte[] getElementsEntered() {
		return this.elementsEntered;
	}

	public void setElementsEntered(byte[] elementsEntered) {
		this.elementsEntered = elementsEntered;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MEMO_SET_PID")
	public int getMemoSetPid() {
		return this.memoSetPid;
	}

	public void setMemoSetPid(int memoSetPid) {
		this.memoSetPid = memoSetPid;
	}


	// @Column(name="NAME_STYLE_KEY")
	public short getNameStyleKey() {
		return this.nameStyleKey;
	}

	public void setNameStyleKey(short nameStyleKey) {
		this.nameStyleKey = nameStyleKey;
	}


	// @Column(name="NAME_TAG_KEY")
	public short getNameTagKey() {
		return this.nameTagKey;
	}

	public void setNameTagKey(short nameTagKey) {
		this.nameTagKey = nameTagKey;
	}


	// @Column(name="NEXT_HDATE_INFERRED")
	public boolean getNextHdateInferred() {
		return this.nextHdateInferred;
	}

	public void setNextHdateInferred(boolean nextHdateInferred) {
		this.nextHdateInferred = nextHdateInferred;
	}


	// @Column(name="NEXT_HDATE_PID")
	public int getNextHdatePid() {
		return this.nextHdatePid;
	}

	public void setNextHdatePid(int nextHdatePid) {
		this.nextHdatePid = nextHdatePid;
	}


	// @Column(name="NEXT_NAME_EVENT_PID")
	public int getNextNameEventPid() {
		return this.nextNameEventPid;
	}

	public void setNextNameEventPid(int nextNameEventPid) {
		this.nextNameEventPid = nextNameEventPid;
	}


	// @Column(name="PARENT_PID")
	public int getParentPid() {
		return this.parentPid;
	}

	public void setParentPid(int parentPid) {
		this.parentPid = parentPid;
	}


	// @Column(name="PARENT_SUB_TYPE_KEY")
	public short getParentSubTypeKey() {
		return this.parentSubTypeKey;
	}

	public void setParentSubTypeKey(short parentSubTypeKey) {
		this.parentSubTypeKey = parentSubTypeKey;
	}


	// @Column(name="SENTCE_SET_KEY")
	public short getSentceSetKey() {
		return this.sentceSetKey;
	}

	public void setSentceSetKey(short sentceSetKey) {
		this.sentceSetKey = sentceSetKey;
	}


	// @Column(name="SENTCE_STYLE_KEY")
	public short getSentceStyleKey() {
		return this.sentceStyleKey;
	}

	public void setSentceStyleKey(short sentceStyleKey) {
		this.sentceStyleKey = sentceStyleKey;
	}


	// @Column(name="SENTCE_TYPE_KEY")
	public short getSentceTypeKey() {
		return this.sentceTypeKey;
	}

	public void setSentceTypeKey(short sentceTypeKey) {
		this.sentceTypeKey = sentceTypeKey;
	}


	// @Column(name="SET_PID", nullable=false)
	public short getSetPid() {
		return this.setPid;
	}

	public void setSetPid(short setPid) {
		this.setPid = setPid;
	}


	// @Column(name="THEME_KEY")
	public short getThemeKey() {
		return this.themeKey;
	}

	public void setThemeKey(short themeKey) {
		this.themeKey = themeKey;
	}


	// @Column(name="THIS_HDATE_INFERRED")
	public boolean getThisHdateInferred() {
		return this.thisHdateInferred;
	}

	public void setThisHdateInferred(boolean thisHdateInferred) {
		this.thisHdateInferred = thisHdateInferred;
	}


	// @Column(name="THIS_HDATE_PID")
	public int getThisHdatePid() {
		return this.thisHdatePid;
	}

	public void setThisHdatePid(int thisHdatePid) {
		this.thisHdatePid = thisHdatePid;
	}


	// @Column(name="THIS_NAME_EVENT_PID")
	public int getThisNameEventPid() {
		return this.thisNameEventPid;
	}

	public void setThisNameEventPid(int thisNameEventPid) {
		this.thisNameEventPid = thisNameEventPid;
	}

}