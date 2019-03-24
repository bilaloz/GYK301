package gelecegiyazanlar.com.gyk301;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MapActivity extends AppCompatActivity {


   /* @BindView(R.id.open_map_page)
    Button openMapPage; */


   Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        //ButterKnife.bind(this);
        button = findViewById(R.id.open_map_page);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri geoLocation = Uri.parse("geo:38.393784,27.073730");
                showMap(geoLocation);
            }
        });


    }

    private void showMap(Uri geoLocation) {
        Intent googleMAp = new Intent(Intent.ACTION_VIEW);
        googleMAp.setData(geoLocation);
        if (googleMAp.resolveActivity(getPackageManager()) != null) {
            startActivity(googleMAp);
        }
    }

    /*
    @OnClick(R.id.open_map_page)
    public void onViewClicked() {

        Uri geoLocation = Uri.parse("geo:38.393784,27.073730");
        showMap(geoLocation);

    }



    }


    /* public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    } */
}
