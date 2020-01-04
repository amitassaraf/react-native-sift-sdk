package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import siftscience.android.Sift;

public class RNSiftSdkModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNSiftSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        this.reactContext.addLifecycleEventListener(this);
    }

    @Override
    public String getName() {
        return "RNSiftSdk";
    }


    @ReactMethod
    public void initSdk (String accountid,String beaconkey) {
        Sift.open(reactContext, new Sift.Config.Builder()
                .withAccountId(accountid)
                .withBeaconKey(beaconkey)
                .withDisallowLocationCollection(true)
                .build());
        Sift.collect();
    }

    @ReactMethod
    public void setUserId (String userId) {
        Sift.setUserId(userId);
    }

    @ReactMethod
    public void unsetUserId () {
        Sift.unsetUserId();
    }

    @Override
    public void onHostResume() {
        Sift.resume(activity);
    }

    @Override
    public void onHostPause() {
        Sift.pause();
    }

    @Override
    public void onHostDestroy() {
        Sift.close();
    }

}
