package com.kadama.aprendepatrones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorItenes extends RecyclerView.Adapter<AdaptadorItenes.MyViewHolder> {

    private Context mContexto;
    private List<patrones> mDatos;
    RequestQueue req;

    public AdaptadorItenes(Context mContexto, List<patrones> mDatos) {
        this.mContexto = mContexto;
        this.mDatos = mDatos;
        req = Volley.newRequestQueue(mContexto);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContexto);
        view=mInflater.inflate(R.layout.item_imagenes,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.TituloDelPatron.setText(mDatos.get(position).getTitulo());
        Picasso.get()
                .load(mDatos.get(position).getDato())
                .resize(120,160)
                .placeholder(R.drawable.cargando)
                .into(holder.img_patrin_Thumbnail);
        holder.video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui poner lo que se hace en el clip
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDatos.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView TituloDelPatron;
        ImageView img_patrin_Thumbnail;
        CardView video;
        public MyViewHolder(View itemView){
            super(itemView);
            TituloDelPatron = (TextView) itemView.findViewById(R.id.titulo_patron);
            img_patrin_Thumbnail = (ImageView)itemView.findViewById(R.id.imagen_itenes_id);
            video = (CardView) itemView.findViewById(R.id.btn_video);
        }
    }
}
