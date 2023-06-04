package ru.mirea.komaristyi.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, year, month, day);

    }



    // onDateSet - метод обратного вызова, который вызывается, когда пользователь выбирает дату в DatePickerDialog
    public void onDateSet(DatePicker view, int year, int month, int day) {
        String selectedDate = String.format("%d-%d-%d", year, month + 1, day);
        ((MainActivity)getActivity()).showDate(selectedDate, view);

        //Snackbar.make(view, "Выбранная дата: " + selectedDate, Snackbar.LENGTH_LONG).show();
    }
}

