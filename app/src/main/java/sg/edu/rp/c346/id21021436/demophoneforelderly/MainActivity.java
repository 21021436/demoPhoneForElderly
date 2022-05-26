package sg.edu.rp.c346.id21021436.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button callSon;
    Button callDaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callSon = findViewById(R.id.buttonCallSon);
        callDaughter = findViewById(R.id.buttonCallDaughter);

        callSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String formattedNumber = PhoneNumberUtils.formatNumber(unformattedNumber);
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:92240336"));
                startActivity(intentCall);
            }
        });

        callDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:89675543"));
                startActivity(intentCall);
            }
        });
    }
}