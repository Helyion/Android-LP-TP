package helyion.github.classroom_better;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class LieuAdapter extends ArrayAdapter<Lieu> {
    private static final String TAG = "LieuAdapter";
    private Context mContext;
    int mRessource;

    public LieuAdapter(Context context, int ressource, ArrayList<Lieu> objects){
        super(context,ressource, objects);
        mContext = context;
        mRessource = ressource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        String name = getItem(position).getNom();
        int image = getItem(position).getImgID();

        Lieu lieu = new Lieu(name);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mRessource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        ImageView IVName = (ImageView) convertView.findViewById(R.id.imageView);


        IVName.setImageResource(image);
        tvName.setText(name);
        return convertView;
    }


}
