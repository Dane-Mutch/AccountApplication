import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;
import java.util.function.Predicate;

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
		return (int) accounts.values().stream().filter(entry -> entry.getFirstName().equals(firstName)).count();
	}
}
	
		
	

