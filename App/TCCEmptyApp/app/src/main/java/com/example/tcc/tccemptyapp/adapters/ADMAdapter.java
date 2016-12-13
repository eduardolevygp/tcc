package com.example.tcc.tccemptyapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.components.BaseViewHolder;
import com.example.tcc.tccemptyapp.models.ManagementMember;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Alan on 02/10/2016.
 */
public class ADMAdapter extends RecyclerView.Adapter<ADMAdapter.ADMViewHolder> {

    private Context mContext;
    private List<ManagementMember> mMembers;

    public class ADMViewHolder extends BaseViewHolder {

        private TextView name, role, email, phone;
        private ImageView image;

        public ADMViewHolder(View view) {
            super(view, mContext);

            setBackground((LinearLayout) view.findViewById(R.id.card_adm_background));
            image = (ImageView) view.findViewById(R.id.card_adm_image);
            name = (TextView) view.findViewById(R.id.card_adm_name);
            role = (TextView) view.findViewById(R.id.card_adm_role);
            email = (TextView) view.findViewById(R.id.card_adm_email);
            phone = (TextView) view.findViewById(R.id.card_adm_phone);
            image = (ImageView) view.findViewById(R.id.card_adm_image);
        }

        @Override
        protected void setTextColors(int colorCode) {
            name.setTextColor(colorCode);
            role.setTextColor(colorCode);
            email.setTextColor(colorCode);
            phone.setTextColor(colorCode);
        }

        public void setFields(ManagementMember member) {
            name.setText(member.getName());
            role.setText(member.getRole());
            email.setText(member.getEmail());
            phone.setText(member.getPhone());

            Picasso.with(mContext)
                    .load(member.getFullImageUrl())
                    .placeholder(R.drawable.placeholder_avatar_image)
                    .error(R.drawable.placeholder_avatar_error)
                    .into(image);
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

        holder.setFields(member);
        holder.setBackgroundColor(position);
    }
}
