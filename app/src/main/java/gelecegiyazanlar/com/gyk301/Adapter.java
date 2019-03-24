package gelecegiyazanlar.com.gyk301;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {
    Context context;
    ArrayList<Users> usersArrayList;
    @Override
    public int getCount() {
        return usersArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return usersArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        view = View.inflate(context,R.layout.row,null);
        TextView userName = view.findViewById(R.id.name);
        TextView userTelep = view.findViewById(R.id.telephone);
        TextView weekOne = view.findViewById(R.id.weekTh);
        TextView weekTw = view.findViewById(R.id.weekOne);
        TextView weekTh = view.findViewById(R.id.weekTh);
        TextView weekFo = view.findViewById(R.id.weekFo);
        ImageView userImage = view.findViewById(R.id.userImage);

        userName.setText(usersArrayList.get(position).getName());
        userTelep.setText(usersArrayList.get(position).getTelephone());
        userImage.setImageResource(usersArrayList.get(position).getImage());
        weekFo.setText(usersArrayList.get(position).getAbout().get(3));
        weekTh.setText(usersArrayList.get(position).getAbout().get(2));
        weekTw.setText(usersArrayList.get(position).getAbout().get(1));
        weekOne.setText(usersArrayList.get(position).getAbout().get(0));



        return view;
    }

    public Adapter(Context context, ArrayList<Users> usersArrayList) {
        this.context = context;
        this.usersArrayList = usersArrayList;
    }
}
