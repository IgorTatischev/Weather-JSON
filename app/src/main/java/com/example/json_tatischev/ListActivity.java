package com.example.json_tatischev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ListForecast> listForecasts = new ArrayList<>();
    ArrayAdapter<ListForecast> adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        listView = findViewById(R.id.listView);
        adp = new ArrayAdapter<ListForecast>(this, android.R.layout.simple_list_item_1, listForecasts);
        listView.setAdapter(adp);
        listForecasts.clear();
        StaticDB.database.getAllForecast(listForecasts);
        adp.notifyDataSetChanged();
    }

    public void onBtnReturnClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void deleteForecasts(View v)
    {
        StaticDB.database.deleteAll();
        listForecasts.clear();
        StaticDB.database.getAllForecast(listForecasts);
        adp.notifyDataSetChanged();
    }
}