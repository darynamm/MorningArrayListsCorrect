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
	sortingStuff();
	
	keyboardInput.close();
}

private void intSort()
{
	
int [] small = {9, 4, 31, 123, 76, 0, -3, -10};
	
	int [] huge = new int [600_000];
	for (int index = 0; index < huge.length; index++)
	{
		int value = (int)(Math.random() * 365);
		huge[index] = value;
	}
	selectionSort(small);
	selectionSort(huge);
	for (int number : small)
	{
		System.out.println(number + "");
	}
	for (int number : small)
	{
		System.out.print(number + " ");
		
	}
	System.out.println();
	for (int number : huge)
	{
		System.out.print(number + "");
	}
}
private void selectionSort(String [] words)
{ 
	for (int outerLoop = 0; outerLoop < words.length; outerLoop++)
	{
		int maxIndex = outerLoop;
		for (int inner = outerLoop + 1; inner < words.length; inner ++)
		{
			if (words[inner].compareToIgnoreCase(words[maxIndex]) < 0)
			{
				maxIndex = inner;
			}
		}
		if (maxIndex != outerLoop)
		{
			swapItems(maxIndex, outerLoop, words);
		}
	}
}

private void sortingStuff()
{
	
stringSort();
}

private void stringSort()
{
	String [] myWords = {"Computer", "Science", "at", "CTEC", "rocks", "!"};
	
	selectionSort(myWords);
	for (String word : myWords)
	{
		System.out.print(word + " " );
	}
}
private void selectionSort(int [] data)
{
	for (int outerLoop = 0; outerLoop < data.length; outerLoop++)
	{
		int minIndex = outerLoop;
		for (int inner = outerLoop + 1; inner < data.length; inner ++)
		{
			if (data[inner] < data[minIndex])
			{
				minIndex = inner;
			}
		}
		if (minIndex != outerLoop)
		{
			swapItems(minIndex, outerLoop, data);
		}
	}
}
private void swapItems(int firstIndex, int secondIndex, int [] source)
{
	
	
	int thirdHand = source [firstIndex];
	source [firstIndex] = source[secondIndex];
	source [secondIndex] = thirdHand;
}
private void swapItems(int firstIndex, int secondIndex, String [] source)
{
	
	String temp = source[firstIndex];
	source [firstIndex] = source[secondIndex];
	source [secondIndex] = temp;

}


public void listDemo()
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

String thisWasTheLastname = nameList.remove(nameList.size() - 1);

System.out.println("There are now" + nameList.size() + " names in the list");
System.out.println("we took out: " + thisWasTheLastname);


}
}



