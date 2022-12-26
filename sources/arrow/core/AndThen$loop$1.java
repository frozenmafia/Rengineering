package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onPostMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AndThen$loop$1 extends Lambda implements Styleable.ChangeBounds<onPostMessage<Object, Object>, onPostMessage.values<Object, Object, Object>> {
    final /* synthetic */ Object $current;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndThen$loop$1(Object obj) {
        super(1);
        this.$current = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.AndThen$loop$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<Object, Object> {
        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final Object invoke(Object obj) {
            return AndThen$loop$1.this.$current;
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final onPostMessage.values<Object, Object, Object> invoke(onPostMessage<Object, Object> onpostmessage) {
        runAnimators.valueOf(onpostmessage, "it");
        return new onPostMessage.values<>(onPostMessage.ag$a.values(new AnonymousClass1()), onpostmessage);
    }
}
