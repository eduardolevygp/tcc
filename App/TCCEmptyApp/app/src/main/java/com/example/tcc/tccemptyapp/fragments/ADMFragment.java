package com.example.tcc.tccemptyapp.fragments;


import android.content.DialogInterface;
import android.os.Bundle;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.ADMAdapter;
import com.example.tcc.tccemptyapp.models.ManagementMember;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ADMFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private ADMAdapter mAdapter;

    public ADMFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflateFragment(R.layout.fragment_adm, inflater, container);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.adm_recycler);

        setupRecyclerView();
        fakeLoading();
    }

    @Override
    protected void onPlaceholderButtonSelected() {
        showContent();
    }

    private void setupRecyclerView() {
        mAdapter = new ADMAdapter(getContext(), getMockMemberList());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(mAdapter);
    }

    private void fakeLoading() {
         final Handler handler = new Handler();

         showLoading();
         handler.postDelayed(new Runnable() {
             @Override
             public void run() {
                 showPlaceholder();
             }
         }, 3000);
     }

    private List<ManagementMember> getMockMemberList() {
        ManagementMember member1 = new ManagementMember();
        member1.setName("Ana Silva");
        member1.setRole("Vice-Presidente");
        member1.setEmail("ana_silva@gmail2.com");
        member1.setPhone("(11) 99999-9998");
        member1.setImageUrl("http://www.bpl.org/teens/files/2014/10/myAvatar3.png");

        ManagementMember member2 = new ManagementMember();
        member2.setName("Maria Silva");
        member2.setRole("Presidente");
        member2.setEmail("maria_silva@gmail2.com");
        member2.setPhone("(11) 99999-9899");
        member2.setImageUrl("http://3.bp.blogspot.com/-6azEysmzD5g/UyGCj6SjFnI/AAAAAAAAA14/hS5fMo-qTig/s1600/myAvatar1.png");

        ManagementMember member3 = new ManagementMember();
        member3.setName("Italo Silva");
        member3.setRole("Gerente de Eventos");
        member3.setEmail("italo_silva@gmail2.com");
        member3.setPhone("(11) 98999-9999");
        member3.setImageUrl("http://www.tnerb.org/pics/avatar.jpg");

        ManagementMember member4 = new ManagementMember();
        member4.setName("Jose Silva");
        member4.setRole("Tesoureiro");
        member4.setEmail("jose_silva@gmail2.com");
        member4.setPhone("(11) 99989-9999");
        member4.setImageUrl("https://nickik11.files.wordpress.com/2011/01/my-avatar-number-3.jpg");

        List<ManagementMember> list = new ArrayList<>();
        list.add(member1);
        list.add(member2);
        list.add(member3);
        list.add(member4);

        return list;
    }
}
