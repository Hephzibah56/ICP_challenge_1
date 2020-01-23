import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestProductStock {
    /* This method creates a backup file, called backup_essentials-stock.txt and stores the data read from the original file-essentials.txt. 
     * @Exception throws  IOException using throws and try and catch block.
     */

	public static void main(String[] args) {
		ProductStock items = new ProductStock();
		
		System.out.println("Input 10 items in the format. ItemName    Quantity   Price(GHC)");
		  FileWriter writer = null;
		  BufferedWriter bwriter = null;
		  try {
			  bwriter = new BufferedWriter(new FileWriter ("essentials_stock.txt", true));
			  bwriter.write("Item Name - Item Price - Item Quantity");
			  bwriter.newLine();
			  for(int i =0; i < 10;i++){
				  Scanner userInput = new Scanner(System.in);
				  System.out.println("Input Next Item: ");
				  String items1 = userInput.nextLine();
				  bwriter.newLine();
				  bwriter.write(items1);
				   
			  }
			  bwriter.flush();
			  bwriter.close();
		  }
		  catch (Exception ty) {
			  System.out.println(ty);
			 }

		  
		  Path source = Paths.get( "essentials_stock.txt");
          Path target = Paths.get( "backup_essentials_stock.txt");
          try {
        	 Files.copy(source, target);
        	}
              
          catch(IOException fit) {
        	  fit.printStackTrace();
          }
        

	//Reading file
		File file = new File ("essentials_stock.txt");
		try {
			Scanner obj = new Scanner(file);
			while (obj.hasNextLine()) {
				System.out.println(obj.nextLine());
		}
		}
		catch (Exception pkl) {
		}
	}
}
	
	
