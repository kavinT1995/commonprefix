# commonprefix
public class Prefix {
	public void display(String[] s1) {
		int min=0;
		for(int i=0;i<s1.length-1;i++){
	    min = Math.min(s1[i].length(), s1[i+1].length());
		}
	   for (int i = 0; i < min-1; i++) {
	        if (s1[i].charAt(i) != s1[i+1].charAt(i)) {
	            System.out.println(s1[i].substring(0, i));
	            System.exit(0);
	            
	        }
	    }
	    System.out.println(s1[0].substring(0, min));
	   
	}
    
	public static void main(String[] args) {
		Prefix p=new Prefix();
		Scanner sr=new Scanner(System.in);
		String s[]=new String[2];
		for(int i=0;i<s.length;i++){
			s[i]=sr.nextLine();
		}
		p.display(s);
		
}
}
