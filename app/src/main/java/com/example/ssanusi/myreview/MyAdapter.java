package com.example.ssanusi.myreview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Pojo> pojoo;
    public adapterInterface listener;
    public interface adapterInterface{}

    public MyAdapter(adapterInterface listener) {
        this.listener = listener;
    }

    public void swap (List<Pojo> newItem){
        if (newItem == null) return;
        if (pojoo!=null) pojoo.clear();
        pojoo = newItem;
        this.notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_items,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pojo populator = pojoo.get(position);
        holder.onBind(populator);
    }

    @Override
    public int getItemCount() {
      return   pojoo == null ? 0 : pojoo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name,continent,description;
        ImageView picture;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            continent = itemView.findViewById(R.id.continent);
            description= itemView.findViewById(R.id.description);
            picture= itemView.findViewById(R.id.picture);
        }

        public void onBind (Pojo pojo){
            name.setText(pojo.getName());
            continent.setText(pojo.getContinent());
            description.setText(pojo.getDescription());
            picture.setImageResource(pojo.getImage());
        }
    }
}
