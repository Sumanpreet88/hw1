package lab_1;
import java.io.*;
import java.util.*;
public class report_of_student {
	//for total of the numbers of assignment
	int calc(String  p[])
	{
		int sum=0;
		for(int i=2;i<12;i++)
			{
				int n = Integer.parseInt(p[i]);
				sum=sum+n;
			}
		return sum;
	}
	
	int avrg(int a,int b)
	{
		return (a/b);
	}

	   public static void main(String args[]) throws IOException {  
	      File ipfile1=new File("D:\\Suman CSE\\Suman cse desktop\\JAVA_ASSIGNMENTS\\HW1\\HW1\\HW1-data.txt");
	      File outfile1=new File("D:\\Suman CSE\\Suman cse desktop\\JAVA_ASSIGNMENTS\\HW1\\HW1\\output_2.txt");

	    	  BufferedReader ob=new BufferedReader(new FileReader(ipfile1));
	    	  FileWriter f = new FileWriter(outfile1);
	         int countstd=0;
	         int stsum=0;
	         int acnt=0;
	         int bcnt=0;
	         int ccnt=0;
	         int dcnt=0;
	         int ecnt=0;
	         int maxpt=0;
	         String c;
	         String newLine = System.getProperty("line.separator");
	         f.write("Stdnt id Ex -------- Assignments --------- Tot Mi Fin CL Pts Pct Gr "+ newLine);
	         f.write("-------------------------------------------------------------------"+ newLine);
	         report_of_student l=new report_of_student();
	         while ((c = ob.readLine()) != null)
	         {
	        	 countstd++;
	        	 String temp[] = c.split(" +");
	        	 
	        	 f.write(temp[0]+" " + temp[1]+" ");
	        	 for(int i=2;i<12;i++)
	        	 {
	        		 if(temp[i].length()==1)
	        			 f.write(" ");
	        		 f.write(temp[i]+" ");
	        	 }
	        	  
	        	 
	        	 
		 			int sum=l.calc(temp);
		        	 f.write(" " +sum +" ");
		        	 
		        	 f.write(temp[12] + " ");
		        	 f.write(temp[13] + "  ");
		        	 if(temp[14].length()==1)
		        		 f.write(" ");
		        	 f.write(temp[14] + " ") ;
		        	 
		        	
		        	 int pts=Integer.parseInt(temp[1])+sum+Integer.parseInt(temp[12])+Integer.parseInt(temp[13])+Integer.parseInt(temp[14]);
		        	 f.write(pts+ " ");
		        	 if(maxpt<pts)
		        		 maxpt=pts;
		        	 stsum+=pts;
		        	 
		        	 int pct=(pts*100)/420;
		        	 f.write(pct + "   ");
		        	 String gr;
		        	 if(pct>=90)
		        	 {
		        		gr="A"; 
		        		acnt++;
		        	 }
		        	 else if(pct>=78&&pct<=89)
		        	 {
		        		 gr="B";
		        		 bcnt++;
		        	 }
		        	 else if(pct>=62&&pct<=77)
		        	 {	
		        		 gr="C";
		        		 ccnt++;
		        	 }
		        	 else if(pct>=46&&pct<=61)
		        	 {
		        		 dcnt++;
		        		 gr="D";
		        	 }
		        	 else
		        	 {
		        		 ecnt++;
		        		 gr="E";
		        	 }
		        	 f.write(gr);
		        	 
		        	 f.write(newLine);
	         }
	         f.write(newLine);
	         
	         int avg=l.avrg(stsum,countstd);
	         f.write("Average total point percent of all students :"+ avg);
	         f.write(newLine);
	         f.write("count of A :"+acnt);
	         f.write(newLine);
	         f.write("count of B :"+bcnt);
	         f.write(newLine);
	         f.write("count of C :"+ccnt);
	         f.write(newLine);
	         f.write("count of D :"+dcnt);
	         f.write(newLine);
	         f.write("count of E :"+ecnt);
	         f.write(newLine);
	         f.write(newLine);
	         f.write("Max points achieved by a student :" + maxpt);
	         
	         
	         ob.close();
	         f.close();
	  }
	
}





