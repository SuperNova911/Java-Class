package khub¿¹Á¦;

interface PhoneInterface
{
	int BUTTONS = 20;
	
	void sendCall();
	void receiveCall();
}

interface MobilePhoneInterface extends PhoneInterface
{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface
{
	public void play();
	public void stop();
}
