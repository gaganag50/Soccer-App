package com.example.android.footballscoreapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import static com.example.android.footballscoreapp.R.id.foul_a_team;
import static com.example.android.footballscoreapp.R.id.foul_b_team;
import static com.example.android.footballscoreapp.R.id.score_a_team;
import static com.example.android.footballscoreapp.R.id.score_b_team;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0, foulA = 0, foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addThreeTeamA(View view) {
        scoreA += 3;
        displayScoreTeamA(scoreA);
    }

    public void addTwoTeamA(View view) {
        scoreA += 2;
        displayScoreTeamA(scoreA);
    }

    public void addOneTeamA(View view) {
        scoreA += 1;
        displayScoreTeamA(scoreA);
    }


    public void foulsTeamA(View view) {
        ++foulA;
        --scoreA;
        displayScoreTeamA(scoreA);
        displayfoulTeamA(foulA);
    }

    public void addThreeTeamB(View view) {
        scoreB += 3;
        displayScoreTeamB(scoreB);
    }


    public void addTwoTeamB(View view) {
        scoreB += 2;
        displayScoreTeamB(scoreB);
    }

    public void addOneTeamB(View view) {
        scoreB += 1;
        displayScoreTeamB(scoreB);
    }

    public void foulsTeamB(View view) {
        ++foulB;
        --scoreB;
        displayScoreTeamB(scoreB);
        displayfoulTeamB(foulB);
    }

    public void reset(View view) {
        scoreA = scoreB = foulA = foulB = 0;
        displayScoreTeamA(scoreA);
        displayScoreTeamB(scoreB);
        displayfoulTeamA(foulA);
        displayfoulTeamB(foulB);

    }

    public void displayfoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(foul_a_team);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(foul_b_team);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(score_b_team);
        scoreView.setText(String.valueOf(score));

    }

    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(score_a_team);
        scoreView.setText(String.valueOf(score));
    }

}