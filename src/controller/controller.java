package controller;

import java.util.Scanner;
import java.util.ArrayList;

public class controller
{
	
	private Scanner keyboardInput;
	private ArrayList<String> nameList;
	public controller()
	{
		this.keyboardInput = new Scanner(System.in);
	}
	

public void start()
{
	listDemo();
	
	keyboardInput.close();
}
private void listDemo()
{
	System.out.println("What is the word?");
	String firtWord = keyboardInput.nextLine();
	System.out.println("type in another word...");
	String secondWord = keyboardInput.nextLine();
	
	for (int index = 0; index <10; index++)
	{
		System.out.println("type in a name...");
		String name = keyboardInput.nextLine();
		nameList.add(name);
	}
	System.out.println("Name is NOT available :(");
	System.out.println("But the list is!!");
	
	for (int index = 0; index < nameList.size(); index++)
	{
		System.out.println("the" + index + "the name is: " + nameList.get(index));
	}
}
}


