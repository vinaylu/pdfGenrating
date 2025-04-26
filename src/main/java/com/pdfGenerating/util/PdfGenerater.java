package com.pdfGenerating.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerater {

	   private static final String FILE_NAME = "C:\\Users\\91991\\springtool\\pdfGenrating\\pdfdocs\\sample1.pdf";


	    public void writeUsingIText() {

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

	            //open
	            document.open();

	            Paragraph p = new Paragraph();
	            p.add("Ticket");
	            p.setAlignment(Element.ALIGN_CENTER);

	            document.add(p);
	            
	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(8);

	            document.add(new Paragraph("Ticket Booked", f));

	          //Create Table object, Here 4 specify the no. of columns
	            PdfPTable pdfPTable = new PdfPTable(2);
	            pdfPTable.setWidthPercentage(90f);
	            
	            //Create cells
	            PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("Cell 1"));
	            PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Cell 2"));
	            pdfPCell1.setColspan(2);
	            //Add cells to table
	            pdfPTable.addCell(pdfPCell1);
	            pdfPTable.addCell(pdfPCell2);
	           
	            //Add content to the document using Table objects.
	            document.add(pdfPTable);
	     
	            //Close document and outputStream.
	            document.close();
	            System.out.println("Done");
	         
	        } catch (FileNotFoundException | DocumentException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	}
