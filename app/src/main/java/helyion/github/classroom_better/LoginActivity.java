package helyion.github.classroom_better;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static final String login = "pass";
    private static final String password = "1234";
    private Button bLogin;
    private EditText loginText;
    private EditText mdpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bLogin = (Button) findViewById(R.id.ButtonAuth);
        loginText = findViewById(R.id.identifiant);
        mdpText = findViewById(R.id.mdp);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast t;
                if(loginText.getText().toString().equals(login) && mdpText.getText().toString().equals(password)){
                    t = Toast.makeText(v.getContext(), "Connected", Toast.LENGTH_SHORT);
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("login", loginText.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else {
                    t = Toast.makeText(v.getContext(), "Error login or password", Toast.LENGTH_SHORT);
                }
                t.show();
            }
        });
    }
}