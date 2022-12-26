package o;

import java.io.Closeable;
/* loaded from: classes5.dex */
public final class setSlideEdge {
    public static final void values(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ChangeScroll.toString(th, th2);
            }
        }
    }
}
