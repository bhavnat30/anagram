import java.io.*;

import java.util.*;

public class FindAnagram
{

  static int NO_OF_CHARS=256; 

  public static boolean isAnagram(char[] str1, char[] str2)
  
{
    int count[]=new int[NO_OF_CHARS];
  
  int i;
  
  for(i=0; i<str1.length && i< str2.length;i++)
  
  {
       count[str1[i]]++;
    
   count[str2[i]]--;
    }
  
  if(str1.length != str2.length)
    
  return false;
   
 
    for(i=0;i<NO_OF_CHARS;i++)
   
 {
      if(count[i]!=0)
        return false;
    }
   
 return true;
  }
 

}
