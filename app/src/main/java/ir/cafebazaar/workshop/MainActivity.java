package ir.cafebazaar.workshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usernameEdiText = (EditText) findViewById(R.id.txtUsername);
        final EditText passwordEditText = (EditText) findViewById(R.id.txtPassword);

        Button loginButton = (Button) findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEdiText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (username.equals("reza") && password.equals("123")) {
                    Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid User or pass", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
