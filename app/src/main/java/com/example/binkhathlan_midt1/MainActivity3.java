package com.example.binkhathlan_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);
        setTitle("You are in Activity3");

        String[] list = {
                "First Item",
                "Second Item",
                "Third Item",
                "Fourth Item",
                "GO TO ACT 1",
                "GO TO ACT 2"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main3, R.id.travel, list));

    }

    protected void onListItemClick(
            ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                break;

            case 1:
                startActivity(new Intent(MainActivity3.this, BigItem.class));
                break;
        }

    }
    }
}