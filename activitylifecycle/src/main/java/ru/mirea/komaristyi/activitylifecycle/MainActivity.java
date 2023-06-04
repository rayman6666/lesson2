package ru.mirea.komaristyi.activitylifecycle;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;


import java.util.Objects;
/*

Вопросы:

1. Будет ли вызван метод «onCreate» после нажатия на кнопку «Home» и возврата
в приложение?

2. Изменится ли значение поля «EditText» после нажатия на кнопку «Home» и
возврата в приложение?

3. Изменится ли значение поля «EditText» после нажатия на кнопку «Back» и
возврата в приложение?

Ответы:

1. Нет. При нажатии на кнопку «Home» и возврата в приложение метод «onCreate» не будет вызван.
Приложение не закрывается полностью при переходе на главный экран.
Вместо этого оно сворачивается в фоновый режим и продолжает работу в этом режиме.
При возвращении в приложение метод «onResume» будет вызван.

2. Нет. Значение поля «EditText» не изменится после нажатия на кнопку «Home» и возврата в приложение.
Значение поля сохраняется при сворачивании приложения и не изменяется при его разворачивании.

3. Нет. Значение поля «EditText» не изменится после нажатия на кнопку «Back» и возврата в приложение.
Это связано с тем, что значение поля сохраняется при переходе на другую активность
и не изменяется при возвращении на предыдущую активность.

*/
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate()");
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Log.i(TAG, "onRestoreInstanceState(bundle)");
    }

    @Override
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        Log.i(TAG, "onPostCreate(bundle)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "onPostResume()");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(Objects.requireNonNull(bundle));
        Log.i(TAG, "onSaveInstanceState(bundle)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }


}