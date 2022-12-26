package o;
/* loaded from: classes5.dex */
public abstract class StatefulAdapter<Element, Collection, Builder> implements containsItem<Collection> {
    public /* synthetic */ StatefulAdapter(getTargetTypes gettargettypes) {
        this();
    }

    protected abstract int ag$a(Builder builder);

    protected abstract Builder ah$a();

    protected abstract void toString(mayHaveInterferingAnimations mayhaveinterferinganimations, int i, Builder builder, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Builder valueOf(Collection collection);

    protected abstract void valueOf(Builder builder, int i);

    protected abstract void valueOf(mayHaveInterferingAnimations mayhaveinterferinganimations, Builder builder, int i, int i2);

    protected abstract Collection values(Builder builder);

    private StatefulAdapter() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Collection valueOf(AnimateLayoutChangeDetector animateLayoutChangeDetector, Collection collection) {
        runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
        Object valueOf = collection == null ? null : valueOf(collection);
        if (valueOf == null) {
            valueOf = ah$a();
        }
        int ag$a = ag$a(valueOf);
        mayHaveInterferingAnimations valueOf2 = animateLayoutChangeDetector.valueOf(values());
        if (valueOf2.getSignupData()) {
            valueOf(valueOf2, valueOf, ag$a, ag$a(valueOf2, valueOf));
        } else {
            while (true) {
                int mayhaveinterferinganimations = valueOf2.toString(values());
                if (mayhaveinterferinganimations == -1) {
                    break;
                }
                ag$a(this, valueOf2, ag$a + mayhaveinterferinganimations, valueOf, false, 8, null);
            }
        }
        valueOf2.ah$a(values());
        return (Collection) values(valueOf);
    }

    @Override // o.scheduleGracePeriodEnd
    public Collection ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
        return valueOf(animateLayoutChangeDetector, (AnimateLayoutChangeDetector) null);
    }

    private final int ag$a(mayHaveInterferingAnimations mayhaveinterferinganimations, Builder builder) {
        int values = mayhaveinterferinganimations.values(values());
        valueOf((StatefulAdapter<Element, Collection, Builder>) builder, values);
        return values;
    }

    public static /* synthetic */ void ag$a(StatefulAdapter statefulAdapter, mayHaveInterferingAnimations mayhaveinterferinganimations, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        statefulAdapter.toString(mayhaveinterferinganimations, i, obj, z);
    }
}
