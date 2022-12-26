package o;

import com.bugsnag.android.ErrorType;
import java.util.List;
import o.ViewCompat;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public final class performReceiveContent implements setBackgroundTintMode.toString {
    public static final performReceiveContent$ag$a values = new performReceiveContent$ag$a(null);
    private final List<ViewCompat.AnonymousClass3> ag$a;
    private ErrorType ah$a;
    private String toString;
    private String valueOf;

    public performReceiveContent(String str, String str2, ViewCompat.AnonymousClass2 anonymousClass2, ErrorType errorType) {
        runAnimators.valueOf(str, "errorClass");
        runAnimators.valueOf(anonymousClass2, "stacktrace");
        runAnimators.valueOf(errorType, "type");
        this.toString = str;
        this.valueOf = str2;
        this.ah$a = errorType;
        this.ag$a = anonymousClass2.values();
    }

    public final void valueOf(String str) {
        runAnimators.valueOf(str, "<set-?>");
        this.toString = str;
    }

    public final String values() {
        return this.toString;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    public final void ag$a(String str) {
        this.valueOf = str;
    }

    public /* synthetic */ performReceiveContent(String str, String str2, ViewCompat.AnonymousClass2 anonymousClass2, ErrorType errorType, int i, getTargetTypes gettargettypes) {
        this(str, str2, anonymousClass2, (i & 8) != 0 ? ErrorType.ANDROID : errorType);
    }

    public final ErrorType ah$a() {
        return this.ah$a;
    }

    public final void toString(ErrorType errorType) {
        runAnimators.valueOf(errorType, "<set-?>");
        this.ah$a = errorType;
    }

    public final List<ViewCompat.AnonymousClass3> valueOf() {
        return this.ag$a;
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) {
        runAnimators.valueOf(setbackgroundtintmode, "writer");
        setbackgroundtintmode.values();
        setbackgroundtintmode.ag$a("errorClass").valueOf(this.toString);
        setbackgroundtintmode.ag$a("message").valueOf(this.valueOf);
        setbackgroundtintmode.ag$a("type").valueOf(this.ah$a.getDesc$bugsnag_android_core_release());
        setbackgroundtintmode.ag$a("stacktrace").ag$a(this.ag$a);
        setbackgroundtintmode.ag$a();
    }
}
