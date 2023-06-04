package ru.mirea.komaristyi.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog dialog = new ProgressDialog(getActivity());
        dialog.setMessage("Loading...");
        dialog.setIndeterminate(true);
        dialog.setCancelable(false);
        return dialog;
    }
}
