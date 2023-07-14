//parameterization = fetching external data (here from excell sheet) in selenium

package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		
//--------------------------------------String value---------------------------------------------------
		
//		String x = WorkbookFactory.create(file).getSheet("Data1").getRow(1).getCell(3).getStringCellValue();
//		
//		System.out.println(x);
		
//--------------------------------------Integer value---------------------------------------------------

//		double y = WorkbookFactory.create(file).getSheet("Data1").getRow(2).getCell(2).getNumericCellValue();
//		
//		System.out.println(y);	
		
//--------------------------------------boolean value---------------------------------------------------

//		boolean z = WorkbookFactory.create(file).getSheet("Data1").getRow(0).getCell(2).getBooleanCellValue();
//		
//		System.out.println(z);

//--------------------------------------Last-row number---------------------------------------------------

//		int q = WorkbookFactory.create(file).getSheet("Data1").getLastRowNum();
//		
//		System.out.println(q);           //as a index
//		System.out.println(q+1);         //as a row number

//--------------------------------------Last-cell number---------------------------------------------------

//		int q = WorkbookFactory.create(file).getSheet("Data1").getRow(1).getLastCellNum();
//		
//		System.out.println(q);            //here no need to do +1
		
//--------------------------------------print single row---------------------------------------------------

//		Sheet q = WorkbookFactory.create(file).getSheet("Data1");
//		
//		short cellsize = q.getRow(0).getLastCellNum();       //for first row
//		
//		for (int i=0; i<cellsize; i++)
//		{
//			Cell x = q.getRow(0).getCell(i);                 //for first row
//			System.out.print(x+" ");
//		}

//--------------------------------------print single column---------------------------------------------------

//		Sheet q = WorkbookFactory.create(file).getSheet("Data1");
//		
//		int rowsize = q.getLastRowNum();                     
//		
//		for (int i=0; i<=rowsize; i++)
//		{
//			Cell x = q.getRow(i).getCell(0);                 //for first column
//			System.out.println(x+" ");
//		}

//--------------------------print table (all cell of string data type)---------------------------------------------------
		
//		Sheet q = WorkbookFactory.create(file).getSheet("Data1");
//
//		for (int i=0; i<=q.getLastRowNum(); i++)
//		{
//			for (int j=0; j<=q.getRow(i).getLastCellNum()-1; j++)
//			{
//				String result = q.getRow(i).getCell(j).getStringCellValue();
//				System.out.print(result+" ");
//			}
//			System.out.println();
//		}

//-----------------------------------print cell type---------------------------------------------------
	
//		Sheet q = WorkbookFactory.create(file).getSheet("Data1");
//		
//		CellType w = q.getRow(0).getCell(0).getCellType();
//		
//		System.out.println(w);

//----------------------------print cell value of any type---------------------------------------------------

//		Cell q = WorkbookFactory.create(file).getSheet("Data1").getRow(2).getCell(0);
//		
//		CellType w = q.getCellType();
//		
//		if(w==CellType.STRING)
//		{
//			System.out.println(q.getStringCellValue());
//		}
//		else if (w==CellType.NUMERIC)
//		{
//			System.out.println(q.getNumericCellValue());
//		}
//		else if (w==CellType.BOOLEAN)
//		{
//			System.out.println(q.getBooleanCellValue());
//		}

//-------Method-1--------print table of any type of cell value---------------------------------------------------
	
//		Sheet q = WorkbookFactory.create(file).getSheet("Data1");
//		
//		for (int i=0; i<=q.getLastRowNum(); i++)
//		{
//			for (int j=0; j<=q.getRow(i).getLastCellNum()-1; j++)
//			{
//				Cell v = q.getRow(i).getCell(j);
//				CellType w = v.getCellType();
//				
//				if(w==CellType.STRING)
//				{
//					System.out.print(v.getStringCellValue()+"  ");
//				}
//				else if (w==CellType.NUMERIC)
//				{
//					System.out.print(v.getNumericCellValue()+"  ");
//				}
//				else if (w==CellType.BOOLEAN)
//				{
//					System.out.print(v.getBooleanCellValue()+"  ");
//				}
//			}
//			System.out.println();
//		}
	
//----------Method-2------print table of any type of cell value---------------------------------------------------

//		Sheet q = WorkbookFactory.create(file).getSheet("Data1");
//		
//		for (int i=0; i<=q.getLastRowNum(); i++)
//		{
//			for (int j=0; j<=q.getRow(i).getLastCellNum()-1; j++)
//			{
//				Cell v = q.getRow(i).getCell(j);
//				System.out.print(v+" ");
//			}
//			System.out.println();
//		}
	
	
	
	}

}
