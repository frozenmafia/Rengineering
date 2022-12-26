package o;

import java.io.File;
import o.ViewPropertyAnimatorCompat;
import o.y;
/* loaded from: classes3.dex */
public class zBy implements y.toString {
    private final values ag$a;
    private final long toString;

    /* loaded from: classes3.dex */
    public interface values {
        File ag$a();
    }

    public zBy(values valuesVar, long j) {
        this.toString = j;
        this.ag$a = valuesVar;
    }

    @Override // o.y.toString
    public y ah$a() {
        File ag$a = this.ag$a.ag$a();
        if (ag$a == null) {
            return null;
        }
        if (ag$a.isDirectory() || ag$a.mkdirs()) {
            return ViewPropertyAnimatorCompat.AnonymousClass1.ag$a(ag$a, this.toString);
        }
        return null;
    }
}
