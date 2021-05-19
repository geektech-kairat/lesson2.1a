package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.ui.home.homeAdapter.HomeAdapter;
import com.example.myapplication.ui.home.homeAdapter.HomeModel;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private NavController navController;
    private HomeAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new HomeAdapter();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        binding.fab.setOnClickListener(v -> {
            navController.navigate(R.id.action_navigation_home_to_formFragment);
        });
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("12321321", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        adapter.addElem(new HomeModel("123123123", "bjsabdjasb"));
        adapter.addElem(new HomeModel("asdnasjdkjasbdjkashjdkh", "bjsabdjasb"));
        binding.rv.setAdapter(adapter);
        return binding.getRoot();
    }
}