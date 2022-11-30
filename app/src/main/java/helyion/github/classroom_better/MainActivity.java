package helyion.github.classroom_better;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView messageLoginID;
    private ArrayList<String> listS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinnerList);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String login = bundle.getString("login");

        listS = new ArrayList<>();
        listS.add("CAT1");
        listS.add("CAT2");
        listS.add("CAT3");
        listS.add("CAT4");
        listS.add("CAT5");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listS);
        spinner.setAdapter(adapter);

        messageLoginID = findViewById(R.id.messageInterne);
        messageLoginID.setText("Bienvenue " + login + " !!!");

    }
}