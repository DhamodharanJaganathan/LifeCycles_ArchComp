package com.dhamodharan.lifecycle;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class Main implements LifecycleObserver {

  private Context context;

  Main(Context context) {

    this.context = context;
  }

  @OnLifecycleEvent(Event.ON_PAUSE)
  public void play() {
    Log.d("TAG", "play: " + "Pause Dhamo calling");
    Toast.makeText(context, "Test Comment", Toast.LENGTH_SHORT).show();
  }


  @OnLifecycleEvent(Event.ON_RESUME)
  public void play_1() {
    Log.d("TAG", "play: " + "Resume Dhamo calling");
  }

}
