package cn.studyjams.s1.sj35.dengmin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmin on 2016/5/1.
 */
public class PictureActivity extends Activity implements ViewSwitcher.ViewFactory{
    private ImageSwitcher switcher;
    private Gallery gallery;
    private int[] resId = {};
    private List<ImageView> imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        imgs = new ArrayList<ImageView>();
        for(int i = 0;i < resId.length;i++){
            ImageView img = new ImageView(this);
            imgs.add(img);
        }

        switcher = (ImageSwitcher) findViewById(R.id.img_switcher);
        gallery = (Gallery) findViewById(R.id.gallery);
        switcher.setFactory(this);
        switcher.setInAnimation(this,android.R.anim.fade_in);
        switcher.setOutAnimation(this,android.R.anim.fade_out);

        gallery.setAdapter(new GalleryAdapter());
        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switcher.setImageResource(resId[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    @Override
    public View makeView() {
        ImageView img = new ImageView(this);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return img;
    }

    class GalleryAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }

}
