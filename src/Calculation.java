import java.util.TreeMap;

public class Calculation {
	static String entry(double money, int days, int rating) {
		double amount,finalAmount,discount;

		TreeMap <Double,String> tm=new TreeMap<Double,String>();
		if(rating==5){
		if(days>2){
			amount=(days*90);
			discount=amount*0.20;
			finalAmount=amount-discount;
			tm.put( finalAmount,"Park");
			
		}
		
		 if(days>3){
			amount=(days*82);
			discount=amount*0.12;
			finalAmount=amount-discount;
			tm.put(finalAmount,"Hyaat");
			
		 }
		
		}
					
		if(rating==3){
			
		if(days>3){
			amount=(days*60);
			discount=amount*0.18;
			finalAmount=amount-discount;
			tm.put( finalAmount,"Raddison");
			
		}
		
		if(days>2){
			amount=(days*58);
			discount=amount*0.15;
			finalAmount=amount-discount;
			tm.put( finalAmount,"RainTree");
			
		}
		}
		
		
		if(rating==1){
		if(days>3){			
			amount=(days*41.55);
			discount=amount*0.118;
			finalAmount=amount-discount;
			tm.put( finalAmount,"Accord");
			
		}
		
		if(days>4){
			amount=(days*43);
			discount=amount*0.148;
			finalAmount=amount-discount;
			tm.put( finalAmount,"Fortune");
			
		}
		
		}
		
		//System.out.println(tm.toString());
		
		
		double comp=tm.firstKey();
		
		if(comp<money){
			
		return "Hotel"+tm.get(tm.firstKey())+" is booked for "+days+" days in "+rating+" star hotel \n The cost of  "+tm.get(tm.firstKey())+" is $"+comp;
		}
				
		
		else{
			
		return "Sorry! you dont have sufficient amount to book any hotel";
		
		}
	
		
			}
	
}
