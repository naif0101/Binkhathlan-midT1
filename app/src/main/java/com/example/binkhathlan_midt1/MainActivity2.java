package com.example.binkhathlan_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("You are in Activity2");
        GridView grid = (GridView) findViewById(R.id.gridView);
        final ImageView pic = (ImageView)findViewById(R.id.imageView);

        grid.setAdapter(new ImageAdapter(this));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Selected Species " + (position + 1), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Animals[position]);
            }
        });
    }
    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c){
            context = c;

        }

        @Override
        public int getCount() {
            return Animals.length;
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
        public View getView(int position, View view, ViewGroup viewGroup) {
            pic = new ImageView(context);
            pic.setImageResource(Animals[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new ViewGroup.LayoutParams(330,300));
            return pic;
        }
    }
}
    }
}