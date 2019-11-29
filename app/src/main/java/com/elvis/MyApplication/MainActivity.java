package com.elvis.MyApplication;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button btn_sbm;
    private RatingBar rtg_br;
    private TextView txt_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listnerForRatingBar();
        listnerForButton();
    }

    public void listnerForRatingBar(){
        rtg_br = (RatingBar)findViewById(R.id.ratingBar);
        txt_view = (TextView)findViewById(R.id.txt_viewer);
        rtg_br.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txt_view.setText(String.valueOf(rating));
            }
        });
    }

    public void listnerForButton(){
        rtg_br = (RatingBar)findViewById(R.id.ratingBar);
        btn_sbm = (Button)findViewById(R.id.button4);
        btn_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(rtg_br.getRating()), Toast.LENGTH_LONG).show();
            }
        });
    }


}
