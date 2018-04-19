import java.util.HashMap;
import java.util.Map;

public class Service {

	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

	public int id = 1;

	public void addAccount(Account Account) {

		accounts.put(id, Account);
		id++;
	}

	public HashMap<Integer, Account> getAccountMap() {

		return accounts;
	}

	public String RetrieveFromMap(int star) {

		return "Account: " + "FirstName " + accounts.get(star).getFirstName() + " LastName "
				+ accounts.get(star).getLastName() + " AccNo " + accounts.get(star).getAccountNumber();
	}
		
	public int firstNameCounter(String firstName) {
		int counter = 0;
		for (Integer key : accounts.keySet()) {
		    Account value = accounts.get(key);
		    if (value.getFirstName().equals(firstName)) {
		    	counter = counter + 1;
		    }
		}
		    return counter;
	}
}
		
	

