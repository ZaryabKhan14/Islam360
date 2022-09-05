package com.example.islam360;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HumaraCustomizeAdapter extends RecyclerView.Adapter<HumaraCustomizeAdapter.idfetchkaro> {

    ArrayList<quranlistadaptar> quranlist;

    public HumaraCustomizeAdapter(ArrayList<quranlistadaptar> far) {
        {
            this.quranlist = far;
        }
    }

    @NonNull
    @Override
    public idfetchkaro onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview = LayoutInflater.from(parent.getContext()).inflate(R.layout.prototype, parent, false);
        return new idfetchkaro(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull idfetchkaro holder, int position) {
        holder.t1.setText("" + quranlist.get(position).getSuratid());
        holder.t4.setText("" + quranlist.get(position).getAyatnumber());
        holder.t2.setText(quranlist.get(position).getArabic());
        holder.t3.setText(quranlist.get(position).getTranslation_urdu());
    }


    @Override
    public int getItemCount() {
        return quranlist.size();
    }

    class idfetchkaro extends RecyclerView.ViewHolder {
        TextView t1, t2, t3, t4;

        public idfetchkaro(@NonNull View itemView) {
            super(itemView);

            t1 = (TextView) itemView.findViewById(R.id.idcardview);
            t2 = (TextView) itemView.findViewById(R.id.ayatcardview);
            t3 = (TextView) itemView.findViewById(R.id.ayatnamecardview);
            t4 = (TextView) itemView.findViewById(R.id.idcardview2);

        }
    }
}