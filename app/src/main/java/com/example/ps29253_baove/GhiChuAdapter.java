package com.example.ps29253_baove;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GhiChuAdapter extends BaseAdapter {
    ArrayList<GhiChu> list;

    public GhiChuAdapter(ArrayList<GhiChu> _list) {
        this.list = _list;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int _i, View _view, ViewGroup _viewGroup) {
        View view = _view;
        if (view == null){
            view = View.inflate(_viewGroup.getContext(),R.layout.note_item,null);
        TextView tvNote=view.findViewById(R.id.tvNote);
        ViewHolder holder = new ViewHolder(tvNote);
        view.setTag(holder);
        }
        GhiChu ghiChu = (GhiChu) getItem(_i);
        ViewHolder holder= (ViewHolder) view.getTag();
        holder.tvNote.setText(ghiChu.getTieuDe());
        return view;
    }
   public class ViewHolder{
        final TextView tvNote;

       public ViewHolder(TextView tvNote) {
           this.tvNote = tvNote;
       }
   }
}
