import java.util.Random;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		price trade generator
		
//		double price = 100d;
//		int volatility =10;
//        boolean bullish = false;
//        int numberOfData = 500;
//        Random r = new Random();
//        double sum =0d;
//        
//        for(int i =0; i<numberOfData; i++) {
//        	double variationPercent = (r.nextGaussian()*volatility)/(numberOfData/20);
////        	double variationPercent = r.nextGaussian()*volatility;
//        	sum += variationPercent;
//        	if (variationPercent>0) variationPercent = Math.min(variationPercent, 10d);
//        	else variationPercent = Math.max(variationPercent, -10d);
//        	price = (1.00 + variationPercent/100d)*price;
//        	System.out.println(price);
//        }
//        System.out.println("----------------------------------");
//        System.out.println(sum);
        
        System.out.println("###################################");
        
//		next clientid from name
        String name = "Micheal";
        String[] partOfNames = name.split(" ");
        int conNumber = 15;
       
        
        
        String nextConNumber = Integer.toString(conNumber);
        int n = nextConNumber.length();
        String zero = new String(new char[5-n]).replace("\0", "0");
        nextConNumber = zero + nextConNumber;
        System.out.println(nextConNumber);
        
        String result = null;
        if(partOfNames.length == 1) result = Character.toString(partOfNames[0].charAt(0))
        									+Character.toString(partOfNames[0].charAt(0))
        									+nextConNumber;
        else result = Character.toString(partOfNames[0].charAt(0))
				+Character.toString(partOfNames[partOfNames.length -1].charAt(0))
				+nextConNumber;
        System.out.println(result);
        
        System.out.println("333333333333333333333333333333333333");
		
//	dematacc
	int dematOne = 1;
//		if required we have to assert length less than equal to 8 but no requirement I can see now
        int dematTwo = 1;
        String dematAccOne = Integer.toString(dematOne);
        String dematAccTwo = Integer.toString(dematTwo);
        String zeroOne = new String(new char[8-dematAccOne.length()]).replace("\0", "0");
        String zeroTwo = new String(new char[8-dematAccTwo.length()]).replace("\0", "0");
        String dematAcc = dematAccOne+zeroOne+zeroTwo+dematAccTwo;
        System.out.println(dematAcc);
        
	}

}
