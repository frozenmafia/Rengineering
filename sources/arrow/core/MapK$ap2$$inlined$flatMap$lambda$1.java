package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.AudioAttributesImplApi21Parcelizer;
import o.Styleable;
import o.Transition;
import o.cancel;
import o.requestPostMessageChannelWithExtras;
import o.updateVisuals;
/* loaded from: classes6.dex */
public final class MapK$ap2$$inlined$flatMap$lambda$1 extends Lambda implements Styleable.ChangeBounds<A, requestPostMessageChannelWithExtras<K, ? extends Z>> {
    final /* synthetic */ Transition $f;
    final /* synthetic */ requestPostMessageChannelWithExtras $fb$inlined;
    final /* synthetic */ Object $k;
    final /* synthetic */ requestPostMessageChannelWithExtras this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapK$ap2$$inlined$flatMap$lambda$1(Object obj, Transition transition, requestPostMessageChannelWithExtras requestpostmessagechannelwithextras, requestPostMessageChannelWithExtras requestpostmessagechannelwithextras2) {
        super(1);
        this.$k = obj;
        this.$f = transition;
        this.this$0 = requestpostmessagechannelwithextras;
        this.$fb$inlined = requestpostmessagechannelwithextras2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: arrow.core.MapK$ap2$$inlined$flatMap$lambda$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<B, requestPostMessageChannelWithExtras<K, ? extends Z>> {
        final /* synthetic */ Object $a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj) {
            super(1);
            this.$a = obj;
        }

        @Override // o.Styleable.ChangeBounds
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }

        @Override // o.Styleable.ChangeBounds
        public final requestPostMessageChannelWithExtras<K, Z> invoke(B b2) {
            return updateVisuals.values(AudioAttributesImplApi21Parcelizer.values(new cancel(MapK$ap2$$inlined$flatMap$lambda$1.this.$k, MapK$ap2$$inlined$flatMap$lambda$1.this.$f.invoke(this.$a, b2))));
        }
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((MapK$ap2$$inlined$flatMap$lambda$1) obj);
    }

    @Override // o.Styleable.ChangeBounds
    public final requestPostMessageChannelWithExtras<K, Z> invoke(A a) {
        return this.$fb$inlined.ah$a(new AnonymousClass1(a));
    }
}
