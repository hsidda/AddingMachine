package cse360assign2;

/**
 * Name: Harsha Sidda 
 * Email: hsidda@asu.edu
 * Class Section: 70642 (Wednesday)
 * Assignment Description: This assignment helps us create a repository on Github and exports this
   project there. This program tracks operations on a number.
**/

public class AddingMachine 
{
	private int total;
	private String opsHist;
	
	public AddingMachine() //constructor to set the operations history and total as 0
	{
		total = 0;
		opsHist = "0";
	}
	public int getTotal() //method to return total value
	{
		return total;
	}
	public void add(int value) //method to add parameter to total
	{
		total += value;
		opsHist = opsHist + " + " + value;
	}
	public void subtract(int value) //method to subtract parameter from total
	{
		total -= value;
		opsHist = opsHist + " - " + value;
	}
	public String toString() //method to return the operations history
	{
		return opsHist;
	}
	public void clear() //method to reset the data
	{
		total = 0;
		opsHist = "0";
	}
}