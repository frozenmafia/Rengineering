package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
/* loaded from: classes4.dex */
public abstract class getVolumeProvider extends createMediaStyle {
    protected onSubscribe HaptikSDK$b;
    protected Paint HaptikSDK$c;
    protected Paint ah$b;
    protected Paint getInitSettings;
    protected Paint invoke;

    public abstract void ag$a(Canvas canvas);

    public abstract void ah$a(Canvas canvas);

    public abstract void toString(Canvas canvas, MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2[] anonymousClass2Arr);

    public abstract void valueOf();

    public abstract void values(Canvas canvas);

    public getVolumeProvider(onSubscribe onsubscribe, MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback) {
        super(mediaButtonConnectionCallback);
        this.HaptikSDK$b = onsubscribe;
        Paint paint = new Paint(1);
        this.ah$b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.invoke = new Paint(4);
        Paint paint2 = new Paint(1);
        this.getInitSettings = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.getInitSettings.setTextAlign(Paint.Align.CENTER);
        this.getInitSettings.setTextSize(getServiceComponentByAction.valueOf(9.0f));
        Paint paint3 = new Paint(1);
        this.HaptikSDK$c = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.HaptikSDK$c.setStrokeWidth(2.0f);
        this.HaptikSDK$c.setColor(Color.rgb(255, 187, 115));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean values(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass1 anonymousClass1) {
        return ((float) anonymousClass1.onTransact().HaptikSDK$b()) < ((float) anonymousClass1.isLogoutPending()) * this.ak.ak();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void toString(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8 anonymousClass8) {
        this.getInitSettings.setTypeface(anonymousClass8.ICustomTabsCallback());
        this.getInitSettings.setTextSize(anonymousClass8.ak$a());
    }
}
