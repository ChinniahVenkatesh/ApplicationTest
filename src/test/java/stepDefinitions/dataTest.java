package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class dataTest {
	
	@Given("Login to the page {string}")
	public void login_to_the_page(String string) {
		System.out.pritln(string);
		
	}
	    
	@When("page loads")
	public void page_loads() throws IOException {
		
		XSSFWorkbook xssf = new XSSFWorkbook("C:\\Users\\chinn\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFSheet sheet = xssf.getSheet("Book1");
		String name =  sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		
		
	}
	    
	@Then("Enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	  System.out.println(string);
	  System.out.println(string2); 
	}

	@Then("Entered <username> is correct")
	public void entered_username_is_correct(DataTable dataTable) {
		
	System.out.println(dataTable.cell(0, 0));
	System.out.println(dataTable.cell(0, 1));
	System.out.println(dataTable.cell(0, 2));

	}

}
