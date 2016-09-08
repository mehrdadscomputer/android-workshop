package ir.cafebazaar.workshop.app;

import android.content.Context;
import android.util.Log;
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

        Log.e(getClass().getSimpleName(), "const()");

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
        MySimpleAdapterViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list_item, parent, false);
            viewHolder = new MySimpleAdapterViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MySimpleAdapterViewHolder) convertView.getTag();
        }


        viewHolder.title.setText(mListItems.get(position).title + " " + position);
        viewHolder.button.setText(mListItems.get(position).buttonText);
        viewHolder.image.setImageResource(mListItems.get(position).resId);

        Log.e(getClass().getSimpleName(), "getView(): position: " + String.valueOf(position));

        return convertView;
    }

    class MySimpleAdapterViewHolder {
        final TextView title;
        final ImageView image;
        final Button button;

        MySimpleAdapterViewHolder(View row) {
            title = (TextView) row.findViewById(R.id.text);
            image = (ImageView) row.findViewById(R.id.imageView);
            button = (Button) row.findViewById(R.id.button);
        }
    }
}
