
public class susobhan {
	public static void main(String args[]) {
		String s= "susobhan is doing his be in skit";
		
		String line  [] = s.split(" ");
		int n =line.length;
		for(int i =0;i<n;i++) {
			String word= line[i];
			//word = happy  -> HappY
			int m = word.length();
			String result=" ";
			for(int j=0;j<m;j++) {
				String first = String.valueOf(word.charAt(0)).toUpperCase();
				String last= String.valueOf(word.charAt(m-1)).toUpperCase();
				
				String middle="";
				for(int k=1;k<=m-2;k++) {
					middle+=word.charAt(k);
					
				}
				result = first+middle+last;
				
				
				
			}
			System.out.print(result+" ");
			
		    
		
			
		}
	}

}
