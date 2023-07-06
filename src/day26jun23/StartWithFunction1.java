package day26jun23;

public class StartWithFunction1 {

	public static void main(String[] args) {
		
		char ch = 's';
		int occ =4 ;
		int orgocc = occ;
		String str = "all indians are my brothers and sisters.";
		int startIndex = -1,ind=0;
		if(occ>0)
		{
			while(occ>0)
			{
				ind = str.indexOf(ch,startIndex +1);
				if(ind==1)
					break;
				else
					occ--;
				startIndex = ind;
				
			}
			if (occ == 0)
				System.out.println("ind : "+ ind);
			else
				System.out.println("s does not occu" + orgocc+"times");
			
				}
		
		else
			System.out.println("occ values is invalid "+ orgocc);
		
		
		
		
		
		
		
		
		
		

	}

}
