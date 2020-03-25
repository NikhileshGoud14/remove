package com.epam.tddjunitdemo;

public class Delete 
{
	public String remove(String string) {
		String result = string;
		int stringLength = string.length();
		char f = string.charAt(0);
		char l = string.charAt(1);
		if(l=='A')
		{
			string.replace('A','0');
			if(f=='A')
			{
				string.replace('A','0');
			}
		}
		else 
		if(f!='A' && l!='A')
		{
			result = string.substring(0,stringLength);
		}
		return result;
	}
}
