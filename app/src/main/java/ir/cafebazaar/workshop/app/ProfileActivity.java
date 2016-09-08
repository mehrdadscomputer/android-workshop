package ir.cafebazaar.workshop.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ir.cafebazaar.workshop.R;

/**
 * Created by reza on 9/8/16.
 */
public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);

        String username = getIntent().getStringExtra("XYZ");

        TextView userTextView = (TextView) findViewById(R.id.txtUsername);
        userTextView.setText(username);
    }
}
