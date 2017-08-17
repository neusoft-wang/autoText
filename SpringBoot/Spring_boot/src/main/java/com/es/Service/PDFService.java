package com.es.Service;

import com.es.Dao.PDFDao;
import com.es.Entity.PDF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by wang on 2017/8/17.
 */
@Service
public class PDFService {

	@Autowired
	private PDFDao pdfDao;

	public Collection<PDF> getAllPDF(){

		return pdfDao.getAllPDF();
	}

	public PDF getPDFByID (int id){

		return this.pdfDao.getPDFByID(id);
	}

	public void removePDFbyID(int id) {

		this.pdfDao.removePDFbyID(id);
	}
}
