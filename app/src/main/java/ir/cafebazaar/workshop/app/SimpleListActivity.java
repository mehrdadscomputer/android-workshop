package ir.cafebazaar.workshop.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import contorller.adapter.StudentListAdapter;
import ir.cafebazaar.workshop.R;
import model.Student;

public class SimpleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        Log.e(getClass().getSimpleName(), "onCreate()");

        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("item" + (i + 1));
        }

        ArrayList<ListItem> listItems = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                listItems.add(new ListItem("Zooowj", R.drawable.ic_item_even, "Install"));
            } else {
                listItems.add(new ListItem("Faard", R.drawable.ic_item_odd, "Run"));
            }
        }

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item_simple_list_item, R.id.text, items);
//        MySimpleAdapter adapter = new MySimpleAdapter(listItems, this);

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(16, "ali", false));
        students.add(new Student(12, "hasan", true));
        students.add(new Student(16, "vahid", true));
        students.add(new Student(16, "bagher", false));
        students.add(new Student(12, "soroosh", true));
        students.add(new Student(11, "danial", false));
        students.add(new Student(16, "ali 2", false));
        students.add(new Student(12, "hasan 2", true));
        students.add(new Student(16, "vahid 3", true));
        students.add(new Student(16, "bagher 2", false));
        students.add(new Student(12, "soroosh 5", true));
        students.add(new Student(11, "danial 7", false));

        StudentListAdapter adapter = new StudentListAdapter(this, students);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
