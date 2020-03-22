package com.example.anew.gallercomp;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.VideoView;

import java.io.File;
import java.nio.file.Files;
import java.util.zip.Inflater;

public class Custadap extends BaseAdapter
    {
        File f;
        File[] files;
        String path;
        MainActivity mainActivity;
        Custadap(MainActivity mainActivity)
        {
            path="/storage/sdcard1/Video Downloader";
            f=new File(path);
            if(!f.exists())
            {
                path="/storage/sdcard1/Video Downloader";
                f=new File(path);
            }
            files=f.listFiles();
            this.mainActivity=mainActivity;
        }

    @Override
    public int getCount() {
        return files.length;
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
    public View getView(int position, View convertView, ViewGroup parent)
    {
            LayoutInflater lin = LayoutInflater.from(mainActivity);
        View v = lin.inflate(R.layout.indiview, null);
            final VideoView vv1 = v.findViewById(R.id.vv1);
            CheckBox cb1 = v.findViewById(R.id.cb1);
            File f1 = files[position];
            vv1.setVideoURI(Uri.fromFile(f1));
            cb1.setText(f1.getName().toString());
            cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        vv1.start();
                    } else {
                        vv1.pause();
                    }
                }
            });
            return v;

    }
}
