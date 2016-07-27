package com.example.putuguna.textautocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


/**
 * Created by putuguna on 27/07/16.
 */
public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView textAutoComplete;
    MultiAutoCompleteTextView multiTextAutoComplete;
    String[] cities ={"Jakarta ","Denpasar","Bandung","Makassar","Ambon","Surabaya"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAutoComplete =(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        multiTextAutoComplete =(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, cities);

        textAutoComplete.setAdapter(adapter);
        textAutoComplete.setThreshold(1);

        multiTextAutoComplete.setAdapter(adapter);
        multiTextAutoComplete.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
