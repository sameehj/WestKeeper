package shamandar.westkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView team1player1 = (TextView)findViewById(R.id.editText);
        TextView team1player2 = (TextView)findViewById(R.id.editText2);
        TextView team2player1 = (TextView)findViewById(R.id.editText3);
        TextView team2player2 = (TextView)findViewById(R.id.editText4);
    }
}
