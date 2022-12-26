package o;

import android.net.Uri;
import com.appsamurai.storyly.exoplayer2.core.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import o.RoundedBitmapDrawable;
import o.createWithBitmap;
/* loaded from: classes3.dex */
public final class FontProvider extends RoundedBitmapDrawable {
    private final boolean HaptikSDK$a;
    private final Object HaptikSDK$b;
    private final createWithBitmap$HaptikSDK$b HaptikSDK$c;
    private final long HaptikSDK$d;
    private final long HaptikSDK$e;
    private final boolean HaptikWebView;
    private final boolean ah$b;
    private final long ak;
    private final long getInitSettings;
    private final long getSignupData;
    private final createWithBitmap invoke;
    private final long onXdkEvent;
    private final long valueOf;
    private static final Object values = new Object();
    private static final createWithBitmap ah$a = new createWithBitmap.values().ah$a("SinglePeriodTimeline").valueOf(Uri.EMPTY).valueOf();

    /* renamed from: o.FontProvider$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public interface AnonymousClass1 {

        /* renamed from: o.FontProvider$1$toString */
        /* loaded from: classes6.dex */
        public interface toString {
        }

        void ag$a(AdsMediaSource adsMediaSource, toString tostring);

        void ah$a(AdsMediaSource adsMediaSource, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, Object obj, getDisplays getdisplays, toString tostring);

        void toString(AdsMediaSource adsMediaSource, int i, int i2);

        void valueOf(AdsMediaSource adsMediaSource, int i, int i2, IOException iOException);

        void values(int... iArr);
    }

    @Override // o.RoundedBitmapDrawable
    public int ag$a() {
        return 1;
    }

    @Override // o.RoundedBitmapDrawable
    public int ah$a() {
        return 1;
    }

    public FontProvider(long j, boolean z, boolean z2, boolean z3, Object obj, createWithBitmap createwithbitmap) {
        this(j, j, 0L, 0L, z, z2, z3, obj, createwithbitmap);
    }

    public FontProvider(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, createWithBitmap createwithbitmap) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j, j2, j3, j4, z, z2, false, obj, createwithbitmap, z3 ? createwithbitmap.ah$a : null);
    }

    public FontProvider(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, createWithBitmap createwithbitmap, createWithBitmap$HaptikSDK$b createwithbitmap_haptiksdk_b) {
        this.HaptikSDK$e = j;
        this.ak = j2;
        this.valueOf = j3;
        this.getInitSettings = j4;
        this.HaptikSDK$d = j5;
        this.onXdkEvent = j6;
        this.getSignupData = j7;
        this.ah$b = z;
        this.HaptikSDK$a = z2;
        this.HaptikWebView = z3;
        this.HaptikSDK$b = obj;
        this.invoke = (createWithBitmap) FingerprintManagerCompat.toString(createwithbitmap);
        this.HaptikSDK$c = createwithbitmap_haptiksdk_b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1 > r6) goto L11;
     */
    @Override // o.RoundedBitmapDrawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.RoundedBitmapDrawable.toString values(int r25, o.RoundedBitmapDrawable.toString r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            o.FingerprintManagerCompat.values(r3, r1, r2)
            long r1 = r0.getSignupData
            boolean r3 = r0.HaptikSDK$a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L2e
            boolean r3 = r0.HaptikWebView
            if (r3 != 0) goto L2e
            r6 = 0
            int r3 = (r27 > r6 ? 1 : (r27 == r6 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r6 = r0.HaptikSDK$d
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L25
            goto L2b
        L25:
            long r1 = r1 + r27
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L2e
        L2b:
            r16 = r4
            goto L30
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = o.RoundedBitmapDrawable.toString.valueOf
            o.createWithBitmap r5 = r0.invoke
            java.lang.Object r6 = r0.HaptikSDK$b
            long r7 = r0.HaptikSDK$e
            long r9 = r0.ak
            long r11 = r0.valueOf
            boolean r13 = r0.ah$b
            boolean r14 = r0.HaptikSDK$a
            o.createWithBitmap$HaptikSDK$b r15 = r0.HaptikSDK$c
            long r1 = r0.HaptikSDK$d
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.onXdkEvent
            r22 = r1
            r3 = r26
            o.RoundedBitmapDrawable$toString r1 = r3.valueOf(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FontProvider.values(int, o.RoundedBitmapDrawable$toString, long):o.RoundedBitmapDrawable$toString");
    }

    @Override // o.RoundedBitmapDrawable
    public RoundedBitmapDrawable.values toString(int i, RoundedBitmapDrawable.values valuesVar, boolean z) {
        FingerprintManagerCompat.values(i, 0, 1);
        return valuesVar.values(null, z ? values : null, 0, this.getInitSettings, -this.onXdkEvent);
    }

    @Override // o.RoundedBitmapDrawable
    public int ah$a(Object obj) {
        return values.equals(obj) ? 0 : -1;
    }

    @Override // o.RoundedBitmapDrawable
    public Object toString(int i) {
        FingerprintManagerCompat.values(i, 0, 1);
        return values;
    }
}
