package com.app.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="doc_tab")
public class UploadFile {
  @Id
  @GeneratedValue(generator="doc")
  @SequenceGenerator(name="doc",sequenceName="DOC_SEQ")
  @Column(name="f_id")
  private int fileId;
  @Column(name="f_name")
  private String fileName;
  @Lob
  @Column(name="f_data")
  private byte[] fileData;
public int getFileId() {
	return fileId;
}
public void setFileId(int fileId) {
	this.fileId = fileId;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public byte[] getFileData() {
	return fileData;
}
public void setFileData(byte[] fileData) {
	this.fileData = fileData;
}
public UploadFile() {
	super();
}
public UploadFile(int fileId) {
	super();
	this.fileId = fileId;
}
public UploadFile(int fileId, String fileName, byte[] fileData) {
	super();
	this.fileId = fileId;
	this.fileName = fileName;
	this.fileData = fileData;
}
@Override
public String toString() {
	return "UploadFile [fileId=" + fileId + ", fileName=" + fileName
			+ ", fileData=" + Arrays.toString(fileData) + "]";
}
  
}
