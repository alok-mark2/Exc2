package com.example.kelasbsqlite.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kelasbsqlite.R;
import com.example.kelasbsqlite.database.Teman;

import java.util.ArrayList;

public class TemanAdapter extends RecyclerView.Adapter<TemanAdapter.TemanViewHolder> {
private ArrayList<Teman> listData;

    public TemanAdapter(ArrayList<Teman> listData) {
        this.listData = listData;
    }

    @Override
    public TemanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutinf = LayoutInflater.from(parent.getContext());
        View view = layoutinf.inflate(R.layout.row_data_teman,parent, attachToRoot false);
        return new TemanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TemanViewHolder holder, int position) {
        String nm,tlp;

        nm = listData.get(position).getNama();
        tlp = listData.get(position).getTelpon();

        holder.namaTxt.setText(nm);
        holder.TelponTxt.setText(tlp);

    }

    @Override
    public int getItemCount() {
        return (ListData != null)?ListData.size() = 0;
    }

    public class TemanViewHolder extends RecyclerView.ViewHolder {
        private CardView cardku;
        private TextView namaTxt,TelponTxt;

        public TemanViewHolder(View view) {
            super();
            cardku = (CardView) view.FindViewById(R.id.kartuku);
                    namaTxt = (TextView) view.findViewById(R.id.textNama);
                    telponTxt = (TextView) view.findViewById(R.id.textTelpon);
        }
    }
}
