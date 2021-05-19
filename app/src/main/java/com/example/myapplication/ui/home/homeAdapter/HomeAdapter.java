package com.example.myapplication.ui.home.homeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemRvBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHOlder> {

    private List<HomeModel> list = new ArrayList<>();

    @NonNull
    @Override
    public HomeViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewHOlder(ItemRvBinding.inflate(LayoutInflater.
                from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHOlder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void addElem(HomeModel homeModel){
        list.add(homeModel);
        notifyDataSetChanged();
    }

    class HomeViewHOlder extends RecyclerView.ViewHolder {

        private ItemRvBinding binding;

        public HomeViewHOlder(@NonNull ItemRvBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(HomeModel homeModel) {
            binding.titleTV.setText(homeModel.getTitle());
            binding.deckTV.setText(homeModel.getDeck());
            binding.getRoot().setOnClickListener(v -> {
                Toast.makeText(binding.getRoot().getContext(), homeModel.getTitle(), Toast.LENGTH_SHORT).show();
            });
        }
    }
}
