package ru.mirea.komaristyi.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGetCount(View view) {
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        Integer count = editText.getText().length();
        button.setText(String.valueOf(count));
        Toast toast = Toast.makeText(getApplicationContext(),
                "Количество символов - " + String.valueOf(count) + " СТУДЕНТ № 12 ГРУППА БСБО-06-21",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}