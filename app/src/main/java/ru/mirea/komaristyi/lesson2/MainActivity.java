package ru.mirea.komaristyi.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void invoke(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", text.getText());
    }
}