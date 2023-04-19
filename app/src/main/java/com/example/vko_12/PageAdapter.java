package com.example.vko_12;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.vko_12.fragments.FragmentAdd;
import com.example.vko_12.fragments.FragmentList;

public class PageAdapter extends FragmentStateAdapter {
    private FragmentAdd fragmentAdd;
    private FragmentList fragmentList;

    public PageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new FragmentAdd();
        } else {
            return new FragmentList();
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public void sendInfoToFragment (String fragmentTag, String message) {
        /*if (this.fragmentAdd != null && fragmentTag.equals(FragmentAdd.TAG)) {
            this.fragmentAdd.AddPurchase(message);
        }*/
    }
}
