package o;

import java.io.File;
import o.Styleable;
import o.ViewCompat;
/* loaded from: classes3.dex */
public final class setKeyboardNavigationCluster implements Styleable.ArcMotion<postOnAnimation> {
    private final File ah$a;
    private postOnAnimation toString;
    private final String valueOf;
    private final setImportantForAccessibility values;

    public setKeyboardNavigationCluster(File file, String str, setImportantForAccessibility setimportantforaccessibility) {
        runAnimators.valueOf(file, "eventFile");
        runAnimators.valueOf(str, "apiKey");
        runAnimators.valueOf(setimportantforaccessibility, "logger");
        this.ah$a = file;
        this.valueOf = str;
        this.values = setimportantforaccessibility;
    }

    public final postOnAnimation ah$a() {
        return this.toString;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: valueOf */
    public postOnAnimation invoke() {
        postOnAnimation postonanimation = this.toString;
        if (postonanimation == null) {
            postOnAnimation values = values();
            this.toString = values;
            return values;
        }
        return postonanimation;
    }

    public final void ag$a() {
        this.toString = null;
    }

    private final postOnAnimation values() {
        return new postOnAnimation(new getOverScrollMode(this.values).values(ViewCompat.Api19Impl.ag$a.valueOf(this.ah$a), this.valueOf), this.values);
    }
}
