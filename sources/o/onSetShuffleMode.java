package o;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class onSetShuffleMode implements onSkipToNext, onSkipToPrevious$ag$a {
    private final LottieDrawable ag$a;
    private final onSkipToPrevious<Float, Float> ah$a;
    private getQueueItem valueOf;
    private final String values;

    @Override // o.onPlay
    public void valueOf(List<onPlay> list, List<onPlay> list2) {
    }

    public onSetShuffleMode(LottieDrawable lottieDrawable, MediaSessionCompat.QueueItem.Api21Impl api21Impl, getQueueId getqueueid) {
        this.ag$a = lottieDrawable;
        this.values = getqueueid.ah$a();
        onSkipToPrevious<Float, Float> valueOf = getqueueid.valueOf().valueOf();
        this.ah$a = valueOf;
        api21Impl.values(valueOf);
        valueOf.toString(this);
    }

    @Override // o.onPlay
    public String valueOf() {
        return this.values;
    }

    @Override // o.onSkipToPrevious$ag$a
    public void ah$a() {
        this.ag$a.invalidateSelf();
    }

    public onSkipToPrevious<Float, Float> values() {
        return this.ah$a;
    }

    @Override // o.onSkipToNext
    public getQueueItem valueOf(getQueueItem getqueueitem) {
        List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> list;
        boolean z;
        int i;
        List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> ah$a = getqueueitem.ah$a();
        if (ah$a.size() <= 2) {
            return getqueueitem;
        }
        float floatValue = this.ah$a.HaptikSDK$a().floatValue();
        if (floatValue == 0.0f) {
            return getqueueitem;
        }
        getQueueItem ag$a = ag$a(getqueueitem);
        ag$a.ah$a(getqueueitem.ag$a().x, getqueueitem.ag$a().y);
        List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> ah$a2 = ag$a.ah$a();
        boolean valueOf = getqueueitem.valueOf();
        int i2 = 0;
        int i3 = 0;
        while (i2 < ah$a.size()) {
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass1 = ah$a.get(i2);
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass12 = ah$a.get(ah$a(i2 - 1, ah$a.size()));
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass13 = ah$a.get(ah$a(i2 - 2, ah$a.size()));
            PointF ah$a3 = (i2 != 0 || valueOf) ? anonymousClass12.ah$a() : getqueueitem.ag$a();
            PointF ag$a2 = (i2 != 0 || valueOf) ? anonymousClass12.ag$a() : ah$a3;
            PointF valueOf2 = anonymousClass1.valueOf();
            PointF ah$a4 = anonymousClass13.ah$a();
            PointF ah$a5 = anonymousClass1.ah$a();
            boolean z2 = !getqueueitem.valueOf() && i2 == 0 && i2 == ah$a.size() + (-1);
            if (ag$a2.equals(ah$a3) && valueOf2.equals(ah$a3) && !z2) {
                float f = ah$a3.x;
                float f2 = ah$a4.x;
                float f3 = ah$a3.y;
                float f4 = ah$a4.y;
                float f5 = ah$a5.x;
                list = ah$a;
                float f6 = ah$a3.x;
                float f7 = ah$a5.y;
                z = valueOf;
                float f8 = ah$a3.y;
                i = i2;
                float min = Math.min(floatValue / ((float) Math.hypot(f - f2, f3 - f4)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f5 - f6, f7 - f8)), 0.5f);
                float f9 = ah$a3.x + ((ah$a4.x - ah$a3.x) * min);
                float f10 = ah$a3.y + ((ah$a4.y - ah$a3.y) * min);
                float f11 = ah$a3.x + ((ah$a5.x - ah$a3.x) * min2);
                float f12 = ah$a3.y + ((ah$a5.y - ah$a3.y) * min2);
                float f13 = ah$a3.x;
                float f14 = ah$a3.y;
                float f15 = ah$a3.x;
                float f16 = ah$a3.y;
                MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass14 = ah$a2.get(ah$a(i3 - 1, ah$a2.size()));
                MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass15 = ah$a2.get(i3);
                anonymousClass14.ag$a(f9, f10);
                anonymousClass14.toString(f9, f10);
                if (i == 0) {
                    ag$a.ah$a(f9, f10);
                }
                anonymousClass15.ah$a(f9 - ((f9 - f13) * 0.5519f), f10 - ((f10 - f14) * 0.5519f));
                i3++;
                anonymousClass15.ag$a(f11 - ((f11 - f15) * 0.5519f), f12 - ((f12 - f16) * 0.5519f));
                anonymousClass15.toString(f11, f12);
                ah$a2.get(i3).ah$a(f11, f12);
            } else {
                list = ah$a;
                z = valueOf;
                i = i2;
                MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass16 = ah$a2.get(ah$a(i3 - 1, ah$a2.size()));
                anonymousClass16.ag$a(anonymousClass12.ah$a().x, anonymousClass12.ah$a().y);
                anonymousClass16.toString(anonymousClass12.ah$a().x, anonymousClass12.ah$a().y);
                ah$a2.get(i3).ah$a(anonymousClass1.ah$a().x, anonymousClass1.ah$a().y);
            }
            i3++;
            i2 = i + 1;
            ah$a = list;
            valueOf = z;
        }
        return ag$a;
    }

    private getQueueItem ag$a(getQueueItem getqueueitem) {
        List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> ah$a = getqueueitem.ah$a();
        boolean valueOf = getqueueitem.valueOf();
        int size = ah$a.size() - 1;
        int i = 0;
        while (size >= 0) {
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass1 = ah$a.get(size);
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass12 = ah$a.get(ah$a(size - 1, ah$a.size()));
            PointF ah$a2 = (size != 0 || valueOf) ? anonymousClass12.ah$a() : getqueueitem.ag$a();
            i = (((size != 0 || valueOf) ? anonymousClass12.ag$a() : ah$a2).equals(ah$a2) && anonymousClass1.valueOf().equals(ah$a2) && !(!getqueueitem.valueOf() && size == 0 && size == ah$a.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        getQueueItem getqueueitem2 = this.valueOf;
        if (getqueueitem2 == null || getqueueitem2.ah$a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1());
            }
            this.valueOf = new getQueueItem(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.valueOf.valueOf(valueOf);
        return this.valueOf;
    }

    private static int ah$a(int i, int i2) {
        return i - (valueOf(i, i2) * i2);
    }

    private static int valueOf(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
