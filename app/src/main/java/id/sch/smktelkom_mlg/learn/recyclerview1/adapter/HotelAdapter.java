package id.sch.smktelkom_mlg.learn.recyclerview1.adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.recyclerview1.R;
import id.sch.smktelkom_mlg.learn.recyclerview1.model.Hotel;

/**
 * Created by MR AL on 03/01/2017.
 */
public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder>{
    ArrayList<Hotel> hotelList;
    public HotelAdapter(ArrayList<Hotel> hotelList){
        this.hotelList = hotelList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);
        holder.tvJudul.setText(hotel.judul);
        holder.ivFoto.setImageDrawable(hotel.foto);
    }

    @Override
    public int getItemCount() {
        if(hotelList!=null)
            return hotelList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageVIew);
            tvJudul= (TextView) itemView.findViewById(R.id.textViewJudul);


        }
    }
}
