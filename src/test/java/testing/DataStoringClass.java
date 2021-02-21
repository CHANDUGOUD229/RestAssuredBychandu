package testing;
import org.testng.annotations.DataProvider;

public class DataStoringClass 
{
	@DataProvider(name="DataForPost")	
	public Object[][] dataForPost()
	{
//		 Object[][] data=new Object[2][3];
//		 data[0][0]="chandra shekhar";
//		 data[0][1]="wipro";
//		 data[0][2]="Amma";
// 
//		 data[1][0]="Abhi";
//		 data[1][1]="cabgemine";
//		 data[1][2]="Nanna";
		 
		 return new Object[][]
		{
			 
			 {"chandrashekhar","dell","Viggu"},
			 {"Abhinay","wipro","Pushpa"},
			 {"little","sharp","deepu"},
			 {"chandrashekhar","dell","Viggu"},
			 {"Abhinay","wipro","Pushpa"},
			 {"little","sharp","deepu"}
			 
			 
		};
		 
	}
	
	@DataProvider(name="DeletData")
	public Object[] dataForDelet()
	{
		return new Object[]
		{
			509,107,742,728,688,436
		};
	}


}
