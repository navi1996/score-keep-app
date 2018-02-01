package com.android.project2.project2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teamATextView;
    TextView teamBTextView;
    int teamAScore=0;
    int teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamATextView = (TextView) findViewById(R.id.tv_countA);
        teamBTextView = (TextView) findViewById(R.id.tv_countB);
    }

    public void addSixForTeamA(View view)
    {
        teamAScore=teamAScore+6;
        displayScoreForTeamA(teamAScore);
    }
    public void addFourForTeamA(View view)
    {
        teamAScore=teamAScore+4;
        displayScoreForTeamA(teamAScore);
    }

    public void addThreeForTeamA(View view)
    {
        teamAScore=teamAScore+3;
        displayScoreForTeamA(teamAScore);
    }

    public void displayScoreForTeamA(int score)
    {
        teamATextView.setText(String.valueOf(score));

    }

    public void addSixForTeamB(View view)
    {
        teamBScore=teamBScore+6;
        displayScoreForTeamB(teamBScore);
    }
    public void addFourForTeamB(View view)
    {
        teamBScore=teamBScore+4;
        displayScoreForTeamB(teamBScore);
    }

    public void addThreeForTeamB(View view)
    {
        teamBScore=teamBScore+3;
        displayScoreForTeamB(teamBScore);
    }

    public void displayScoreForTeamB(int score)
    {
        teamBTextView.setText(String.valueOf(score));

    }

    public void resetButton(View view)
    {

        teamATextView.setText(String.valueOf(0));
        teamBTextView.setText(String.valueOf(0));
        teamAScore=0;
        teamBScore=0;
    }



}
