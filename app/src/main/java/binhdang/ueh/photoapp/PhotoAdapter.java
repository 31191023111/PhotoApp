package binhdang.ueh.photoapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;

public class PhotoAdapter extends BaseAdapter {
    private ArrayList<Photo> photoList;
    private Context context;

    public PhotoAdapter(ArrayList<Photo> photoList, Context context){
        this.photoList = photoList;
        this.context = context;
    }

    public int getCount() { return photoList.size(); }
    public Object getItem(int position) { return photoList.get(position); }
    public long getItemId(int position) { return photoList.get(position).getId(); }
    public View getView(int position, View convertView, ViewGroup parent){
        final MyView dataItem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            dataItem = new MyView();
            convertView = inflater.inflate(R.layout.photo_disp_tpl, null);
            dataItem.ivPhoto = convertView.findViewById(R.id.imv_photo);
            dataItem.tvCaption = convertView.findViewById(R.id.tv_title);
            convertView.setTag(dataItem);
        }
        else {
            dataItem = (MyView) convertView.getTag();
        }
        Picasso.get().load(photoList.get(position).getSourcePhoto())
                .resize(300, 400).centerCrop().into(dataItem.ivPhoto);
        dataItem.tvCaption.setText(photoList.get(position).getCaptionPhoto());
        return convertView;
    }

    private static class MyView{
        ImageView ivPhoto;
        TextView tvCaption;
    }

}
