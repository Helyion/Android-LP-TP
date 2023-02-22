package helyion.github.classroom_better;

import android.util.Log;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView messageLoginID;
    private ArrayList<String> listS;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Started.");

        GridView mListView = (GridView) findViewById(R.id.listView);

        Spinner spinner = findViewById(R.id.spinnerList);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String login = bundle.getString("login");

        listS = new ArrayList<>();//test
        listS.add("CAT1");
        listS.add("CAT2");
        listS.add("CAT3");
        listS.add("CAT4");
        listS.add("CAT5");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listS);
        spinner.setAdapter(adapter);

        /*Spinner spinnerV2 = (Spinner) findViewById(R.id.spinnerV2);

        CatAdadpter adapterV2 = new CatAdadpter(MainActivity.this, R.layout.items_cat, listS);
        spinnerV2.setAdapter(adapterV2);
         */

        ArrayList<Lieu> lieuList = new ArrayList<>();

        lieuList.add(new Lieu("Paris"));
        lieuList.add(new Lieu("Toulouse"));
        lieuList.add(new Lieu("Lion"));
        lieuList.add(new Lieu("DDEEDD"));
        lieuList.add(new Lieu("EFMPZ"));
        lieuList.add(new Lieu("PAFEAFEZFris"));

        LieuAdapter lieuAdapter = new LieuAdapter(this, R.layout.adapter_view_layout, lieuList);
        mListView.setAdapter(lieuAdapter);

        messageLoginID = findViewById(R.id.messageInterne);
        messageLoginID.setText("Bienvenue " + login + " !!!");

    }
}