package sendemail.sendemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class email_send {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		
		System.out.println("Test Started");
		setup();
		System.out.println("Email sent");

	}
	
public static void setup() throws EmailException
{
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("thulungyanzee@gmail.com", "Y@nzEE1989"));
	email.setSSLOnConnect(true);
	email.setFrom("user@gmail.com");
	email.setSubject("TestMail");
	email.setMsg("This is a test mail ... :-)");
	email.addTo("thulungyanzee@gmail.com");
	email.send();
}

}
