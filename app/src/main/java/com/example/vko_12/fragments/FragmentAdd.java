package com.example.vko_12.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.vko_12.Purchase;
import com.example.vko_12.R;
import com.example.vko_12.Storage;

public class FragmentAdd extends Fragment {

    public FragmentAdd() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        EditText addedItem = view.findViewById(R.id.editTxtItem);
        EditText addedNotice = view.findViewById(R.id.editTxtNotice);
        if (getArguments() != null) {
            addedItem.setText(getArguments().toString());
            addedNotice.setText(getArguments().toString());
        }

        return view;
    }

    public void AddPurchase(View view) {
        EditText addedItem = view.findViewById(R.id.editTxtItem);
        EditText addedNotice = view.findViewById(R.id.editTxtNotice);

        if (addedNotice.getText().toString().isEmpty()) {
            Storage.getInstance().addPurchase(new Purchase(addedItem.getText().toString(), " "));
        }
        else {
            Storage.getInstance().addPurchase(new Purchase(addedItem.getText().toString(), ("Huomio: " + addedNotice.getText().toString())));
        }
    }
}