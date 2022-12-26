package o;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* loaded from: classes5.dex */
public final class setScrollingCacheEnabled {
    private static final boolean ag$a = true;

    public static final drawPath valueOf(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return valueOf(th, mainDispatcherFactory.hintOnError());
        }
    }

    public static final boolean ah$a(drawPath drawpath) {
        return drawpath.valueOf() instanceof addNewItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ addNewItem toString(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return valueOf(th, str);
    }

    private static final addNewItem valueOf(Throwable th, String str) {
        if (ag$a) {
            return new addNewItem(th, str);
        }
        if (th != null) {
            throw th;
        }
        values();
        throw new KotlinNothingValueException();
    }

    public static final Void values() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
