package com.pdfGenerating;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pdfGenerating.util.ExelReader;
import com.pdfGenerating.util.PdfGenerater;

@SpringBootTest
class PdfGenratingApplicationTests {

	@Test
	void contextLoads() {
		
		ExelReader reads=new ExelReader();
		reads.readExcel();
		PdfGenerater pdf= new PdfGenerater();
		pdf.writeUsingIText();
	}

}
