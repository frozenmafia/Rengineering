package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class sendVolumeInfoChanged implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final sendState HaptikSDK$b;
    private final sendExtras HaptikSDK$c;
    private final MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> ag$a;
    private final sendExtras ah$a;
    private final sendExtras ah$b;
    private final sendExtras invoke;
    private final sendExtras toString;
    private final sendEvent valueOf;
    private final sendMetadata values;

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return null;
    }

    public sendVolumeInfoChanged() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public sendVolumeInfoChanged(sendEvent sendevent, MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> anonymousClass1, sendState sendstate, sendExtras sendextras, sendMetadata sendmetadata, sendExtras sendextras2, sendExtras sendextras3, sendExtras sendextras4, sendExtras sendextras5) {
        this.valueOf = sendevent;
        this.ag$a = anonymousClass1;
        this.HaptikSDK$b = sendstate;
        this.toString = sendextras;
        this.values = sendmetadata;
        this.invoke = sendextras2;
        this.ah$a = sendextras3;
        this.HaptikSDK$c = sendextras4;
        this.ah$b = sendextras5;
    }

    public sendEvent valueOf() {
        return this.valueOf;
    }

    public MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> HaptikSDK$c() {
        return this.ag$a;
    }

    public sendState invoke() {
        return this.HaptikSDK$b;
    }

    public sendExtras HaptikSDK$a() {
        return this.toString;
    }

    public sendMetadata values() {
        return this.values;
    }

    public sendExtras HaptikSDK$d() {
        return this.invoke;
    }

    public sendExtras ag$a() {
        return this.ah$a;
    }

    public sendExtras HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public sendExtras ah$b() {
        return this.ah$b;
    }

    public MediaSessionCompat.MediaSessionImplApi18.AnonymousClass1 ah$a() {
        return new MediaSessionCompat.MediaSessionImplApi18.AnonymousClass1(this);
    }
}
