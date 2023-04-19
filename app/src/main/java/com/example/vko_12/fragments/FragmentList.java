package com.example.vko_12.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.vko_12.PageAdapter;
import com.example.vko_12.R;
import com.example.vko_12.Storage;
public class FragmentList extends Fragment {
    private Storage storage;
    private RecyclerView recyclerView;
    private PageAdapter adapter;

    public FragmentList() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        Button addPurchase = view.findViewById(R.id.btnAddItem);
        //ImageView calenderImage = view.findViewById(R.id.imgCalender);
        //ImageView deleteImage = view.findViewById(R.id.imgAlphabet);


        storage = Storage.getInstance();
        recyclerView = view.findViewById(R.id.rvItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        //adapter = new PageAdapter(view.getContext(), storage.getPurchases());
        recyclerView.setAdapter(adapter);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.recyclerView = view.findViewById(R.id.rvItemList);
    }

    public void receiveMessage(String message) {
        if (message != null && this.recyclerView != null) {
            //this.messageTextView.setText(message);
            //recyclerView.setLayoutManager(new LinearLayoutManager());
            //adapter = new PageAdapter(getApplicationContext(), storage.getPurchases());
            recyclerView.setAdapter(adapter);
        }
    }

}