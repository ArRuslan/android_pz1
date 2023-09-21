package me.ruslan.pz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("pz1", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("pz1", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pz1", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("pz1", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("pz1", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("pz1", "onDestroy");
    }
}