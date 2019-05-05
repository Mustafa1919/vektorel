package spook.com.android_ui_dsn.ui.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import spook.com.android_ui_dsn.R;

public class MainClass extends AppCompatActivity{
    Button f_a , f_b , f_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainclass);
        //Log.i("Deneme","Deneme");
        f_a = findViewById(R.id.btnA);
        f_b = findViewById(R.id.btnB);
        f_c = findViewById(R.id.btnC);

        f_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(new FragmentA());
            }
        });
        f_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(new FragmentB());
            }
        });
        f_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(new FragmentC());
            }
        });

    }

    private void openFragment(Fragment f){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        /*
        Bu animasyon güzel çalışıyor
        */
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
        fragmentTransaction.addToBackStack(null);
        //fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        fragmentTransaction.show(f);
        fragmentTransaction.replace(R.id.frameLayout , f);
        fragmentTransaction.commit();

        /*
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations( R.anim.abc_slide_in_top, R.anim.abc_slide_out_top ) // Top Fragment Animation
                .show( f )
                .setCustomAnimations( R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom ) // Bottom Fragment Animation
                .addToBackStack(null)
                .show( f )
                .replace(R.id.frameLayout , f)
                .commit();
        */
    }
}
