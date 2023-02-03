public class Main {
     
public static void main(String args[])   
{    
  int i, j, row=6;  



  for(i=0; i<row; i++)   
  {   
    for(j=0; j<=i; j++)   
    {  
      System.out.print("^ ");   
    } 
    
    for(int k=i ; k<=row ; k++)
    {
      System.out.print("* ");
    }  
    System.out.println(); 
  }   
  System.out.println();  System.out.println();  



  for(i=0; i<=row; i++)   
  {   
    for(j=i; j<=row; j++)   
    {  
      System.out.print("* ");   
    } 
    System.out.println();   
  }  

  

  for (i=0; i<=row; i++)   
  {     
    for (j=2*(row-i); j>=0; j--)         
    {      
      System.out.print(" ");   
    }   
    for (j=0; j<=i; j++ )   
    {     
      System.out.print("* ");   
    }  
    System.out.println();   
  } 
  System.out.println();  System.out.println();  



  for (i=0; i<row; i++)   
  {     
    for (j=(row-i); j>=0; j--)         
    {      
      System.out.print(" ");   
    }   
    for (j=0; j<=i; j++ )   
    {     
      System.out.print("* ");   
    }
    System.out.println();
  }
  System.out.println();  System.out.println();



  for (i=0; i<row; i++)   
  {     
    for (j=(row-i); j>=0; j--)         
    {      
      System.out.print(" ");   
    }   
    for (j=0; j<=i; j++ )   
    {     
      System.out.print("* ");   
    }  

    for (int k=(row-i); k>=0; k--)         
    {      
      System.out.print("* ");   
    }   
    for (int k=0; k<=i; k++ )   
    {     
      System.out.print(" ");   
    } 
    System.out.println();   
  } 
  System.out.println();System.out.println();



  for (i= 0; i<= row-1; i++)  
  {  
  for (j=0; j<=i; j++)  
  {  
  System.out.print(" ");  
  }  
  for (int k=0; k<=row-1-i; k++)  
  {  
  System.out.print("*" + " ");  
  }  
  System.out.println();  
  }  


} 



}