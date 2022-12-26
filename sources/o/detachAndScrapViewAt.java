package o;

import com.google.firebase.database.logging.Logger;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes5.dex */
public class detachAndScrapViewAt implements com.google.firebase.database.logging.Logger {
    private final Set<String> ah$a;
    private final Logger.Level valueOf;

    public detachAndScrapViewAt(Logger.Level level, List<String> list) {
        if (list != null) {
            this.ah$a = new HashSet(list);
        } else {
            this.ah$a = null;
        }
        this.valueOf = level;
    }

    @Override // com.google.firebase.database.logging.Logger
    public Logger.Level valueOf() {
        return this.valueOf;
    }

    @Override // com.google.firebase.database.logging.Logger
    public void valueOf(Logger.Level level, String str, String str2, long j) {
        if (ag$a(level, str)) {
            String ag$a = ag$a(level, str, str2, j);
            int i = AnonymousClass3.toString[level.ordinal()];
            if (i == 1) {
                valueOf(str, ag$a);
            } else if (i == 2) {
                toString(str, ag$a);
            } else if (i == 3) {
                ag$a(str, ag$a);
            } else if (i == 4) {
                values(str, ag$a);
            } else {
                throw new RuntimeException("Should not reach here!");
            }
        }
    }

    /* renamed from: o.detachAndScrapViewAt$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            toString = iArr;
            try {
                iArr[Logger.Level.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[Logger.Level.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[Logger.Level.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                toString[Logger.Level.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected String ag$a(Logger.Level level, String str, String str2, long j) {
        Date date = new Date(j);
        return date.toString() + " [" + level + "] " + str + ": " + str2;
    }

    protected void valueOf(String str, String str2) {
        System.err.println(str2);
    }

    protected void toString(String str, String str2) {
        System.out.println(str2);
    }

    protected void ag$a(String str, String str2) {
        System.out.println(str2);
    }

    protected void values(String str, String str2) {
        System.out.println(str2);
    }

    protected boolean ag$a(Logger.Level level, String str) {
        return level.ordinal() >= this.valueOf.ordinal() && (this.ah$a == null || level.ordinal() > Logger.Level.DEBUG.ordinal() || this.ah$a.contains(str));
    }
}
