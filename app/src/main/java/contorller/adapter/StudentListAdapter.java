package contorller.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ir.cafebazaar.workshop.R;
import model.Student;

/**
 * Created by reza on 9/8/16.
 */
public class StudentListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Student> mItems;

    public StudentListAdapter(Context mContext, ArrayList<Student> mItems) {
        this.mContext = mContext;
        this.mItems = mItems;
    }

    @Override
    public int getCount() {
        return mItems.size();
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
        final StudentViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_studebt_list_item, parent, false);
            holder = new StudentViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (StudentViewHolder) convertView.getTag();
        }
        final Student student = mItems.get(position);
        holder.name.setText(student.getName());
        holder.avg.setText(student.getAvg() + "");

        int imageResId = student.isTopStudent() ? R.drawable.ic_star_on : R.drawable.ic_star_off;
        holder.star.setImageResource(imageResId);
        holder.star.setTag(imageResId);
        holder.star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((int) holder.star.getTag()) == R.drawable.ic_star_off) {
                    holder.star.setImageResource(R.drawable.ic_star_on);
                    holder.star.setTag(R.drawable.ic_star_on);
                } else {
                    holder.star.setImageResource(R.drawable.ic_star_off);
                    holder.star.setTag(R.drawable.ic_star_off);
                }
            }
        });

        return convertView;
    }

    class StudentViewHolder {
        final TextView name;
        final TextView avg;
        final ImageView star;

        public StudentViewHolder(View convertView) {
            this.name = (TextView) convertView.findViewById(R.id.nameTextView);
            this.avg = (TextView) convertView.findViewById(R.id.avgTextView);
            this.star = (ImageView) convertView.findViewById(R.id.starImgeView);
        }
    }
}
