package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
/* loaded from: classes4.dex */
public class dispatchOnFragmentDetached {
    float ag$a;
    boolean ah$a;
    boolean ah$b;
    final float invoke;
    valueOf toString;
    float valueOf;
    long values;

    /* loaded from: classes4.dex */
    public interface valueOf {
        boolean ak();
    }

    public dispatchOnFragmentDetached(Context context) {
        this.invoke = ViewConfiguration.get(context).getScaledTouchSlop();
        values();
    }

    public static dispatchOnFragmentDetached valueOf(Context context) {
        return new dispatchOnFragmentDetached(context);
    }

    public void values() {
        this.toString = null;
        ag$a();
    }

    public void ag$a() {
        this.ah$a = false;
        this.ah$b = false;
    }

    public void ah$a(valueOf valueof) {
        this.toString = valueof;
    }

    public boolean valueOf() {
        return this.ah$a;
    }

    public boolean ah$a(MotionEvent motionEvent) {
        valueOf valueof;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ah$a = true;
            this.ah$b = true;
            this.values = motionEvent.getEventTime();
            this.ag$a = motionEvent.getX();
            this.valueOf = motionEvent.getY();
        } else if (action == 1) {
            this.ah$a = false;
            if (Math.abs(motionEvent.getX() - this.ag$a) > this.invoke || Math.abs(motionEvent.getY() - this.valueOf) > this.invoke) {
                this.ah$b = false;
            }
            if (this.ah$b && motionEvent.getEventTime() - this.values <= ViewConfiguration.getLongPressTimeout() && (valueof = this.toString) != null) {
                valueof.ak();
            }
            this.ah$b = false;
        } else if (action != 2) {
            if (action == 3) {
                this.ah$a = false;
                this.ah$b = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.ag$a) > this.invoke || Math.abs(motionEvent.getY() - this.valueOf) > this.invoke) {
            this.ah$b = false;
        }
        return true;
    }
}
