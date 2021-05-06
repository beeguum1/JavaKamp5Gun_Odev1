package nLayeredOdev.core;

import nLayeredOdev.googleAccounts.GoogleAccountsManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void login(String email, String password) {
		GoogleAccountsManager googleAccountsManager = new GoogleAccountsManager();
		googleAccountsManager.login(email,password);
		
	}

}
