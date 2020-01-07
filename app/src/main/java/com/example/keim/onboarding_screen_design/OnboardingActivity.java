package com.example.keim.onboarding_screen_design;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hololo.tutorial.library.PermissionStep;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnboardingActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.automatic_data))
                        .setContent(getString(R.string.gm_finds_photos))
                        .setBackgroundColor(Color.parseColor("#FF0957"))
                        .setDrawable(R.drawable.undraw_book_lover_mkck)
                        .setSummary(getString(R.string.continue_and_learn))
                        .build());
        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.choose_the_song))
                        .setContent(getString(R.string.swap_to_the_tab))
                        .setBackgroundColor(Color.parseColor("#00D4BA"))
                        .setDrawable(R.drawable.undraw_professor_8lrt)
                        .setSummary(getString(R.string.continue_and_update))
                        .build());
        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.edit_data))
                        .setContent(getString(R.string.update_easily))
                        .setBackgroundColor(Color.parseColor("#1098FE"))
                        .setDrawable(R.drawable.undraw_exams_g4ow)
                        .setSummary(getString(R.string.continue_and_result))
                        .build());
        addFragment(
                new Step.Builder()
                        .setTitle(getString(R.string.result_awesome))
                        .setContent(getString(R.string.after_updating))
                        .setBackgroundColor(Color.parseColor("#CA70F3"))
                        .setDrawable(R.drawable.undraw_fatherhood_7i19)
                        .setSummary(getString(R.string.thank_you))
                        .build());
    }
    @Override
    public void finishTutorial() {
        //Toast.makeText(this, "Tutorial finished", Toast.LENGTH_SHORT).show();
        //finish();
    }

    @Override
    public void currentFragmentPosition(int position) {
        //Toast.makeText(this, "Position : " + position, Toast.LENGTH_SHORT).show();
    }
}
