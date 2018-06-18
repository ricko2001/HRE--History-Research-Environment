package org.historyresearchenvironment.dataaccess;

import java.io.Serializable;


/**
 * The persistent class for the GUI_LANGUAGES database table.
 * 
 */
// @Entity
// @Table(name="GUI_LANGUAGES")
// @NamedQuery(name="GuiLanguage.findAll", query="SELECT g FROM GuiLanguage g")
public class GuiLanguage implements Serializable {
	private static final long serialVersionUID = 1L;
	private int recordNum;
	private int commitPid;
	private String data1Language;
	private String data2Language;
	private String dfltLanguage;
	private String guiLanguage;
	private int guiLanguagePid;
	private short reminderKey;
	private String reportLanguage;
	private short setKey;

	public GuiLanguage() {
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


	// @Column(name="DATA1_LANGUAGE", length=4)
	public String getData1Language() {
		return this.data1Language;
	}

	public void setData1Language(String data1Language) {
		this.data1Language = data1Language;
	}


	// @Column(name="DATA2_LANGUAGE", length=4)
	public String getData2Language() {
		return this.data2Language;
	}

	public void setData2Language(String data2Language) {
		this.data2Language = data2Language;
	}


	// @Column(name="DFLT_LANGUAGE", length=4)
	public String getDfltLanguage() {
		return this.dfltLanguage;
	}

	public void setDfltLanguage(String dfltLanguage) {
		this.dfltLanguage = dfltLanguage;
	}


	// @Column(name="GUI_LANGUAGE", length=4)
	public String getGuiLanguage() {
		return this.guiLanguage;
	}

	public void setGuiLanguage(String guiLanguage) {
		this.guiLanguage = guiLanguage;
	}


	// @Column(name="GUI_LANGUAGE_PID", nullable=false)
	public int getGuiLanguagePid() {
		return this.guiLanguagePid;
	}

	public void setGuiLanguagePid(int guiLanguagePid) {
		this.guiLanguagePid = guiLanguagePid;
	}


	// @Column(name="REMINDER_KEY")
	public short getReminderKey() {
		return this.reminderKey;
	}

	public void setReminderKey(short reminderKey) {
		this.reminderKey = reminderKey;
	}


	// @Column(name="REPORT_LANGUAGE", length=4)
	public String getReportLanguage() {
		return this.reportLanguage;
	}

	public void setReportLanguage(String reportLanguage) {
		this.reportLanguage = reportLanguage;
	}


	// @Column(name="SET_KEY", nullable=false)
	public short getSetKey() {
		return this.setKey;
	}

	public void setSetKey(short setKey) {
		this.setKey = setKey;
	}

}