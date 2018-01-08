package tw.com.shiaoshia.ex2018010802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String, String>> mylist = new ArrayList();
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listView);

        HashMap<String,String> m1 = new HashMap<>();
        m1.put("city","台北");
        m1.put("code","02");
        mylist.add(m1);
        HashMap<String,String> m2 = new HashMap<>();
        m2.put("city","台中");
        m2.put("code","04");
        mylist.add(m2);
        HashMap<String,String> m3 = new HashMap<>();
        m3.put("city","台南");
        m3.put("code","06");
        mylist.add(m3);

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                mylist,R.layout.myitem,new String[] {"city","code"},
                new int[] {R.id.textView, R.id.textView2});
        lv.setAdapter(adapter);
    }
}
