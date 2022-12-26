package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
import o.onPlay;
import o.onSetRating;
import o.sendExtras;
/* loaded from: classes.dex */
public class PolystarShape implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final sendExtras HaptikSDK$a;
    private final sendExtras HaptikSDK$b;
    private final MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> HaptikSDK$c;
    private final Type HaptikWebView;
    private final boolean ag$a;
    private final String ah$a;
    private final sendExtras ah$b;
    private final sendExtras invoke;
    private final boolean toString;
    private final sendExtras valueOf;
    private final sendExtras values;

    /* loaded from: classes.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, sendExtras sendextras, MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> anonymousClass1, sendExtras sendextras2, sendExtras sendextras3, sendExtras sendextras4, sendExtras sendextras5, sendExtras sendextras6, boolean z, boolean z2) {
        this.ah$a = str;
        this.HaptikWebView = type;
        this.ah$b = sendextras;
        this.HaptikSDK$c = anonymousClass1;
        this.HaptikSDK$b = sendextras2;
        this.valueOf = sendextras3;
        this.invoke = sendextras4;
        this.values = sendextras5;
        this.HaptikSDK$a = sendextras6;
        this.toString = z;
        this.ag$a = z2;
    }

    public String valueOf() {
        return this.ah$a;
    }

    public Type invoke() {
        return this.HaptikWebView;
    }

    public sendExtras HaptikSDK$a() {
        return this.ah$b;
    }

    public MediaSessionCompat.MediaSessionImplBase.AnonymousClass1<PointF, PointF> HaptikSDK$c() {
        return this.HaptikSDK$c;
    }

    public sendExtras HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public sendExtras ah$a() {
        return this.valueOf;
    }

    public sendExtras values() {
        return this.invoke;
    }

    public sendExtras ag$a() {
        return this.values;
    }

    public sendExtras ah$b() {
        return this.HaptikSDK$a;
    }

    public boolean getInitSettings() {
        return this.toString;
    }

    public boolean HaptikWebView() {
        return this.ag$a;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return new onSetRating(lottieDrawable, api21Impl, this);
    }
}
