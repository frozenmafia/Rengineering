package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.TimeUnit;
import o.FragmentLifecycleCallbacksDispatcher;
/* loaded from: classes6.dex */
public class makeFragmentName implements SensorEventListener {
    private static final long ag$a = TimeUnit.NANOSECONDS.convert(20, TimeUnit.MILLISECONDS);
    private static final float values = (float) TimeUnit.NANOSECONDS.convert(3, TimeUnit.SECONDS);
    private SensorManager HaptikSDK$a;
    private long HaptikSDK$b;
    private int HaptikSDK$c;
    private final makeFragmentName$ag$a HaptikWebView;
    private float ah$a;
    private long ah$b;
    private int invoke;
    private float toString;
    private float valueOf;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public makeFragmentName(makeFragmentName$ag$a makefragmentname_ag_a, int i) {
        this.HaptikWebView = makefragmentname_ag_a;
        this.invoke = i;
    }

    public void values(SensorManager sensorManager) {
        FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(sensorManager);
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.HaptikSDK$a = sensorManager;
            this.HaptikSDK$b = -1L;
            sensorManager.registerListener(this, defaultSensor, 2);
            this.ah$b = 0L;
            valueOf();
        }
    }

    public void ah$a() {
        SensorManager sensorManager = this.HaptikSDK$a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.HaptikSDK$a = null;
        }
    }

    private void valueOf() {
        this.HaptikSDK$c = 0;
        this.valueOf = 0.0f;
        this.ah$a = 0.0f;
        this.toString = 0.0f;
    }

    private boolean ah$a(float f) {
        return Math.abs(f) > 13.042845f;
    }

    private void values(long j) {
        this.ah$b = j;
        this.HaptikSDK$c++;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.timestamp - this.HaptikSDK$b < ag$a) {
            return;
        }
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float f3 = sensorEvent.values[2] - 9.80665f;
        this.HaptikSDK$b = sensorEvent.timestamp;
        if (ah$a(f) && this.valueOf * f <= 0.0f) {
            values(sensorEvent.timestamp);
            this.valueOf = f;
        } else if (ah$a(f2) && this.ah$a * f2 <= 0.0f) {
            values(sensorEvent.timestamp);
            this.ah$a = f2;
        } else if (ah$a(f3) && this.toString * f3 <= 0.0f) {
            values(sensorEvent.timestamp);
            this.toString = f3;
        }
        ah$a(sensorEvent.timestamp);
    }

    private void ah$a(long j) {
        if (this.HaptikSDK$c >= this.invoke * 8) {
            valueOf();
            this.HaptikWebView.onShake();
        }
        if (((float) (j - this.ah$b)) > values) {
            valueOf();
        }
    }
}
