package arrow.typeclasses;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onQueueChanged;
/* loaded from: classes6.dex */
public final class ContinuationUtilsKt$completionField$2 extends Lambda implements Styleable.ArcMotion<Field> {
    public static final ContinuationUtilsKt$completionField$2 INSTANCE = new ContinuationUtilsKt$completionField$2();

    ContinuationUtilsKt$completionField$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final Field invoke() {
        Class ah$a;
        ah$a = onQueueChanged.ah$a();
        Field declaredField = ah$a.getDeclaredField("completion");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
