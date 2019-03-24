package gelecegiyazanlar.com.gyk301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UserAbout extends AppCompatActivity {

    ListView listView;
    ArrayList<Users> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_about);
        listView = findViewById(R.id.userList);
        ArrayList<String> devamsizlik = new ArrayList<>();
        devamsizlik.add("X");
        devamsizlik.add("X");
        devamsizlik.add("O");
        devamsizlik.add("O");

        users.add(new Users("Bİlal","0020",R.drawable.ic_account_box_black_24dp,devamsizlik));
        users.add(new Users("Bİlal","0020",R.drawable.ic_account_box_black_24dp,devamsizlik));
        users.add(new Users("Bİlal","0020",R.drawable.ic_account_box_black_24dp,devamsizlik));
        users.add(new Users("Bİlal","0020",R.drawable.ic_account_box_black_24dp,devamsizlik));

        Adapter adapter = new Adapter(this,users);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                users.remove(position);
                adapter.notifyDataSetChanged();
            }
        });

        listView.setAdapter(adapter);




    }
}
