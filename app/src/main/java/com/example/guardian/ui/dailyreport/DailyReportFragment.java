package com.example.guardian.ui.dailyreport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.guardian.databinding.FragmentDailyreportBinding;

public class DailyReportFragment extends Fragment {

    private FragmentDailyreportBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DailyReportViewModel slideshowViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DailyReportViewModel.class);

        binding = FragmentDailyreportBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}