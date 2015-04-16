package com.ebookfrenzy.myfriends;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
/**
 * Created by student on 4/7/15.
 */
public class About extends ActionBarActivity {

        @Override
        public void onCreate( Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.about);
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

            switch (item.getItemId()) {

                case R.id.menuOne:
                    Intent intent1 = new Intent( About.this, About.class);
                    startActivity(intent1);
                    return true;
                case R.id.menuTwo:
                    Intent intent2 = new Intent( About.this, Help.class);
                    startActivity(intent2);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);


            }

        }

    }

