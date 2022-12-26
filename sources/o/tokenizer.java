package o;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import o.IMultiInstanceInvalidationService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
abstract class tokenizer extends onDelete implements SensorEventListener {
    SensorManager HaptikSDK$a;
    private long HaptikSDK$b;
    JSONArray toString;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public tokenizer(Context context, JSONObject jSONObject) {
        super(context, jSONObject);
        this.HaptikSDK$a = (SensorManager) context.getSystemService("sensor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(Sensor sensor) {
        this.HaptikSDK$a.registerListener(this, sensor, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        this.HaptikSDK$a.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i = (this.HaptikSDK$b > 0L ? 1 : (this.HaptikSDK$b == 0L ? 0 : -1));
        if (i == 0 || (i > 0 && sensorEvent.timestamp - this.HaptikSDK$b > 500000000)) {
            this.HaptikSDK$b = sensorEvent.timestamp;
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(0, sensorEvent.timestamp);
                jSONArray.put(1, sensorEvent.values[0]);
                jSONArray.put(2, sensorEvent.values[1]);
                jSONArray.put(3, sensorEvent.values[2]);
                this.toString.put(jSONArray);
                toString(null);
            } catch (JSONException e) {
                IMultiInstanceInvalidationService.Default.toString(valueOf() + " onSensorChanged ", e);
                toString(new IMultiInstanceInvalidationCallback(e.toString()));
            }
        }
    }
}
