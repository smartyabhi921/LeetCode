import java.util.Scanner;

class Solution {
    public int lengthOfLastWord(String s) {
                
 int len = 0; s = s.trim();
for(int i=s.length()-1 ; i>0 ; i--) {

  if(s.charAt(i) == ' ')
        {
    break ;  
          }
    else{
    len++;
         }
}
 return len;
    }
public void main(String[] args){

  
    Scanner sc =  new Scanner(System.in);
     
     String s = sc.nextLine();
     
     System.out.print(lengthOfLastWord(s));
  
sc.close();
    
}

}