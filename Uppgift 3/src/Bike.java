/**
 * 
 * @author katarina karnekull
 *
 */


public class Bike {
		private String color; 	/** Instance String for color */
		private int price;		/**Instance variabel for price*/ 
		private int size;		/**Instance variabel for price */
		static private int nbrOfBikes; 	/**Counts nbrs of instances*///<-- means static: samma vŠrde i alla klasser
	
		/**Creates a bike that stores variables and checks using the Constant class*/ 
		public Bike(String pink, int big){
		}
	
		/**Creates a bike that stores variables and checks using the Constant class*/
		public Bike(String frg, int strlk,int kr){
			color = checkColor(frg);
			if(strlk < Constants.MIN_SIZE){
				size = Constants.MIN_SIZE; 
			}if(strlk > Constants.MAX_SIZE){
				size = Constants.MAX_SIZE;
			}else{
				size = strlk;
			}if(kr < Constants.MIN_PRICE){
				price = Constants.MIN_PRICE;
			}if(kr > Constants.MAX_PRICE){
				price = Constants.MAX_PRICE;
			}else{
				price = kr;
			
			}
			
			nbrOfBikes++;
		}
		/**Check the array and returns colors*/
		public String checkColor(String inputColor){
				for(int c = 0; c < Constants._COLOR.length; c++)
					if(inputColor.compareToIgnoreCase(Constants._COLOR[c]) == 0){
						return Constants._COLOR[c];
				}
						return "null";	
	}



		/**A method that returns color*/
		public String getColor(){					
			return color;
			
		}
		
		/**A method that returns size*/
		public int getSizes(){						
			return size;
			
		}
		
		/**A method that returns price*/
		public int getPrice(){				
			return price;
			
		}
		
		/**A method that returns color*/
		static public int getNumbersOfbikes(){		//Static same in all classes
			return nbrOfBikes;

		}
		
}
