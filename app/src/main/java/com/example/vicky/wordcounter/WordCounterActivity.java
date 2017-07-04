package com.example.vicky.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button wordcountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        sentenceEditText = (EditText) findViewById(R.id.sentence_text);
        wordcountButton = (Button) findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button) {
        String sentence = sentenceEditText.getText().toString();
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        Log.d(getClass().toString(), "The sentence provided was '" + sentence + "'");
        WordCount wordCount = new WordCount(sentence);
        int count = wordCount.countWords();

        Intent intent = new Intent(this, CountResult.class);
        intent.putExtra("count", Integer.toString(count));
        startActivity(intent);
    }

}