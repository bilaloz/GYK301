package gelecegiyazanlar.com.gyk301;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    EditText senderMessage;
    EditText receiverNumber;
    Button sendSmsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        senderMessage = (EditText) findViewById(R.id.sender_message);
        receiverNumber = (EditText) findViewById(R.id.receiver_phone_number);
        sendSmsButton = (Button) findViewById(R.id.send_sms_button);
        sendSmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = senderMessage.getText().toString();
                String phoneNumber = receiverNumber.getText().toString();

                if (message.equals("") || phoneNumber.length() < 10 ||
                        phoneNumber.length() > 11) {
                    Toast.makeText(SmsActivity.this, "Kontrol Ediniz ",
                            Toast.LENGTH_SHORT).show();
                } else
                    composeMmsMessage(message, phoneNumber);

            }
        });


    }

    public void composeMmsMessage(String message, String phoneNumber) {

        Uri uri = Uri.parse("smsto:" + phoneNumber);
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", message);
        startActivity(intent);
    }
}
