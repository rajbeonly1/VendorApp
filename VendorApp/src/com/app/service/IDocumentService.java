package com.app.service;

import java.util.List;

import com.app.model.UploadFile;

public interface IDocumentService {
	public int saveDocument(UploadFile file);
	public UploadFile getObjById(int fileid);
	public List<Object[]> getNamesAndId();

}
