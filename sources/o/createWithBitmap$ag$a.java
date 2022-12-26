package o;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.UUID;
/* loaded from: classes3.dex */
public final class createWithBitmap$ag$a {
    public final UUID HaptikSDK$a;
    @Deprecated
    public final ImmutableMap<String, String> HaptikSDK$b;
    public final boolean HaptikSDK$c;
    private final byte[] HaptikWebView;
    public final boolean ag$a;
    public final boolean ah$a;
    @Deprecated
    public final ImmutableList<Integer> ah$b;
    @Deprecated
    public final UUID invoke;
    public final Uri toString;
    public final ImmutableMap<String, String> valueOf;
    public final ImmutableList<Integer> values;

    /* loaded from: classes3.dex */
    public static final class values {
        private UUID HaptikSDK$a;
        private ImmutableList<Integer> ag$a;
        private boolean ah$a;
        private boolean ah$b;
        private boolean invoke;
        private Uri toString;
        private byte[] valueOf;
        private ImmutableMap<String, String> values;

        public static /* synthetic */ Uri ag$a(values valuesVar) {
            return valuesVar.toString;
        }

        public static /* synthetic */ UUID invoke(values valuesVar) {
            return valuesVar.HaptikSDK$a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Deprecated
        public values() {
            this.values = ImmutableMap.of();
            this.ag$a = ImmutableList.of();
        }

        private values(createWithBitmap$ag$a createwithbitmap_ag_a) {
            this.HaptikSDK$a = createwithbitmap_ag_a.HaptikSDK$a;
            this.toString = createwithbitmap_ag_a.toString;
            this.values = createwithbitmap_ag_a.valueOf;
            this.invoke = createwithbitmap_ag_a.ag$a;
            this.ah$b = createwithbitmap_ag_a.HaptikSDK$c;
            this.ah$a = createwithbitmap_ag_a.ah$a;
            this.ag$a = createwithbitmap_ag_a.values;
            this.valueOf = createwithbitmap_ag_a.HaptikWebView;
        }

        public createWithBitmap$ag$a values() {
            return new createWithBitmap$ag$a(this);
        }
    }

    private createWithBitmap$ag$a(values valuesVar) {
        FingerprintManagerCompat.ah$a((valuesVar.ah$a && valuesVar.toString == null) ? false : true);
        UUID uuid = (UUID) FingerprintManagerCompat.toString(valuesVar.HaptikSDK$a);
        this.HaptikSDK$a = uuid;
        this.invoke = uuid;
        this.toString = valuesVar.toString;
        this.HaptikSDK$b = valuesVar.values;
        this.valueOf = valuesVar.values;
        this.ag$a = valuesVar.invoke;
        this.ah$a = valuesVar.ah$a;
        this.HaptikSDK$c = valuesVar.ah$b;
        this.ah$b = valuesVar.ag$a;
        this.values = valuesVar.ag$a;
        this.HaptikWebView = valuesVar.valueOf != null ? Arrays.copyOf(valuesVar.valueOf, valuesVar.valueOf.length) : null;
    }

    public byte[] valueOf() {
        byte[] bArr = this.HaptikWebView;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public values ag$a() {
        return new values();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof createWithBitmap$ag$a) {
            createWithBitmap$ag$a createwithbitmap_ag_a = (createWithBitmap$ag$a) obj;
            return this.HaptikSDK$a.equals(createwithbitmap_ag_a.HaptikSDK$a) && getElevationDegrees.values(this.toString, createwithbitmap_ag_a.toString) && getElevationDegrees.values(this.valueOf, createwithbitmap_ag_a.valueOf) && this.ag$a == createwithbitmap_ag_a.ag$a && this.ah$a == createwithbitmap_ag_a.ah$a && this.HaptikSDK$c == createwithbitmap_ag_a.HaptikSDK$c && this.values.equals(createwithbitmap_ag_a.values) && Arrays.equals(this.HaptikWebView, createwithbitmap_ag_a.HaptikWebView);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.HaptikSDK$a.hashCode();
        Uri uri = this.toString;
        int hashCode2 = uri != null ? uri.hashCode() : 0;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + this.valueOf.hashCode()) * 31) + (this.ag$a ? 1 : 0)) * 31) + (this.ah$a ? 1 : 0)) * 31) + (this.HaptikSDK$c ? 1 : 0)) * 31) + this.values.hashCode()) * 31) + Arrays.hashCode(this.HaptikWebView);
    }
}
