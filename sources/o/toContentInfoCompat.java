package o;

import android.net.Uri;
import com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData;
import com.appsamurai.storyly.exoplayer2.common.offline.StreamKey;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class toContentInfoCompat extends getSource {
    public static final toContentInfoCompat toString = new toContentInfoCompat("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final Map<String, String> HaptikSDK$a;
    public final List<values> HaptikSDK$b;
    public final List<toContentInfoCompat$ah$a> HaptikSDK$c;
    public final List<toContentInfoCompat$ah$a> HaptikSDK$e;
    public final createFromIcon ag$a;
    public final List<toContentInfoCompat$ah$a> ah$a;
    public final List<createFromIcon> ah$b;
    public final List<DrmInitData> invoke;
    public final List<Uri> valueOf;
    public final List<toContentInfoCompat$ah$a> values;

    /* loaded from: classes3.dex */
    public static final class values {
        public final String HaptikSDK$c;
        public final String ag$a;
        public final createFromIcon ah$a;
        public final String toString;
        public final Uri valueOf;
        public final String values;

        public values(Uri uri, createFromIcon createfromicon, String str, String str2, String str3, String str4) {
            this.valueOf = uri;
            this.ah$a = createfromicon;
            this.HaptikSDK$c = str;
            this.values = str2;
            this.toString = str3;
            this.ag$a = str4;
        }

        public static values ag$a(Uri uri) {
            return new values(uri, new createFromIcon$ag$a().ah$a(SessionDescription.SUPPORTED_SDP_VERSION).valueOf(MimeTypes.APPLICATION_M3U8).valueOf(), null, null, null, null);
        }

        public values ag$a(createFromIcon createfromicon) {
            return new values(this.valueOf, createfromicon, this.HaptikSDK$c, this.values, this.toString, this.ag$a);
        }
    }

    public toContentInfoCompat(String str, List<String> list, List<values> list2, List<toContentInfoCompat$ah$a> list3, List<toContentInfoCompat$ah$a> list4, List<toContentInfoCompat$ah$a> list5, List<toContentInfoCompat$ah$a> list6, createFromIcon createfromicon, List<createFromIcon> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        this.valueOf = Collections.unmodifiableList(valueOf(list2, list3, list4, list5, list6));
        this.HaptikSDK$b = Collections.unmodifiableList(list2);
        this.HaptikSDK$e = Collections.unmodifiableList(list3);
        this.ah$a = Collections.unmodifiableList(list4);
        this.HaptikSDK$c = Collections.unmodifiableList(list5);
        this.values = Collections.unmodifiableList(list6);
        this.ag$a = createfromicon;
        this.ah$b = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.HaptikSDK$a = Collections.unmodifiableMap(map);
        this.invoke = Collections.unmodifiableList(list8);
    }

    @Override // o.ParcelableCompatCreatorCallbacks
    /* renamed from: ag$a */
    public toContentInfoCompat toString(List<StreamKey> list) {
        return new toContentInfoCompat(this.isLogoutPending, this.ak$a, ag$a(this.HaptikSDK$b, 0, list), Collections.emptyList(), ag$a(this.ah$a, 1, list), ag$a(this.HaptikSDK$c, 2, list), Collections.emptyList(), this.ag$a, this.ah$b, this.ICustomTabsCallback, this.HaptikSDK$a, this.invoke);
    }

    public static toContentInfoCompat toString(String str) {
        return new toContentInfoCompat("", Collections.emptyList(), Collections.singletonList(values.ag$a(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> valueOf(List<values> list, List<toContentInfoCompat$ah$a> list2, List<toContentInfoCompat$ah$a> list3, List<toContentInfoCompat$ah$a> list4, List<toContentInfoCompat$ah$a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).valueOf;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        toString(list2, arrayList);
        toString(list3, arrayList);
        toString(list4, arrayList);
        toString(list5, arrayList);
        return arrayList;
    }

    private static void toString(List<toContentInfoCompat$ah$a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).valueOf;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> ag$a(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    StreamKey streamKey = list2.get(i3);
                    if (streamKey.values == i && streamKey.toString == i2) {
                        arrayList.add(t);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }
}
