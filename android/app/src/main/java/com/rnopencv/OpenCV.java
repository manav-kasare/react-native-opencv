package com.rnopencv;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.opencv.android.OpenCVLoader;

public class OpenCV extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    OpenCV(ReactApplicationContext context){
        super(context);
        reactContext = context;
    }

    @ReactMethod
    public void load(Promise promise){
        try{
            if (OpenCVLoader.initDebug())
                promise.resolve("Loaded");
            else
                promise.reject("Error", "Could not load");
        } catch(Exception e){
            promise.reject(e);
        }
    }

    @NonNull
    @Override
    public String getName() {
        return "OpenCV";
    }
}
