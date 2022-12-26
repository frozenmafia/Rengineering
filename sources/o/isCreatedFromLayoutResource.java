package o;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
/* loaded from: classes5.dex */
public final class isCreatedFromLayoutResource {
    public static final StackTraceElement ah$a(BaseContinuationImpl baseContinuationImpl) {
        String str;
        runAnimators.ag$a(baseContinuationImpl, "<this>");
        enter iscreatedfromlayoutresource = toString(baseContinuationImpl);
        if (iscreatedfromlayoutresource == null) {
            return null;
        }
        ag$a(1, iscreatedfromlayoutresource.HaptikSDK$a());
        int ag$a = ag$a(baseContinuationImpl);
        int i = ag$a < 0 ? -1 : iscreatedfromlayoutresource.ag$a()[ag$a];
        String ah$a = getSceneRoot.valueOf.ah$a(baseContinuationImpl);
        if (ah$a == null) {
            str = iscreatedfromlayoutresource.valueOf();
        } else {
            str = ah$a + '/' + iscreatedfromlayoutresource.valueOf();
        }
        return new StackTraceElement(str, iscreatedfromlayoutresource.ah$a(), iscreatedfromlayoutresource.values(), i);
    }

    private static final enter toString(BaseContinuationImpl baseContinuationImpl) {
        return (enter) baseContinuationImpl.getClass().getAnnotation(enter.class);
    }

    private static final int ag$a(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (-1) + (num != null ? num.intValue() : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    private static final void ag$a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }
}
