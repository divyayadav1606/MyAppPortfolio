package com.yadav.divya.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        String msg = null;

        switch (view.getId()) {

            case R.id.popularmovies:
                msg = getString(R.string.toast_msg, getString(R.string.popular_movies));
                break;

            case R.id.stockhawk:
                msg = getString(R.string.toast_msg, getString(R.string.stock_hawk));
                break;

            case R.id.builditbigger:
                msg = getString(R.string.toast_msg, getString(R.string.build_it_bigger));
                break;

            case R.id.makeyourappmaterial:
                msg = getString(R.string.toast_msg, getString(R.string.make_your_app_material));
                break;

            case R.id.goubiquitous:
                msg = getString(R.string.toast_msg, getString(R.string.go_ubiquitous));
                break;

            case R.id.capstone:
                msg = getString(R.string.toast_msg, getString(R.string.capstone));
                break;

            default:
                break;
        }
        Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
