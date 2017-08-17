package com.es.Dao;

import com.es.Entity.PDF;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wang on 2017/8/17.
 */
@Repository
public class PDFDao {

	private static Map<Integer,PDF> PDF;

	static {

		PDF = new HashMap<Integer,PDF>(){
			{
				put(1,new PDF("1","12"));
				put(2,new PDF("2","12"));
				put(3,new PDF("3","12"));
			}
		};
	}

	public Collection<PDF> getAllPDF(){

		return PDF.values();
	}

	public PDF getPDFByID (int id){

		return this.PDF.get(id);
	}

	public void removePDFbyID(int id) {

		this.PDF.remove(id);
	}
}
