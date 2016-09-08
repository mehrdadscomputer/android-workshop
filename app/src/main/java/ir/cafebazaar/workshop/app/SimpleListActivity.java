package ir.cafebazaar.workshop.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ir.cafebazaar.workshop.R;

public class SimpleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("item" + (i + 1));
        }

        ArrayList<ListItem> listItems = new ArrayList<>();
        for (int i=0; i < 10000; i++) {
            if (i%2 == 0) {
                listItems.add(new ListItem("Zooowj", R.drawable.ic_item_even, "Install"));
            } else {
                listItems.add(new ListItem("Faard", R.drawable.ic_item_odd, "Run"));
            }
        }

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item_simple_list_item, R.id.text, items);
        MySimpleAdapter adapter = new MySimpleAdapter(listItems, this);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
