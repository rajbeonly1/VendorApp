package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IDocumentDao;
import com.app.model.UploadFile;
@Repository
public class DocumentDaoImpl implements IDocumentDao {
 @Autowired
 private  HibernateTemplate ht;
	@Override
	public int saveDocument(UploadFile file) {
		return  (Integer)ht.save(file);
	}

	@Override
	public UploadFile getObjById(int fileid) {
		return ht.get(UploadFile.class,fileid);
	}

	@Override
	public List<Object[]> getNamesAndId() {
		String hql="select fileId,fileName from "+UploadFile.class.getName();
		List<Object[]> arrList=ht.find(hql);
       return arrList;
	}

}
