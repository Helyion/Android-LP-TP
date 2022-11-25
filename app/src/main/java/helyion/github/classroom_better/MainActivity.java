package helyion.github.classroom_better;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView messageLoginID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String login = bundle.getString("login");

        messageLoginID = findViewById(R.id.messageInterne);
        messageLoginID.setText("Bienvenue " + login + " !!!");
    }
}