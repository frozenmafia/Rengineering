package o;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
/* loaded from: classes4.dex */
public final class getSharedElementReturnTransition implements SensorEventListener {
    public static final toString valueOf = new toString(null);
    private getSharedElementReturnTransition$ag$a values;

    public final void valueOf(getSharedElementReturnTransition$ag$a getsharedelementreturntransition_ag_a) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            this.values = getsharedelementreturntransition_ag_a;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            runAnimators.ag$a(sensorEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
            getSharedElementReturnTransition$ag$a getsharedelementreturntransition_ag_a = this.values;
            if (getsharedelementreturntransition_ag_a == null) {
                return;
            }
            double d = sensorEvent.values[0] / 9.80665f;
            double d2 = sensorEvent.values[1] / 9.80665f;
            double d3 = sensorEvent.values[2] / 9.80665f;
            if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.3d) {
                getsharedelementreturntransition_ag_a.valueOf();
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            runAnimators.ag$a(sensor, "sensor");
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
