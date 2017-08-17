package com.es.Controller;

import com.es.Entity.PDF;
import com.es.Service.PDFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by wang on 2017/8/17.
 */
@RestController
@RequestMapping("/PDF")
public class PDFController {

	@Autowired
	private PDFService pdfService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<PDF> getAllPDF(){

		return pdfService.getAllPDF();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public PDF getPDFByID (@PathVariable("id") int id){

		return this.pdfService.getPDFByID(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removePDFbyID(@PathVariable("id") int id){

		pdfService.removePDFbyID(id);
	}
}
