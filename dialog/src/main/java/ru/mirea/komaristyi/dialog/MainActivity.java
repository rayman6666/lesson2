package ru.mirea.komaristyi.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void showTimeDialog(View view) {
        DialogFragment newFragment = new MyTimeDialogFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void showDateDialog(View view) {
        DialogFragment newFragment = new MyDateDialogFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showProgressDialog(View view) {
        DialogFragment newFragment = new MyProgressDialogFragment();
        newFragment.show(getSupportFragmentManager(), "progressPicker");
    }

    public void showDate(String selectedDate, DatePicker view) {
        //Snackbar.make(view, "Выбранная дата: " + selectedDate, Snackbar.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), "Выбранная дата: " + selectedDate,
                Toast.LENGTH_LONG).show();
    }

    public void showTime(String selectedTime, TimePicker view) {
        //Snackbar.make(view, "Выбранное время: " + selectedTime, Snackbar.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), "Выбранное время: " + selectedTime,
                Toast.LENGTH_LONG).show();
    }
}