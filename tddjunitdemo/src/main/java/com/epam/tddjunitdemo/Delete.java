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
		else
		if(stringLength<=1 && stringLength!=0 && result.charAt(0)=='A')
		{
			StringBuffer sb=new StringBuffer(result);
			sb.delete(0,1);
			return sb.toString();
		}
		else if(stringLength<=1)
		{
			return result;
		}
		else
		if(result.charAt(0)=='A' && result.charAt(1)=='A')
		{
			StringBuffer sb=new StringBuffer(result);
			sb.delete(0,2);
			return sb.toString();
		}
		else if(result.charAt(0)=='A') {
				StringBuffer sb=new StringBuffer(result);
				sb.delete(0,1);
				return sb.toString();
			}
		else if(result.charAt(1)=='A')
			{
				StringBuffer sb=new StringBuffer(result);
				sb.delete(1,2);
				return sb.toString();
			}
		return result;
	}
}
