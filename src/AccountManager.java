import com.google.gson.*;

public class AccountManager {

	public static void main(String[] args) {

		Service service = new Service();
		Account Account1 = new Account("Nidhesh", "Pillai", "1001");
		Account Account2 = new Account("Jason", "Hart", "1002");
		Account Account3 = new Account("Callum", "McGregor", "1003");

		service.addAccount(Account1);
		service.addAccount(Account2);
		service.addAccount(Account3);

		System.out.println(service.RetrieveFromMap(1));
		System.out.println(service.RetrieveFromMap(2));
		System.out.println(service.RetrieveFromMap(3));

		JSon gson = new JSon();
		String json = gson.getJSon(service.accounts);
		System.out.println(json);
	}

}
