package com.app.dao;

import java.util.List;

import com.app.model.UploadFile;

public interface IDocumentDao
{
	public int saveDocument(UploadFile file);
	public UploadFile getObjById(int fileid);
	public List<Object[]> getNamesAndId();
}
