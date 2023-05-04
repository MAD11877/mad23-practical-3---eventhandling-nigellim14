package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;

import android.os.Bundle;

import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        CircleImageView androidimgbg2 = findViewById(R.id.androidimg2);
        CircleImageView androidimg2 = findViewById(R.id.androidimg2);

        Random rand = new Random();


    }
}