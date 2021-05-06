package nLayeredOdev.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateManager implements ValidateService {

	@Override
	public boolean validate(String input) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = java.util.regex.Pattern.compile(emailRegex, java.util.regex.Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(input);
		return matcher.find();
	}

}
