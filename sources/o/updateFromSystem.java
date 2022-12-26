package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* loaded from: classes3.dex */
public final class updateFromSystem {
    private final String ag$a;
    private final String ah$a;
    private final String valueOf;
    private final updateFromSystem$ag$a values;

    public updateFromSystem(String str, String str2, String str3, updateFromSystem$ag$a updatefromsystem_ag_a) {
        runAnimators.ag$a(str, "iconText");
        runAnimators.ag$a(str2, TtmlNode.TAG_BODY);
        runAnimators.ag$a(str3, "footer");
        runAnimators.ag$a(updatefromsystem_ag_a, "handler");
        this.ag$a = str;
        this.valueOf = str2;
        this.ah$a = str3;
        this.values = updatefromsystem_ag_a;
    }

    public final String values() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.valueOf;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final updateFromSystem$ag$a ag$a() {
        return this.values;
    }
}
