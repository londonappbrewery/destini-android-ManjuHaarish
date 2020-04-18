package com.londonappbrewery.destini;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView questTextView;
    Button answ1TextView;
    Button answ2TextView;
    String QuestionsId;
    int index=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        questTextView =findViewById(R.id.storyTextView);
        answ1TextView=findViewById(R.id.buttonTop);
        answ2TextView=findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

    answ1TextView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if((answ1TextView).getText().toString().equals(getString(R.string.T1_Ans1)) || (answ1TextView).getText().toString().equals(getString(R.string.T2_Ans1)))
        {
            questTextView.setText(R.string.T3_Story);
            answ1TextView.setText(R.string.T3_Ans1);
            answ2TextView.setText(R.string.T3_Ans2);

        }else if((answ1TextView).getText().toString().equals(getString(R.string.T3_Ans1)))
        {
            questTextView.setText(R.string.T6_End);
            answ1TextView.setVisibility(View.GONE);
            answ2TextView.setVisibility(View.GONE);
        }
    }

    });

    answ2TextView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if((answ2TextView).getText().toString().equals(getString(R.string.T1_Ans2)))

        {
            questTextView.setText(R.string.T2_Story);
            answ1TextView.setText(R.string.T2_Ans1);
            answ2TextView.setText(R.string.T2_Ans2);
        }else if((answ2TextView).getText().toString().equals(getString(R.string.T2_Ans2)))
        {
            questTextView.setText(R.string.T5_End);
            answ1TextView.setVisibility(View.GONE);
            answ2TextView.setVisibility(View.GONE);
        }else if((answ2TextView).getText().toString().equals(getString(R.string.T3_Ans2)))
        {
            questTextView.setText(R.string.T5_End);
            answ1TextView.setVisibility(View.GONE);
            answ2TextView.setVisibility(View.GONE);
        }
    }
    });
    }

}
