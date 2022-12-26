package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.facebook.react.views.textinput.ReactEditText;
import com.swmansion.gesturehandler.GestureHandler;
import o.CopyLock$ah$a;
/* loaded from: classes5.dex */
public final class CopyLock extends GestureHandler<CopyLock> {
    public static final values ag$a = new values(null);
    private static final CopyLock$ag$a toString = new CopyLock$ah$a() { // from class: o.CopyLock$ag$a
        @Override // o.CopyLock$ah$a
        public boolean ag$a() {
            return runAnimators.ag$a(this, "this");
        }

        @Override // o.CopyLock$ah$a
        public boolean ag$a(GestureHandler<?> gestureHandler) {
            return CopyLock$ah$a.values.ah$a(this, gestureHandler);
        }

        @Override // o.CopyLock$ah$a
        public void ah$a(MotionEvent motionEvent) {
            CopyLock$ah$a.values.valueOf(this, motionEvent);
        }

        @Override // o.CopyLock$ah$a
        public boolean ah$a() {
            return CopyLock$ah$a.values.toString(this);
        }

        @Override // o.CopyLock$ah$a
        public boolean valueOf() {
            return runAnimators.ag$a(this, "this");
        }

        @Override // o.CopyLock$ah$a
        public void values(MotionEvent motionEvent) {
            CopyLock$ah$a.values.toString(this, motionEvent);
        }
    };
    private boolean ah$b;
    private boolean valueOf;
    private CopyLock$ah$a values = toString;

    public CopyLock() {
        HaptikSDK$b(true);
    }

    public final boolean extraCommand() {
        return this.valueOf;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ah$a() {
        super.ah$a();
        this.ah$b = false;
        this.valueOf = false;
    }

    public final CopyLock invoke(boolean z) {
        CopyLock copyLock = this;
        copyLock.ah$b = z;
        return copyLock;
    }

    public final CopyLock HaptikSDK$a(boolean z) {
        CopyLock copyLock = this;
        copyLock.valueOf = z;
        return copyLock;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public boolean HaptikSDK$a(GestureHandler<?> gestureHandler) {
        runAnimators.ag$a(gestureHandler, "handler");
        if (!super.HaptikSDK$a(gestureHandler) && !this.values.ag$a(gestureHandler)) {
            if ((gestureHandler instanceof CopyLock) && gestureHandler.ak$a() == 4 && ((CopyLock) gestureHandler).valueOf) {
                return false;
            }
            boolean z = !this.valueOf;
            int ak$a = gestureHandler.ak$a();
            if ((ak$a() == 4 && ak$a == 4 && z) || ak$a() != 4 || !z) {
                return false;
            }
            if (this.values.ah$a() && gestureHandler.onMessageChannelReady() <= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public boolean HaptikSDK$c(GestureHandler<?> gestureHandler) {
        runAnimators.ag$a(gestureHandler, "handler");
        return !this.valueOf;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void getDefaultImpl() {
        View onPostMessage = onPostMessage();
        if (onPostMessage instanceof CopyLock$ah$a) {
            this.values = (CopyLock$ah$a) onPostMessage;
        } else if (onPostMessage instanceof ReactEditText) {
            this.values = new toString(this, (ReactEditText) onPostMessage);
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(MotionEvent motionEvent, MotionEvent motionEvent2) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        runAnimators.ag$a(motionEvent2, "sourceEvent");
        View onPostMessage = onPostMessage();
        runAnimators.toString(onPostMessage);
        if (motionEvent.getActionMasked() == 1) {
            onPostMessage.onTouchEvent(motionEvent);
            if ((ak$a() == 0 || ak$a() == 2) && onPostMessage.isPressed()) {
                ah$b();
            }
            HaptikWebView();
            this.values.ah$a(motionEvent);
        } else if (ak$a() == 0 || ak$a() == 2) {
            if (this.ah$b) {
                ag$a.valueOf(onPostMessage, motionEvent);
                onPostMessage.onTouchEvent(motionEvent);
                ah$b();
            } else if (ag$a.valueOf(onPostMessage, motionEvent)) {
                onPostMessage.onTouchEvent(motionEvent);
                ah$b();
            } else if (this.values.ag$a()) {
                this.values.values(motionEvent);
            } else if (ak$a() != 2) {
                if (this.values.valueOf()) {
                    HaptikSDK$a();
                } else {
                    HaptikSDK$b();
                }
            }
        } else if (ak$a() == 4) {
            onPostMessage.onTouchEvent(motionEvent);
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        View onPostMessage = onPostMessage();
        runAnimators.toString(onPostMessage);
        onPostMessage.onTouchEvent(obtain);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void values() {
        this.values = toString;
    }

    /* loaded from: classes5.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean valueOf(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes5.dex */
    static final class toString implements CopyLock$ah$a {
        private final ReactEditText ag$a;
        private final CopyLock ah$a;
        private int toString;
        private float valueOf;
        private float values;

        @Override // o.CopyLock$ah$a
        public boolean ag$a() {
            return true;
        }

        @Override // o.CopyLock$ah$a
        public boolean ah$a() {
            return true;
        }

        public toString(CopyLock copyLock, ReactEditText reactEditText) {
            runAnimators.ag$a(copyLock, "handler");
            runAnimators.ag$a(reactEditText, "editText");
            this.ah$a = copyLock;
            this.ag$a = reactEditText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(reactEditText.getContext());
            this.toString = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // o.CopyLock$ah$a
        public boolean valueOf() {
            return runAnimators.ag$a(this, "this");
        }

        @Override // o.CopyLock$ah$a
        public void ah$a(MotionEvent motionEvent) {
            runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
            if (((motionEvent.getX() - this.values) * (motionEvent.getX() - this.values)) + ((motionEvent.getY() - this.valueOf) * (motionEvent.getY() - this.valueOf)) < this.toString) {
                this.ag$a.HaptikWebView();
            }
        }

        @Override // o.CopyLock$ah$a
        public boolean ag$a(GestureHandler<?> gestureHandler) {
            runAnimators.ag$a(gestureHandler, "handler");
            return gestureHandler.onMessageChannelReady() > 0 && !(gestureHandler instanceof CopyLock);
        }

        @Override // o.CopyLock$ah$a
        public void values(MotionEvent motionEvent) {
            runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
            this.ah$a.ah$b();
            this.ag$a.onTouchEvent(motionEvent);
            this.values = motionEvent.getX();
            this.valueOf = motionEvent.getY();
        }
    }
}
