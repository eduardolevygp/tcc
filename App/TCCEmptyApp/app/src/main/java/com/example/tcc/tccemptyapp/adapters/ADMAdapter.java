package com.example.tcc.tccemptyapp.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.media.Image;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.models.ManagementMember;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Alan on 02/10/2016.
 */
public class ADMAdapter extends RecyclerView.Adapter<ADMAdapter.ADMViewHolder> {

    private Context mContext;
    private List<ManagementMember> mMembers;

    public class ADMViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout background;
        private TextView name, role, email, phone;
        private ImageView image;

        public ADMViewHolder(View view) {
            super(view);

            background = (LinearLayout) view.findViewById(R.id.card_adm_background);
            image = (ImageView) view.findViewById(R.id.card_adm_image);
            name = (TextView) view.findViewById(R.id.card_adm_name);
            role = (TextView) view.findViewById(R.id.card_adm_role);
            email = (TextView) view.findViewById(R.id.card_adm_email);
            phone = (TextView) view.findViewById(R.id.card_adm_phone);
            image = (ImageView) view.findViewById(R.id.card_adm_image);
        }

        public ImageView getImageView() {
            return this.image;
        }

        public void setColors(int position) {
            int color, textColor;

            if (position % 2 == 0) {
                color = R.color.color_primary;
                textColor = R.color.color_primary_contrast;
            } else {
                color = R.color.color_secondary;
                textColor = R.color.color_secondary_contrast;
            }

            setTextColor(textColor);
            this.background.setBackgroundColor(ContextCompat.getColor(mContext, color));
        }

        private void setTextColor(int color) {
            int colorCode = ContextCompat.getColor(mContext, color);

            name.setTextColor(colorCode);
            role.setTextColor(colorCode);
            email.setTextColor(colorCode);
            phone.setTextColor(colorCode);
        }
    }

    public ADMAdapter(Context context, List<ManagementMember> members) {
        this.mContext = context;
        this.mMembers = members;
    }

    @Override
    public int getItemCount() {
        return mMembers.size();
    }

    @Override
    public ADMViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_adm, parent, false);

        return new ADMViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ADMViewHolder holder, int position) {
        ManagementMember member = mMembers.get(position);
        ImageView imageView = holder.getImageView();

        holder.name.setText(member.getName());
        holder.role.setText(member.getRole());
        holder.email.setText(member.getEmail());
        holder.phone.setText(member.getPhone());
        holder.setColors(position);

        Picasso.with(mContext)
                .load(member.getImageUrl())
                .placeholder(R.drawable.placeholder_avatar_image)
                .error(R.drawable.placeholder_avatar_error)
                .into(imageView);
    }
}
