package o;

import android.net.Uri;
import com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData;
import com.appsamurai.storyly.exoplayer2.common.offline.StreamKey;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.AsyncListUtil;
/* loaded from: classes3.dex */
public final class getClip extends getSource {
    public final long HaptikSDK$a;
    public final int HaptikSDK$b;
    public final long HaptikSDK$c;
    public final Map<Uri, valueOf> HaptikSDK$d;
    public final getClip$ah$a HaptikSDK$e;
    public final List<toString> HaptikWebView;
    public final long a;
    public final int ag$a;
    public final long ah$a;
    public final boolean ah$b;
    public final List<getClip$ag$a> aj$a;
    public final int ak;
    public final long getInitSettings;
    public final DrmInitData getSignupData;
    public final boolean invoke;
    public final long onXdkEvent;
    public final boolean toString;
    public final boolean valueOf;
    public final boolean values;

    @Override // o.ParcelableCompatCreatorCallbacks
    /* renamed from: ah$a */
    public getClip toString(List<StreamKey> list) {
        return this;
    }

    /* loaded from: classes3.dex */
    public static final class toString extends values {
        public final String ah$a;
        public final List<getClip$ag$a> toString;

        public toString(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j2, false, ImmutableList.of());
        }

        public toString(String str, toString tostring, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List<getClip$ag$a> list) {
            super(str, tostring, j, i, j2, drmInitData, str3, str4, j3, j4, z);
            this.ah$a = str2;
            this.toString = ImmutableList.copyOf((Collection) list);
        }

        public toString valueOf(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.toString.size(); i2++) {
                getClip$ag$a getclip_ag_a = this.toString.get(i2);
                arrayList.add(getclip_ag_a.ag$a(j2, i));
                j2 += getclip_ag_a.ah$b;
            }
            return new toString(this.getInitSettings, this.HaptikSDK$d, this.ah$a, this.ah$b, i, j, this.HaptikSDK$c, this.invoke, this.HaptikSDK$a, this.ag$a, this.valueOf, this.HaptikSDK$b, arrayList);
        }
    }

    /* loaded from: classes3.dex */
    public static class values implements Comparable<Long> {
        public final String HaptikSDK$a;
        public final boolean HaptikSDK$b;
        public final DrmInitData HaptikSDK$c;
        public final toString HaptikSDK$d;
        public final long HaptikSDK$e;
        public final long ag$a;
        public final long ah$b;
        public final String getInitSettings;
        public final int getSignupData;
        public final String invoke;
        public final long valueOf;

        private values(String str, toString tostring, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
            this.getInitSettings = str;
            this.HaptikSDK$d = tostring;
            this.ah$b = j;
            this.getSignupData = i;
            this.HaptikSDK$e = j2;
            this.HaptikSDK$c = drmInitData;
            this.invoke = str2;
            this.HaptikSDK$a = str3;
            this.ag$a = j3;
            this.valueOf = j4;
            this.HaptikSDK$b = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: values */
        public int compareTo(Long l) {
            if (this.HaptikSDK$e > l.longValue()) {
                return 1;
            }
            return this.HaptikSDK$e < l.longValue() ? -1 : 0;
        }
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public final Uri ah$a;
        public final int toString;
        public final long valueOf;

        public valueOf(Uri uri, long j, int i) {
            this.ah$a = uri;
            this.valueOf = j;
            this.toString = i;
        }
    }

    public getClip(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List<toString> list2, List<getClip$ag$a> list3, getClip$ah$a getclip_ah_a, Map<Uri, valueOf> map) {
        super(str, list, z3);
        this.HaptikSDK$b = i;
        this.a = j2;
        this.ah$b = z;
        this.values = z2;
        this.ag$a = i2;
        this.HaptikSDK$a = j3;
        this.ak = i3;
        this.onXdkEvent = j4;
        this.HaptikSDK$c = j5;
        this.valueOf = z4;
        this.invoke = z5;
        this.getSignupData = drmInitData;
        this.HaptikWebView = ImmutableList.copyOf((Collection) list2);
        this.aj$a = ImmutableList.copyOf((Collection) list3);
        this.HaptikSDK$d = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            getClip$ag$a getclip_ag_a = (getClip$ag$a) AsyncListUtil.DataCallback.valueOf(list3);
            this.ah$a = getclip_ag_a.HaptikSDK$e + getclip_ag_a.ah$b;
        } else if (!list2.isEmpty()) {
            toString tostring = (toString) AsyncListUtil.DataCallback.valueOf(list2);
            this.ah$a = tostring.HaptikSDK$e + tostring.ah$b;
        } else {
            this.ah$a = 0L;
        }
        long j6 = C.TIME_UNSET;
        if (j != C.TIME_UNSET) {
            if (j >= 0) {
                j6 = Math.min(this.ah$a, j);
            } else {
                j6 = Math.max(0L, this.ah$a + j);
            }
        }
        this.getInitSettings = j6;
        this.toString = j >= 0;
        this.HaptikSDK$e = getclip_ah_a;
    }

    public boolean ag$a(getClip getclip) {
        int i;
        if (getclip == null || this.HaptikSDK$a > getclip.HaptikSDK$a) {
            return true;
        }
        if (i < 0) {
            return false;
        }
        int size = this.HaptikWebView.size() - getclip.HaptikWebView.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.aj$a.size();
        int size3 = getclip.aj$a.size();
        if (size2 <= size3) {
            return size2 == size3 && this.valueOf && !getclip.valueOf;
        }
        return true;
    }

    public long ah$a() {
        return this.a + this.ah$a;
    }

    public getClip toString(long j, int i) {
        return new getClip(this.HaptikSDK$b, this.isLogoutPending, this.ak$a, this.getInitSettings, this.ah$b, j, true, i, this.HaptikSDK$a, this.ak, this.onXdkEvent, this.HaptikSDK$c, this.ICustomTabsCallback, this.valueOf, this.invoke, this.getSignupData, this.HaptikWebView, this.aj$a, this.HaptikSDK$e, this.HaptikSDK$d);
    }

    public getClip ag$a() {
        return this.valueOf ? this : new getClip(this.HaptikSDK$b, this.isLogoutPending, this.ak$a, this.getInitSettings, this.ah$b, this.a, this.values, this.ag$a, this.HaptikSDK$a, this.ak, this.onXdkEvent, this.HaptikSDK$c, this.ICustomTabsCallback, true, this.invoke, this.getSignupData, this.HaptikWebView, this.aj$a, this.HaptikSDK$e, this.HaptikSDK$d);
    }
}
