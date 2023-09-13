package pwd_utlis;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordSecurity {
	public String encode(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
	}

}
