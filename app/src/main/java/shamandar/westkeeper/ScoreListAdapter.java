package shamandar.westkeeper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ayshahwa on 6/5/2017.
 */
public class ScoreListAdapter extends ArrayAdapter<Score> {
    private static class ViewHolder {
        TextView score1TextView;
        TextView score2TextView;
    }

    public ScoreListAdapter(Context context, List<Score> objects) {
        super(context, -1, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get Weather object for this specified ListView position
        Score scoreData = getItem(position);
        final ViewHolder viewHolder; // object that reference's list item's views

        // check for reusable ViewHolder from a ListView item that scrolled
        // offscreen; otherwise, create a new ViewHolder
        if (convertView == null) { // no reusable ViewHolder, so create one
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView =
                    inflater.inflate(R.layout.score_item, parent, false);
            viewHolder.score1TextView =
                    (TextView) convertView.findViewById(R.id.score1);
            viewHolder.score2TextView =
                    (TextView) convertView.findViewById(R.id.score2);
            convertView.setTag(viewHolder);
        } else { // reuse existing ViewHolder stored as the list item's tag
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.score1TextView.setText(String.valueOf(scoreData.score1));
        viewHolder.score2TextView.setText(String.valueOf(scoreData.score2));

        return convertView;
    }
}