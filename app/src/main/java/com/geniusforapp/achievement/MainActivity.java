package com.geniusforapp.achievement;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.geniusforapp.achievementunlocked.AchievementUnlocked;
import com.geniusforapp.achievementunlocked.entity.AchievementData;
import com.geniusforapp.achievementunlocked.viewes.AchievementIconView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AchievementUnlocked test = new AchievementUnlocked(MainActivity.this).setReadingDelay(5000).setDismissible(true);
                AchievementData achievementData = new AchievementData();
                achievementData.setTitle("Replace with your own action");
                achievementData.setState(AchievementIconView.AchievementIconViewStates.FADE_DRAWABLE);
                achievementData.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                achievementData.setIcon(getResources().getDrawable(android.R.drawable.ic_dialog_alert));
                achievementData.setTextColor(getResources().getColor(android.R.color.white));
                test.show(achievementData);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
