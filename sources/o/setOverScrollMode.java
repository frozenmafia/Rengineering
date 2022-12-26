package o;

import java.io.IOException;
import java.util.List;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public final class setOverScrollMode implements setBackgroundTintMode.toString {
    private String ag$a;
    private List<setOverScrollMode> ah$a;
    private String valueOf;
    private String values;

    public setOverScrollMode() {
        this(null, null, null, 7, null);
    }

    public setOverScrollMode(String str, String str2, String str3) {
        runAnimators.valueOf(str, "name");
        runAnimators.valueOf(str2, "version");
        runAnimators.valueOf(str3, "url");
        this.values = str;
        this.valueOf = str2;
        this.ag$a = str3;
        this.ah$a = reserveEndViewTransition.valueOf();
    }

    public final void valueOf(String str) {
        runAnimators.valueOf(str, "<set-?>");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }

    public final void toString(String str) {
        runAnimators.valueOf(str, "<set-?>");
        this.valueOf = str;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public /* synthetic */ setOverScrollMode(String str, String str2, String str3, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "Android Bugsnag Notifier" : str, (i & 2) != 0 ? "5.24.0" : str2, (i & 4) != 0 ? "https://bugsnag.com" : str3);
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final void ag$a(String str) {
        runAnimators.valueOf(str, "<set-?>");
        this.ag$a = str;
    }

    public final void ag$a(List<setOverScrollMode> list) {
        runAnimators.valueOf(list, "<set-?>");
        this.ah$a = list;
    }

    public final List<setOverScrollMode> ah$a() {
        return this.ah$a;
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        runAnimators.valueOf(setbackgroundtintmode, "writer");
        setbackgroundtintmode.values();
        setbackgroundtintmode.ag$a("name").valueOf(this.values);
        setbackgroundtintmode.ag$a("version").valueOf(this.valueOf);
        setbackgroundtintmode.ag$a("url").valueOf(this.ag$a);
        if (!this.ah$a.isEmpty()) {
            setbackgroundtintmode.ag$a("dependencies");
            setbackgroundtintmode.ah$a();
            for (setOverScrollMode setoverscrollmode : this.ah$a) {
                setbackgroundtintmode.ag$a(setoverscrollmode);
            }
            setbackgroundtintmode.valueOf();
        }
        setbackgroundtintmode.ag$a();
    }
}
