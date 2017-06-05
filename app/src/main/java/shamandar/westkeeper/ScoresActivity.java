package shamandar.westkeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ScoresActivity extends AppCompatActivity {

    List<Score> scoreList = new ArrayList<>();
    ScoreListAdapter scoreListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        Intent intent = getIntent();
        String team1player1 = intent.getStringExtra("team1player1");
        String team1player2 = intent.getStringExtra("team1player2");
        String team2player1 = intent.getStringExtra("team2player1");
        String team2player2 = intent.getStringExtra("team2player2");

        TextView team1TextView = (TextView)findViewById(R.id.team1TextView);
        team1TextView.setText(team1player1 + team1player2);
        TextView team2TextView = (TextView)findViewById(R.id.team2TextView);
        team2TextView.setText(team2player1 + team2player2);

        scoreListAdapter = new ScoreListAdapter(this, scoreList);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(scoreListAdapter);
        UpdatePhotosList();
    }

    private void UpdatePhotosList(){
        scoreList.add(new Score(120,10));
        scoreListAdapter.notifyDataSetChanged();
    }
}
