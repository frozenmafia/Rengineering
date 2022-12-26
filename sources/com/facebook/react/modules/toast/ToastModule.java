package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.Map;
import o.FragmentStateManager;
import o.destroyItem;
@FragmentStateManager.AnonymousClass1(values = ToastModule.NAME)
/* loaded from: classes4.dex */
public class ToastModule extends NativeToastAndroidSpec {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap values = destroyItem.values();
        values.put(DURATION_SHORT_KEY, 0);
        values.put(DURATION_LONG_KEY, 1);
        values.put(GRAVITY_TOP_KEY, 49);
        values.put(GRAVITY_BOTTOM_KEY, 81);
        values.put(GRAVITY_CENTER, 17);
        return values;
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(final String str, double d) {
        final int i = (int) d;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.4
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i).show();
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(final String str, double d, double d2) {
        final int i = (int) d;
        final int i2 = (int) d2;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.1
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                makeText.show();
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(final String str, double d, double d2, double d3, double d4) {
        final int i = (int) d;
        final int i2 = (int) d2;
        final int i3 = (int) d3;
        final int i4 = (int) d4;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.3
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, i3, i4);
                makeText.show();
            }
        });
    }
}
