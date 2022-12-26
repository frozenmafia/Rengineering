package o;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes3.dex */
public final class toPlatformType<Z> extends systemGestures<Z> {
    private static final Handler toString = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.toPlatformType.5
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((toPlatformType) message.obj).ah$a();
                return true;
            }
            return false;
        }
    });
    private final dispatch ah$a;

    @Override // o.controlWindowInsetsAnimation
    public void ag$a(Drawable drawable) {
    }

    public static <Z> toPlatformType<Z> values(dispatch dispatchVar, int i, int i2) {
        return new toPlatformType<>(dispatchVar, i, i2);
    }

    private toPlatformType(dispatch dispatchVar, int i, int i2) {
        super(i, i2);
        this.ah$a = dispatchVar;
    }

    @Override // o.controlWindowInsetsAnimation
    public void toString(Z z, removeOnControllableInsetsChangedListener<? super Z> removeoncontrollableinsetschangedlistener) {
        toString.obtainMessage(1, this).sendToTarget();
    }

    void ah$a() {
        this.ah$a.ag$a(this);
    }
}
