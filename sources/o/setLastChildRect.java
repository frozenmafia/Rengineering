package o;

import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class setLastChildRect {
    private final ArrayList<verifyAnchorView> ag$a;
    private final String toString;

    public setLastChildRect(String str, ArrayList<verifyAnchorView> arrayList) {
        runAnimators.ag$a(str, "header");
        runAnimators.ag$a(arrayList, "settings");
        this.toString = str;
        this.ag$a = arrayList;
    }

    public final ArrayList<verifyAnchorView> ah$a() {
        return this.ag$a;
    }

    public final String valueOf() {
        return this.toString;
    }
}
