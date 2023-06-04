package ru.mirea.komaristyi.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }
    // onTimeSet - метод обратного вызова, который вызывается, когда пользователь выбирает время в TimePickerDialog
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String selectedTime = String.format("%02d:%02d", hourOfDay, minute);
        ((MainActivity)getActivity()).showTime(selectedTime, view);

        //Snackbar.make(view, "Выбранное время: " + selectedTime, Snackbar.LENGTH_LONG).show();
    }
}
