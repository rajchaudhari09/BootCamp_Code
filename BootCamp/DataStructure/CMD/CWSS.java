package CMD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class CWSS 
{
	@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException
	{
		File file=new File("C:\\Users\\RAJ\\Documents\\BE Comp Project 08-06-2019\\Project\\A11.docx");
		FileInputStream fileStream= new FileInputStream(file);
		InputStreamReader input= new InputStreamReader(fileStream);
		BufferedReader reader= new BufferedReader(input);
		
		String line;
		
		int countWord=0;
		int sentenceCount=0;
		int characterCount=0;
		int paragraphCount=1;
		int whitespaceCount=0;
		
		while((line=reader.readLine())!=null)
		{
			if(line.equals(" "))
			{
				paragraphCount++;
			}
			if(!(line.equals(" ")))
			{
				characterCount+=line.length();
				
				String[] wordList=line.split("\\s+");
				
				countWord+=wordList.length;
				whitespaceCount+=countWord-1;
				
				String[] sentenceList=line.split("[!?.:]+");
				sentenceCount +=sentenceList.length;
				
			}
		}
		System.out.println("Total word count = "+countWord);
		System.out.println("Total number of sentence = "+sentenceCount);
		System.out.println("Total number of character = "+characterCount);
		System.out.println("Total number of paragraph = "+paragraphCount);
		System.out.println("Total number of whitespaces = "+whitespaceCount);
	}
}
