package o;

import android.view.MotionEvent;
/* loaded from: classes5.dex */
public final class FileUtil {
    private long HaptikSDK$a;
    private double HaptikSDK$c;
    private float ag$a;
    private long ah$a;
    private double ah$b;
    private final int[] invoke = new int[2];
    private final values toString;
    private boolean valueOf;
    private float values;

    /* loaded from: classes5.dex */
    public interface values {
        void ah$a(FileUtil fileUtil);

        boolean toString(FileUtil fileUtil);

        boolean values(FileUtil fileUtil);
    }

    public FileUtil(values valuesVar) {
        this.toString = valuesVar;
    }

    public final double valueOf() {
        return this.HaptikSDK$c;
    }

    public final float ag$a() {
        return this.ag$a;
    }

    public final float ah$a() {
        return this.values;
    }

    public final long values() {
        return this.ah$a - this.HaptikSDK$a;
    }

    private final void ag$a(MotionEvent motionEvent) {
        this.HaptikSDK$a = this.ah$a;
        this.ah$a = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.invoke[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.invoke[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        this.ag$a = (x + x2) * 0.5f;
        this.values = (y + y2) * 0.5f;
        double d = -Math.atan2(y2 - y, x2 - x);
        double d2 = Double.isNaN(this.ah$b) ? 0.0d : this.ah$b - d;
        this.HaptikSDK$c = d2;
        this.ah$b = d;
        if (d2 > 3.141592653589793d) {
            this.HaptikSDK$c = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.HaptikSDK$c = d2 + 3.141592653589793d;
        }
        double d3 = this.HaptikSDK$c;
        if (d3 > 1.5707963267948966d) {
            this.HaptikSDK$c = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.HaptikSDK$c = d3 + 3.141592653589793d;
        }
    }

    private final void ah$b() {
        if (this.valueOf) {
            this.valueOf = false;
            values valuesVar = this.toString;
            if (valuesVar == null) {
                return;
            }
            valuesVar.ah$a(this);
        }
    }

    public final boolean ah$a(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.valueOf = false;
            this.invoke[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.invoke[1] = -1;
        } else if (actionMasked == 1) {
            ah$b();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.valueOf) {
                    this.invoke[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.valueOf = true;
                    this.HaptikSDK$a = motionEvent.getEventTime();
                    this.ah$b = Double.NaN;
                    ag$a(motionEvent);
                    values valuesVar = this.toString;
                    if (valuesVar != null) {
                        valuesVar.toString(this);
                    }
                }
            } else if (actionMasked == 6 && this.valueOf) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int[] iArr = this.invoke;
                if (pointerId == iArr[0] || pointerId == iArr[1]) {
                    ah$b();
                }
            }
        } else if (this.valueOf) {
            ag$a(motionEvent);
            values valuesVar2 = this.toString;
            if (valuesVar2 != null) {
                valuesVar2.values(this);
            }
        }
        return true;
    }
}
