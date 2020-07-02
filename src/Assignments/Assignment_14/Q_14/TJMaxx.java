package Assignments.Assignment_14.Q_14;

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {

	private List<Item> regularItems;
	private List<OnSaleItem> onSaleItems;
	
	public TJMaxx() {
		this.regularItems=new ArrayList<>();
		this.onSaleItems=new ArrayList<>();
	}

	public void addregularItem(Item item) {
		this.regularItems.add(item);
	}
	
	public void addOnSaleItem(OnSaleItem item) {
		this.onSaleItems.add(item);
	}

	public List<Item> getRegularItems() {
		return regularItems;
	}

	public List<OnSaleItem> getOnSaleItems() {
		return onSaleItems;
	}
	
	//return count of regularItem object
	public int regularItemsCount() {
		return this.regularItems.size();
	}
	
	//returns count of onSaleItems in TJ Maxx
	public int onSaleItemsCount() {
		return this.onSaleItems.size();
	}
	
	/** * returns the name of each item in TJ Maxx starting     
	 *  * from regular item then onSaleItems */
	public List<String> getAllItemNames(){
		List merged = new ArrayList(regularItems);
		merged.addAll(onSaleItems);
		return merged;
	}
	
	/*** gets catalog number and returns price for the item     
	 * * it will search for the item both regularItems and onsaleonSaleItems     
	 * * @param catalogNumber     
	 * * @returns 0.0 if product cannot be found with that catalognumber     */    
	public double getItemPrice(int catalogNumber)    { 
			for(int i=0;i<regularItems.size();i++) {
				if(regularItems.get(i).getCatalogNumber()==catalogNumber){
					return regularItems.get(i).getPrice();
				}
			} 
			for(int i=0;i<onSaleItems.size();i++) {
				if(onSaleItems.get(i).getCatalogNumber()==catalogNumber){
					return onSaleItems.get(i).getPrice();
				}
			}					
			return 0.0;    
	}
	
	/*** accepts a name then searches     
	 * * among onSaleItems. Once it finds, the method will return     
	 * * that OnSaleItem object     * @param name     * @return     
	 * */    
	public OnSaleItem getOnSaleItem(String name)    { 
		for(int i=0;i<onSaleItems.size();i++) {
			if(onSaleItems.get(i).getName().equals(name)){
				return onSaleItems.get(i);
			}
		}
		return null;    	
	}
	
	/*** removes the item with matching catalogNumber     
	 * * from both regularItems and onSaleItems.     
	 * * Does nothing if not found     
	 * * @param catalogNumber     */    
	public void removeItem(int catalogNumber) {  
		// for onSaleItems
		for(int i=0;i<onSaleItems.size();i++) {
			if(onSaleItems.get(i).getCatalogNumber()==catalogNumber){
				onSaleItems.remove(i);
			}
		}
		// for regularItems
		for(int i=0;i<regularItems.size();i++) {
			if(regularItems.get(i).getCatalogNumber()==catalogNumber){
				regularItems.remove(i);
			}
		}
	}
	
	/** * - it accepts a catalog number and finds that item     
	* among regularItems and onSaleItems     
	* - if it finds the item:     
	* - decrease the count of the Item by 1     
	* - if count reaches 0 after decrementing then remove the product(call removeItem method)     *     * @param catalogNumber     */    
	public void buyItem(int catalogNumber) { 
		for(int i=0;i<regularItems.size();i++) {
			if(regularItems.get(i).getCatalogNumber()==catalogNumber){
				if(regularItems.get(i).getQuantity()-1==0) {
					regularItems.remove(i);
				}else {
					regularItems.get(i).setQuantity(regularItems.get(i).getQuantity()-1);
				}
			}
		}
		for(int i=0;i<onSaleItems.size();i++) {
			if(onSaleItems.get(i).getCatalogNumber()==catalogNumber){
				if(onSaleItems.get(i).getQuantity()-1==0) {
					onSaleItems.remove(i);
				}else {
					onSaleItems.get(i).setQuantity(onSaleItems.get(i).getQuantity()-1);
				}
			}
		}
	}
	
}
