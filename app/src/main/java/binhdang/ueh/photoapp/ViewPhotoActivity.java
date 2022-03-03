package binhdang.ueh.photoapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.io.File;

public class ViewPhotoActivity extends AppCompatActivity {
    ImageView ivDetail;
    TextView tvDetailTitle, tvDetailDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);

        ivDetail = findViewById(R.id.iv_detail);
        tvDetailTitle = findViewById(R.id.tv_detail_title);
        tvDetailDescription = findViewById(R.id.tv_detail_description);

        int id = (int) getIntent().getLongExtra("id", 0);
        Picasso.get().load(PhotoData.getPhotoFromId(id).getSourcePhoto())
                .resize(400, 400).centerCrop().into(ivDetail);
        tvDetailTitle.setText((PhotoData.getPhotoFromId(id)).getCaptionPhoto());
        tvDetailDescription.setText((PhotoData.getPhotoFromId(id)).getDescriptionPhoto());
    }
}