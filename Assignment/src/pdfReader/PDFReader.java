package pdfReader;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReader
{
	@Test
	public static void readPDF() throws Exception {
		File file = new File("C:\\Users\\CPSCUST\\Desktop\\Pushpendra CV -TYss.pdf");
		PDDocument doc = PDDocument.load(file);
		PDFTextStripper stripper = new PDFTextStripper();
		String string = stripper.getText(doc);
		System.out.println(string);
		Assert.assertTrue(string.contains("handling Listbox"));
		doc.close();	
	}	
}

