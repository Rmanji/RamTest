
public class CountStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str1="aaaabbbbcddfgg";
  String str2="";
  
  char ch[]=new char[str1.length()];
  int count=0;
  //System.out.println("Adding newline");
  
  for(int i=0;i<str1.length();i++)
  {
	  count=0;
	  for(int j=0;j<str1.length();j++)
	  {  
		  if(str1.charAt(i)==str1.charAt(j))
		  {
			 count++; 
		  }
		  
		   ch[i]=str1.charAt(i);
		 // str2=str2+str1.charAt(i);
  }
	  System.out.println(ch[i]+" Given String :"+count);
	}
  
	}

}
