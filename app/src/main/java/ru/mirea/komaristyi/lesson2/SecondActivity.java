package ru.mirea.komaristyi.lesson2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String bundleString = bundle.getString("key");
            Log.d(TAG,"bundleString = " + bundleString);
            TextView tv = findViewById(R.id.textView);
            tv.setText(bundleString);
        }
    }

}