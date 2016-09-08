package ir.cafebazaar.workshop.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ir.cafebazaar.workshop.R;

/**
 * Created by reza on 9/8/16.
 */
public class MySimpleAdapter extends BaseAdapter {

    ArrayList<ListItem> mListItems;
    Context mContext;

    public MySimpleAdapter(ArrayList<ListItem> listItems, Context context) {
        mListItems = listItems;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mListItems.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(R.layout.item_list_item, parent, false);
        TextView title = (TextView) row.findViewById(R.id.text);
        ImageView image = (ImageView) row.findViewById(R.id.imageView);
        Button button = (Button) row.findViewById(R.id.button);
        title.setText(mListItems.get(position).title);
        button.setText(mListItems.get(position).buttonText);
        image.setImageResource(mListItems.get(position).resId);

        return row;
    }
}
