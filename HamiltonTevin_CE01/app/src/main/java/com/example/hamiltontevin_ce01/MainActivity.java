package com.example.hamiltontevin_ce01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "funday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     findViewById(R.id.con_btn).setOnClickListener(mClickListenerSwitchToLin);
     findViewById(R.id.Lin_btn).setOnClickListener(mClickListenerSwitchToCon);
    }
    private final View.OnClickListener mClickListenerSwitchToLin = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            LinearLayout linearLayout = findViewById(R.id.main_LinearLayout);
            ConstraintLayout constraintLayout = findViewById(R.id.Main_ConstraintLayout);
            constraintLayout.setVisibility(View.GONE);
            linearLayout.setVisibility(View.VISIBLE);
            Log.i(TAG,"switched");
        }
    };

    private final View.OnClickListener mClickListenerSwitchToCon = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            LinearLayout linearLayout = findViewById(R.id.main_LinearLayout);
            ConstraintLayout constraintLayout = findViewById(R.id.Main_ConstraintLayout);
            constraintLayout.setVisibility(View.VISIBLE);
            linearLayout.setVisibility(View.GONE);
            Log.i(TAG,"switched");
        }
    };
}
