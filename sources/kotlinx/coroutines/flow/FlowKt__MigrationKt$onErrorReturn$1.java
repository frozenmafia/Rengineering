package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes7.dex */
public final class FlowKt__MigrationKt$onErrorReturn$1 extends Lambda implements Styleable.ChangeBounds<Throwable, Boolean> {
    public static final FlowKt__MigrationKt$onErrorReturn$1 INSTANCE = new FlowKt__MigrationKt$onErrorReturn$1();

    FlowKt__MigrationKt$onErrorReturn$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(Throwable th) {
        return true;
    }
}
