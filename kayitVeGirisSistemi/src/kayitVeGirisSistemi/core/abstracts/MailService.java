package kayitVeGirisSistemi.core.abstracts;

public interface MailService {
	int send(String email);
	int generateVerificationCode();
}
