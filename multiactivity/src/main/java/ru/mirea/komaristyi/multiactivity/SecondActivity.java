package ru.mirea.komaristyi.multiactivity;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.mirea.komaristyi.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "2_onCreate()");

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        textView.setText(text);

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "2_onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "2_onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "2_onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "2_onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "2_onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "2_onRestart()");
    }

}