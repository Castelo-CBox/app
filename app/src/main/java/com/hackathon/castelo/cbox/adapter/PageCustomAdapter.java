package com.hackathon.castelo.cbox.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hackathon.castelo.cbox.ActionByPageActivity;
import com.hackathon.castelo.cbox.MainActivity;
import com.hackathon.castelo.cbox.R;
import com.hackathon.castelo.cbox.model.Page;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by macbook on 06/05/17.
 */


public class PageCustomAdapter extends ArrayAdapter<Page> implements View.OnClickListener {

    private ArrayList<Page> dataSet;
    private Context mContext;



    private static class ViewHolder {

        ImageView img_sex;
        TextView tv_page;
        TextView tv_qtde;
        TextView tv_age;
         LinearLayout ll_linha;
    }

    public PageCustomAdapter(ArrayList<Page> data, Context context) {
        super(context, R.layout.row_item_page, data);

        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {
        int position = (Integer) v.getTag();
        Object object = getItem(position);
        Page bee = (Page) object;

    }

    private int lastPosition = -1;

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        final Page page = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item_page, parent, false);

            viewHolder.tv_page = (TextView) convertView.findViewById(R.id.tv_page);
            viewHolder.tv_qtde = (TextView) convertView.findViewById(R.id.tv_qtde);
            viewHolder.tv_age = (TextView) convertView.findViewById(R.id.tv_age);
            viewHolder.img_sex = (ImageView) convertView.findViewById(R.id.img_sex);
            viewHolder.ll_linha = (LinearLayout) convertView.findViewById(R.id.ll_linha);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        viewHolder.tv_page.setText("" + page.getName());
        viewHolder.tv_qtde.setText("" + page.getQtde());
        viewHolder.tv_age.setText("" + page.getAge());
        viewHolder.img_sex.setImageResource(R.drawable.user_m);

        viewHolder.ll_linha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, ActionByPageActivity.class);
                i.putExtra("link", String.valueOf(page.getLink()));
                mContext.startActivity(i);
            }
        });

        return convertView;
    }
}