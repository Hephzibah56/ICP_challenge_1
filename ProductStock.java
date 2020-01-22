import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.LineNumberReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * This code represents string a class that gets user's input of items that should be stocked in essentials shop.
 * The class called my ProductStock contains instance variables, getter methods and setter methods that get
 *  the user's input value of the item to be stocked, the quantity and the price in cedis.
 * @author Hephzibah Emereole
 * @java version 1.8
 * @constructor initializes the instance variables of the class.
 * @instance variables - item name, item quantity, item_price
 * 
 * 
 */


public class ProductStock  {

    public String Item_name;
    public double Item_price;
    public int Item_quantity;

    public ProductStock (){
        this.Item_name = Item_name;
        this.Item_price = Item_price;
        this.Item_quantity = Item_quantity;
    }
    public String userDataInput(){
        System.out.println("Please enter the value after prompt below in the form (ItemName  Quantity   Price(GHC)): ");
        Scanner userinput = new Scanner(System.in);
        String input =  userinput.nextLine();
        return input;
    }

    
    public void setItem_name(){
        this.Item_name = userDataInput();
    }

    public void setItem_price(){
        double Pricee = Double.parseDouble(userDataInput());
        this.Item_price = Pricee;
    }

    public void setItem_quantity(){
        int quantityy = Integer.parseInt(userDataInput());
        this.Item_quantity= quantityy;
    }

    public String get_ItemName(){
        return this.Item_name;
    }

    public Double get_ItemPrice(){
        return this.Item_price;
    }

    public Integer get_ItemQuantity(){
        return this.Item_quantity;
    }

    public void getData(){
        setItem_name();
        setItem_price();
        setItem_quantity();
    }
       
    	/*
	     * This method prints the data from the user's input to the console.
	     */
	    
    	public void printData(){
	        System.out.println("Item Name" + "        "+"Item Price" + "        " + "Item Quantity" + "         ");
	        System.out.println(get_ItemName() + "          " + get_ItemPrice() + "           " + get_ItemQuantity());
    			}
	          }
    
		
