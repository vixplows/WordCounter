package com.example.vicky.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText sentenceEditText;
    TextView countText;
    Button wordcountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        sentenceEditText = (EditText) findViewById(R.id.sentence_text);
        wordcountButton = (Button) findViewById(R.id.count_button);
        countText = (TextView) findViewById(R.id.count_text);
    }

    public void onCountButtonClicked(View button) {
        String sentence = sentenceEditText.getText().toString();
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        Log.d(getClass().toString(), "The sentence provided was '" + sentence + "'");
        WordCount wordCount = new WordCount(sentence);
        int count = wordCount.countWords();
        countText.setText(Integer.toString(count));
    }

}