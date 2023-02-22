package helyion.github.classroom_better;

import android.app.Activity;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CatAdadpter extends ArrayAdapter {
    private Activity activity;
    private ArrayList<String> list;
    private int customViewResourceId;

    public CatAdadpter(Activity activity, int customViewResourceId, ArrayList<String> list){
        super(activity, customViewResourceId);
        this.customViewResourceId = customViewResourceId;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View layout = convertView;
        if (convertView == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(customViewResourceId, parent, false);
        }
        TextView nameTV = (TextView) layout.findViewById(R.id.name);
        nameTV.setText(list.get(position));
        ImageView flagIV = (ImageView) layout.findViewById(R.id.flag);
        flagIV.setImageResource(R.drawable.paris);
        return layout;
    }
}
