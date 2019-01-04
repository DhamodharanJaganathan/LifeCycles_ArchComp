package com.dhamodharan.lifecycle;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  Main main;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.d("lifecycle", "onCreate invoked");

    main = new Main(this);
    getLifecycle().addObserver(main);
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.d("lifecycle", "onStart invoked");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d("lifecycle", "onResume invoked");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.d("lifecycle", "onPause invoked");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.d("lifecycle", "onStop invoked");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.d("lifecycle", "onRestart invoked");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.d("lifecycle", "onDestroy invoked");
    getLifecycle().addObserver(main);

  }
}
