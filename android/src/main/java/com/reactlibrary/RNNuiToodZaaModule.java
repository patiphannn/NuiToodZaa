
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNNuiToodZaaModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNNuiToodZaaModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void show(String message, Callback cb) {
    cb.invoke("sssssssss" + message);
  }


  @Override
  public String getName() {
    return "RNNuiToodZaa";
  }
}
