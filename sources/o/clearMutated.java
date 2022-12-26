package o;
/* loaded from: classes2.dex */
public final class clearMutated {
    private final valueOf ag$a;
    private final int ah$a;
    private final requestWindowFeature toString;
    private final String valueOf;
    private final String values;

    /* loaded from: classes2.dex */
    public interface valueOf {
        void values(clearMutated clearmutated);
    }

    public clearMutated(int i, requestWindowFeature requestwindowfeature, int i2, valueOf valueof) {
        String str;
        String str2;
        runAnimators.ag$a(requestwindowfeature, "sectionItem");
        runAnimators.ag$a(valueof, "handler");
        this.ah$a = i;
        this.toString = requestwindowfeature;
        this.ag$a = valueof;
        if (i2 != requestwindowfeature.valueOf().getId()) {
            str = requestwindowfeature.valueOf().getName();
        } else {
            str = "<b>" + requestwindowfeature.valueOf().getName() + "</b>";
        }
        this.valueOf = str;
        if (i2 != requestwindowfeature.valueOf().getId()) {
            str2 = values();
        } else {
            str2 = "<b>" + values() + "</b>";
        }
        this.values = str2;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final void HaptikSDK$a() {
        this.ag$a.values(this);
    }

    public final String ah$a() {
        return this.values;
    }

    public final String values() {
        return String.valueOf(this.toString.valueOf().getTotalContestCount());
    }
}
