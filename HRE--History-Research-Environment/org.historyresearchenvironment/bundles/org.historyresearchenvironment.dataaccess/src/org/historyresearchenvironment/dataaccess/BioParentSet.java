package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the BIO_PARENT_SETS database table.
 * 
 */
// @Entity
// @Table(name="BIO_PARENT_SETS")
// @NamedQuery(name="BioParentSet.findAll", query="SELECT b FROM BioParentSet b")
public class BioParentSet implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int bioParentSetPid;
	private short bioSubTypeKey;
	private int commitPid;
	private int eggProviderPid;
	private boolean isSystem;
	private int mitoProviderPid;
	private int occasnPid;
	private short occasnSubTypeKey;
	private short setKey;
	private int socialParent1Pid;
	private int socialParent2Pid;
	private int spermProviderPid;
	private int uterusProviderPid;
	private int visibleId;

	public BioParentSet() {
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


	// @Column(name="BIO_PARENT_SET_PID", nullable=false)
	public int getBioParentSetPid() {
		return this.bioParentSetPid;
	}

	public void setBioParentSetPid(int bioParentSetPid) {
		this.bioParentSetPid = bioParentSetPid;
	}


	// @Column(name="BIO_SUB_TYPE_KEY")
	public short getBioSubTypeKey() {
		return this.bioSubTypeKey;
	}

	public void setBioSubTypeKey(short bioSubTypeKey) {
		this.bioSubTypeKey = bioSubTypeKey;
	}


	// @Column(name="COMMIT_PID", nullable=false)
	public int getCommitPid() {
		return this.commitPid;
	}

	public void setCommitPid(int commitPid) {
		this.commitPid = commitPid;
	}


	// @Column(name="EGG_PROVIDER_PID")
	public int getEggProviderPid() {
		return this.eggProviderPid;
	}

	public void setEggProviderPid(int eggProviderPid) {
		this.eggProviderPid = eggProviderPid;
	}


	// @Column(name="IS_SYSTEM")
	public boolean getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}


	// @Column(name="MITO_PROVIDER_PID")
	public int getMitoProviderPid() {
		return this.mitoProviderPid;
	}

	public void setMitoProviderPid(int mitoProviderPid) {
		this.mitoProviderPid = mitoProviderPid;
	}


	// @Column(name="OCCASN_PID")
	public int getOccasnPid() {
		return this.occasnPid;
	}

	public void setOccasnPid(int occasnPid) {
		this.occasnPid = occasnPid;
	}


	// @Column(name="OCCASN_SUB_TYPE_KEY")
	public short getOccasnSubTypeKey() {
		return this.occasnSubTypeKey;
	}

	public void setOccasnSubTypeKey(short occasnSubTypeKey) {
		this.occasnSubTypeKey = occasnSubTypeKey;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}


	// @Column(name="SOCIAL_PARENT1_PID")
	public int getSocialParent1Pid() {
		return this.socialParent1Pid;
	}

	public void setSocialParent1Pid(int socialParent1Pid) {
		this.socialParent1Pid = socialParent1Pid;
	}


	// @Column(name="SOCIAL_PARENT2_PID")
	public int getSocialParent2Pid() {
		return this.socialParent2Pid;
	}

	public void setSocialParent2Pid(int socialParent2Pid) {
		this.socialParent2Pid = socialParent2Pid;
	}


	// @Column(name="SPERM_PROVIDER_PID")
	public int getSpermProviderPid() {
		return this.spermProviderPid;
	}

	public void setSpermProviderPid(int spermProviderPid) {
		this.spermProviderPid = spermProviderPid;
	}


	// @Column(name="UTERUS_PROVIDER_PID")
	public int getUterusProviderPid() {
		return this.uterusProviderPid;
	}

	public void setUterusProviderPid(int uterusProviderPid) {
		this.uterusProviderPid = uterusProviderPid;
	}


	// @Column(name="VISIBLE_ID")
	public int getVisibleId() {
		return this.visibleId;
	}

	public void setVisibleId(int visibleId) {
		this.visibleId = visibleId;
	}

}