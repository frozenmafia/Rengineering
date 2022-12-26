package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import o.MediaSessionCompat;
import o.onPlay;
import o.onStop;
import o.sendExtras;
import o.sendMetadata;
import o.sendQueueTitle;
/* loaded from: classes.dex */
public class ShapeStroke implements MediaSessionCompat.MediaSessionImplBase.MessageHandler {
    private final sendExtras HaptikSDK$a;
    private final float HaptikSDK$b;
    private final String HaptikSDK$c;
    private final List<sendExtras> ag$a;
    private final boolean ah$a;
    private final sendExtras ah$b;
    private final sendMetadata invoke;
    private final LineJoinType toString;
    private final sendQueueTitle valueOf;
    private final LineCapType values;

    /* loaded from: classes.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = AnonymousClass4.valueOf[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return Paint.Cap.ROUND;
                }
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] ag$a;
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            ag$a = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            valueOf = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                valueOf[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                valueOf[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = AnonymousClass4.ag$a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, sendExtras sendextras, List<sendExtras> list, sendQueueTitle sendqueuetitle, sendMetadata sendmetadata, sendExtras sendextras2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.HaptikSDK$c = str;
        this.HaptikSDK$a = sendextras;
        this.ag$a = list;
        this.valueOf = sendqueuetitle;
        this.invoke = sendmetadata;
        this.ah$b = sendextras2;
        this.values = lineCapType;
        this.toString = lineJoinType;
        this.HaptikSDK$b = f;
        this.ah$a = z;
    }

    @Override // o.MediaSessionCompat.MediaSessionImplBase.MessageHandler
    public onPlay toString(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl) {
        return new onStop(lottieDrawable, api21Impl, this);
    }

    public String invoke() {
        return this.HaptikSDK$c;
    }

    public sendQueueTitle valueOf() {
        return this.valueOf;
    }

    public sendMetadata HaptikSDK$a() {
        return this.invoke;
    }

    public sendExtras HaptikSDK$c() {
        return this.ah$b;
    }

    public List<sendExtras> ah$b() {
        return this.ag$a;
    }

    public sendExtras ag$a() {
        return this.HaptikSDK$a;
    }

    public LineCapType ah$a() {
        return this.values;
    }

    public LineJoinType values() {
        return this.toString;
    }

    public float HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public boolean getInitSettings() {
        return this.ah$a;
    }
}
