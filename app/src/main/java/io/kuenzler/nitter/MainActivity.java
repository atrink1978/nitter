package io.kuenzler.nitter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    private static final String DEBUG_TAG = "WAWEBTOGO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent myIntent = new Intent(MainActivity.this, WebviewActivity.class);
        MainActivity.this.startActivity(myIntent);
        finish();
    }


}