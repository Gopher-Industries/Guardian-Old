package com.example.guardian.ui.admission;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.guardian.databinding.FragmentAdmissionBinding;

public class AdmissionFragment extends Fragment {

    private FragmentAdmissionBinding binding;
    private AdmissionViewModel admissionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AdmissionViewModel galleryViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(AdmissionViewModel.class);

        binding = FragmentAdmissionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        admissionViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}