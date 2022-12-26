package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatSeekBar;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
/* loaded from: classes5.dex */
public class ReactSlider extends AppCompatSeekBar {
    private static int valueOf = 128;
    private double HaptikSDK$a;
    private double HaptikSDK$b;
    private double HaptikSDK$c;
    private double ag$a;
    private String ah$a;
    private List<String> toString;
    private double values;

    public ReactSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag$a = 0.0d;
        this.values = 0.0d;
        this.HaptikSDK$b = 0.0d;
        this.HaptikSDK$c = 0.0d;
        this.HaptikSDK$a = 0.0d;
        valueOf();
    }

    private void valueOf() {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(double d) {
        this.values = d;
        ag$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(double d) {
        this.ag$a = d;
        ag$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(double d) {
        this.HaptikSDK$b = d;
        invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(double d) {
        this.HaptikSDK$c = d;
        ag$a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(String str) {
        this.ah$a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(List<String> list) {
        this.toString = list;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT >= 21) {
            if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
                setupAccessibility((int) this.HaptikSDK$b);
            }
        }
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        final AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            final AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new TimerTask() { // from class: com.reactnativecommunity.slider.ReactSlider.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            }, 1000L);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 0 || isEnabled()) {
            return true;
        }
        announceForAccessibility("slider disabled");
        return true;
    }

    public void setupAccessibility(int i) {
        List<String> list;
        if (this.ah$a == null || (list = this.toString) == null || list.size() - 1 != ((int) this.values)) {
            return;
        }
        String str = this.toString.get(i);
        int length = this.ah$a.length();
        String str2 = this.ah$a;
        if (str != null && Integer.parseInt(str) == 1) {
            str2 = str2.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, str2));
    }

    public double values(int i) {
        if (i == getMax()) {
            return this.values;
        }
        return (i * ah$a()) + this.ag$a;
    }

    private void ag$a() {
        if (this.HaptikSDK$c == 0.0d) {
            this.HaptikSDK$a = (this.values - this.ag$a) / valueOf;
        }
        setMax(values());
        invoke();
    }

    private void invoke() {
        double d = this.HaptikSDK$b;
        double d2 = this.ag$a;
        setProgress((int) Math.round(((d - d2) / (this.values - d2)) * values()));
    }

    private int values() {
        return (int) Math.ceil((this.values - this.ag$a) / ah$a());
    }

    private double ah$a() {
        double d = this.HaptikSDK$c;
        return d > 0.0d ? d : this.HaptikSDK$a;
    }

    private BitmapDrawable ah$a(final String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new Callable<BitmapDrawable>() { // from class: com.reactnativecommunity.slider.ReactSlider.5
                @Override // java.util.concurrent.Callable
                /* renamed from: ag$a */
                public BitmapDrawable call() {
                    Bitmap decodeStream;
                    try {
                        if (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("file://") && !str.startsWith("asset://") && !str.startsWith("data:")) {
                            decodeStream = BitmapFactory.decodeResource(ReactSlider.this.getResources(), ReactSlider.this.getResources().getIdentifier(str, "drawable", ReactSlider.this.getContext().getPackageName()));
                            return new BitmapDrawable(ReactSlider.this.getResources(), decodeStream);
                        }
                        decodeStream = BitmapFactory.decodeStream(new URL(str).openStream());
                        return new BitmapDrawable(ReactSlider.this.getResources(), decodeStream);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setThumbImage(String str) {
        if (str != null) {
            setThumb(ah$a(str));
            if (Build.VERSION.SDK_INT >= 21) {
                setSplitTrack(false);
                return;
            }
            return;
        }
        setThumb(getThumb());
    }
}
