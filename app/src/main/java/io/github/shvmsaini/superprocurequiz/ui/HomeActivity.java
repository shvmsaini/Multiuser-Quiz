package io.github.shvmsaini.superprocurequiz.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import io.github.shvmsaini.superprocurequiz.databinding.ActivityHomeBinding;
import io.github.shvmsaini.superprocurequiz.volley.VolleySingleton;

public class HomeActivity extends FragmentActivity {
    private static final int TIME_DELAY = 2000;
    private static final String TAG = HomeActivity.class.getSimpleName();
    public static RequestQueue requestQueue;
    private static long back_pressed;
    public static VolleySingleton volleySingleton;;
    QuizFragment quizFragment;
    HomeFragment homeFragment;
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        requestQueue = Volley.newRequestQueue(getApplication());

        homeFragment = new HomeFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(binding.fragmentContainerViewTag.getId(), homeFragment);
        transaction.commit();

        volleySingleton = VolleySingleton.getInstance(getApplicationContext());
    }
//
//    @Override
//    public void onBackPressed() {
//        if (back_pressed + TIME_DELAY > System.currentTimeMillis())
//            Toast.makeText(this, "Press again to stop and exit.",
//                    Toast.LENGTH_SHORT).show();
//        else
//            finish();
//        back_pressed = System.currentTimeMillis();
//    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "onConfigurationChanged: Activity");
    }
}
