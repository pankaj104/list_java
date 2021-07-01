package abc.com.listwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] names=new String[]{
            "pankaj",
            "raju",
            "monu",
            "rohan",
            "chacha",
            "Ravi",
            "Kajal",
            "pooja",
            "Ranju",
            "Golu",
            "Sangam",
            "pankaj",
            "raju",
            "monu",
            "rohan",
            "chacha",
            "Ravi",
            "Kajal",
            "pooja",
            "Ranju",
            "Golu",
            "Sangam"
    };
    ListView lvNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvNames  =findViewById(R.id.lvNames);
        ArrayAdapter<String> nameAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                names
        );
        lvNames.setAdapter(nameAdapter);
    }
}