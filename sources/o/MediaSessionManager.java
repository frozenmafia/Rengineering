package o;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.listener.ChartTouchListener;
import o.MediaButtonReceiver;
import o.buildMediaButtonPendingIntent;
/* loaded from: classes4.dex */
public abstract class MediaSessionManager extends buildMediaButtonPendingIntent.valueOf implements Runnable {
    protected MediaButtonReceiver.MediaButtonConnectionCallback HaptikSDK$a;
    protected float HaptikSDK$b;
    protected float[] HaptikSDK$c = new float[2];
    protected View ah$b;
    protected float invoke;
    protected getMediaButtonReceiverComponent values;

    /* loaded from: classes4.dex */
    public interface RemoteUserInfoImpl {
        void ag$a(MotionEvent motionEvent);

        void ah$a(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture);

        void toString(MotionEvent motionEvent);

        void toString(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void toString(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture);

        void valueOf(MotionEvent motionEvent);

        void valueOf(MotionEvent motionEvent, float f, float f2);

        void values(MotionEvent motionEvent, float f, float f2);
    }

    /* loaded from: classes7.dex */
    public class MediaSessionManagerImpl extends MediaSessionManager {
        private static buildMediaButtonPendingIntent<MediaSessionManagerImpl> valueOf;

        static {
            buildMediaButtonPendingIntent<MediaSessionManagerImpl> buildmediabuttonpendingintent = buildMediaButtonPendingIntent.toString(2, new MediaSessionManagerImpl(null, 0.0f, 0.0f, null, null));
            valueOf = buildmediabuttonpendingintent;
            buildmediabuttonpendingintent.toString(0.5f);
        }

        public static MediaSessionManagerImpl valueOf(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, getMediaButtonReceiverComponent getmediabuttonreceivercomponent, View view) {
            MediaSessionManagerImpl ah$a = valueOf.ah$a();
            ah$a.HaptikSDK$a = mediaButtonConnectionCallback;
            ah$a.invoke = f;
            ah$a.HaptikSDK$b = f2;
            ah$a.values = getmediabuttonreceivercomponent;
            ah$a.ah$b = view;
            return ah$a;
        }

        public static void ag$a(MediaSessionManagerImpl mediaSessionManagerImpl) {
            valueOf.valueOf(mediaSessionManagerImpl);
        }

        public MediaSessionManagerImpl(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, getMediaButtonReceiverComponent getmediabuttonreceivercomponent, View view) {
            super(mediaButtonConnectionCallback, f, f2, getmediabuttonreceivercomponent, view);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.HaptikSDK$c[0] = this.invoke;
            this.HaptikSDK$c[1] = this.HaptikSDK$b;
            this.values.toString(this.HaptikSDK$c);
            this.HaptikSDK$a.ag$a(this.HaptikSDK$c, this.ah$b);
            ag$a(this);
        }

        @Override // o.buildMediaButtonPendingIntent.valueOf
        protected buildMediaButtonPendingIntent.valueOf ag$a() {
            return new MediaSessionManagerImpl(this.HaptikSDK$a, this.invoke, this.HaptikSDK$b, this.values, this.ah$b);
        }
    }

    /* loaded from: classes7.dex */
    public class RemoteUserInfo extends getSessionManager {
        private static buildMediaButtonPendingIntent<RemoteUserInfo> HaptikSDK$d;

        static {
            buildMediaButtonPendingIntent<RemoteUserInfo> buildmediabuttonpendingintent = buildMediaButtonPendingIntent.toString(4, new RemoteUserInfo(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
            HaptikSDK$d = buildmediabuttonpendingintent;
            buildmediabuttonpendingintent.toString(0.5f);
        }

        public static RemoteUserInfo ah$a(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, getMediaButtonReceiverComponent getmediabuttonreceivercomponent, View view, float f3, float f4, long j) {
            RemoteUserInfo ah$a = HaptikSDK$d.ah$a();
            ah$a.HaptikSDK$a = mediaButtonConnectionCallback;
            ah$a.invoke = f;
            ah$a.HaptikSDK$b = f2;
            ah$a.values = getmediabuttonreceivercomponent;
            ah$a.ah$b = view;
            ah$a.ag$a = f3;
            ah$a.ah$a = f4;
            ah$a.valueOf.setDuration(j);
            return ah$a;
        }

        public static void ag$a(RemoteUserInfo remoteUserInfo) {
            HaptikSDK$d.valueOf(remoteUserInfo);
        }

        public RemoteUserInfo(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, getMediaButtonReceiverComponent getmediabuttonreceivercomponent, View view, float f3, float f4, long j) {
            super(mediaButtonConnectionCallback, f, f2, getmediabuttonreceivercomponent, view, f3, f4, j);
        }

        @Override // o.getSessionManager, android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.HaptikSDK$c[0] = this.ag$a + ((this.invoke - this.ag$a) * this.toString);
            this.HaptikSDK$c[1] = this.ah$a + ((this.HaptikSDK$b - this.ah$a) * this.toString);
            this.values.toString(this.HaptikSDK$c);
            this.HaptikSDK$a.ag$a(this.HaptikSDK$c, this.ah$b);
        }

        @Override // o.getSessionManager
        public void valueOf() {
            ag$a(this);
        }

        @Override // o.buildMediaButtonPendingIntent.valueOf
        protected buildMediaButtonPendingIntent.valueOf ag$a() {
            return new RemoteUserInfo(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
        }
    }

    public MediaSessionManager(MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback, float f, float f2, getMediaButtonReceiverComponent getmediabuttonreceivercomponent, View view) {
        this.invoke = 0.0f;
        this.HaptikSDK$b = 0.0f;
        this.HaptikSDK$a = mediaButtonConnectionCallback;
        this.invoke = f;
        this.HaptikSDK$b = f2;
        this.values = getmediabuttonreceivercomponent;
        this.ah$b = view;
    }
}
