package com.example.recc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewholder> {
    ArrayList<RecModel> userlist;
    public RecAdapter(ArrayList<RecModel> userlist) {
        this.userlist = userlist;
    }


    @NonNull
    @Override
    public RecViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_design,parent,false);
        return new RecViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewholder holder, int position) {
    int resource=userlist.get(position).getImg();
    String msg=userlist.get(position).getTxt();
    holder.imageView.setImageResource(resource);
    holder.textView.setText(msg);
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class RecViewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public RecViewholder(@NonNull View itemView) {
            super(itemView);
        imageView=itemView.findViewById(R.id.imageview);
            textView=itemView.findViewById(R.id.textView);




        }
    }
}
