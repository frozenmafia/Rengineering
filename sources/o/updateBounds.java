package o;

import com.app.dream11.model.NotificationCount;
import java.util.HashSet;
/* loaded from: classes3.dex */
public final /* synthetic */ class updateBounds implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ updateBounds valueOf = new updateBounds();

    private /* synthetic */ updateBounds() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return new NotificationCount((Long) obj);
    }

    /* renamed from: o.updateBounds$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class Cdefault {
        private static final HashSet<String> ag$a = new HashSet<>();
        private static String ah$a = "goog.exo.core";

        private Cdefault() {
        }

        public static String values() {
            String str;
            synchronized (Cdefault.class) {
                str = ah$a;
            }
            return str;
        }

        public static void valueOf(String str) {
            synchronized (Cdefault.class) {
                if (ag$a.add(str)) {
                    ah$a += ", " + str;
                }
            }
        }
    }
}
