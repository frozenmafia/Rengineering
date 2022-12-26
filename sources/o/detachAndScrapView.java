package o;

import com.google.firebase.database.logging.Logger;
import java.io.PrintWriter;
import java.io.StringWriter;
/* loaded from: classes5.dex */
public class detachAndScrapView {
    private final com.google.firebase.database.logging.Logger ag$a;
    private final String ah$a;
    private final String toString;

    private static String valueOf(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public detachAndScrapView(com.google.firebase.database.logging.Logger logger, String str) {
        this(logger, str, null);
    }

    public detachAndScrapView(com.google.firebase.database.logging.Logger logger, String str, String str2) {
        this.ag$a = logger;
        this.ah$a = str;
        this.toString = str2;
    }

    public void toString(String str, Throwable th) {
        this.ag$a.valueOf(Logger.Level.ERROR, this.ah$a, ag$a(str, new Object[0]) + "\n" + valueOf(th), values());
    }

    public void ah$a(String str) {
        ah$a(str, null);
    }

    public void ah$a(String str, Throwable th) {
        String ag$a = ag$a(str, new Object[0]);
        if (th != null) {
            ag$a = ag$a + "\n" + valueOf(th);
        }
        this.ag$a.valueOf(Logger.Level.WARN, this.ah$a, ag$a, values());
    }

    public void ag$a(String str) {
        this.ag$a.valueOf(Logger.Level.INFO, this.ah$a, ag$a(str, new Object[0]), values());
    }

    public void toString(String str, Object... objArr) {
        ag$a(str, null, objArr);
    }

    public boolean ah$a() {
        return this.ag$a.valueOf().ordinal() <= Logger.Level.DEBUG.ordinal();
    }

    public void ag$a(String str, Throwable th, Object... objArr) {
        if (ah$a()) {
            String ag$a = ag$a(str, objArr);
            if (th != null) {
                ag$a = ag$a + "\n" + valueOf(th);
            }
            this.ag$a.valueOf(Logger.Level.DEBUG, this.ah$a, ag$a, values());
        }
    }

    private long values() {
        return System.currentTimeMillis();
    }

    private String ag$a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (this.toString == null) {
            return str;
        }
        return this.toString + " - " + str;
    }
}
