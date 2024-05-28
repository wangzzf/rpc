public class SmsServiceImpl implements SmsService {
    @Override
    public String sendSms(String msg) {
        return "SMS sent: " + msg;
    }
}
