package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import o.MediaSessionCompat;
import o.onPlay;
import o.sendExtras;
import o.setSessionImpl;
/* loaded from: classes.dex */
public class ShapeTrimPath implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final Type HaptikSDK$c;
    private final sendExtras ag$a;
    private final sendExtras ah$a;
    private final boolean toString;
    private final String valueOf;
    private final sendExtras values;

    /* loaded from: classes.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public ShapeTrimPath(String str, Type type, sendExtras sendextras, sendExtras sendextras2, sendExtras sendextras3, boolean z) {
        this.valueOf = str;
        this.HaptikSDK$c = type;
        this.ag$a = sendextras;
        this.values = sendextras2;
        this.ah$a = sendextras3;
        this.toString = z;
    }

    public String valueOf() {
        return this.valueOf;
    }

    public Type invoke() {
        return this.HaptikSDK$c;
    }

    public sendExtras ag$a() {
        return this.values;
    }

    public sendExtras values() {
        return this.ag$a;
    }

    public sendExtras ah$a() {
        return this.ah$a;
    }

    public boolean HaptikSDK$b() {
        return this.toString;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return new setSessionImpl(api21Impl, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.ag$a + ", end: " + this.values + ", offset: " + this.ah$a + "}";
    }
}
