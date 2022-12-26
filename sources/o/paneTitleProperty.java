package o;

import com.bugsnag.android.ErrorType;
import java.io.IOException;
import java.util.List;
import o.ViewCompat;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public class paneTitleProperty implements setBackgroundTintMode.toString {
    private final setImportantForAccessibility ag$a;
    private final performReceiveContent ah$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public paneTitleProperty(performReceiveContent performreceivecontent, setImportantForAccessibility setimportantforaccessibility) {
        this.ah$a = performreceivecontent;
        this.ag$a = setimportantforaccessibility;
    }

    private void toString(String str) {
        setImportantForAccessibility setimportantforaccessibility = this.ag$a;
        setimportantforaccessibility.ag$a("Invalid null value supplied to error." + str + ", ignoring");
    }

    public void values(String str) {
        if (str != null) {
            this.ah$a.valueOf(str);
        } else {
            toString("errorClass");
        }
    }

    public String ah$a() {
        return this.ah$a.values();
    }

    public void ah$a(String str) {
        this.ah$a.ag$a(str);
    }

    public String values() {
        return this.ah$a.ag$a();
    }

    public void valueOf(ErrorType errorType) {
        if (errorType != null) {
            this.ah$a.toString(errorType);
        } else {
            toString("type");
        }
    }

    public ErrorType ag$a() {
        return this.ah$a.ah$a();
    }

    public List<ViewCompat.AnonymousClass3> valueOf() {
        return this.ah$a.valueOf();
    }

    @Override // o.setBackgroundTintMode.toString
    public void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException {
        this.ah$a.toStream(setbackgroundtintmode);
    }
}
