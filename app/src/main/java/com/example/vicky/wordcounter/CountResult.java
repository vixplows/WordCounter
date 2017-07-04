package com.example.vicky.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class CountResult extends AppCompatActivity {

    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_result);

        countText = (TextView) findViewById(R.id.count_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String count = extras.getString("count");
        countText.setText(count);
    }
}
