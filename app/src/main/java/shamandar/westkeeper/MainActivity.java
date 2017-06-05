package shamandar.westkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText team1player1 = (EditText)findViewById(R.id.editText);
        final EditText team1player2 = (EditText)findViewById(R.id.editText2);
        final EditText team2player1 = (EditText)findViewById(R.id.editText3);
        final EditText team2player2 = (EditText)findViewById(R.id.editText4);

        Button ButtonStart = (Button)findViewById(R.id.button_start);
        ButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!team1player1.getText().equals("") &&
                        !team1player2.getText().equals("") &&
                        !team2player1.getText().equals("") &&
                        !team2player2.getText().equals("") )
                {
                    Intent intent = new Intent(getBaseContext(), ScoresActivity.class);
                    intent.putExtra("team1player1", team1player1.getText().toString());
                    intent.putExtra("team1player2", team1player2.getText().toString());
                    intent.putExtra("team2player1", team2player1.getText().toString());
                    intent.putExtra("team2player2", team2player2.getText().toString());
                    startActivity(intent);

                } else {
                    Toast.makeText(getBaseContext(),"Please enter all the names",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
