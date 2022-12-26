package o;

import o.RecyclerView;
import o.recordPreLayoutInformation;
/* loaded from: classes5.dex */
public class onAnimationStarted {
    private final recordPreLayoutInformation<Boolean> ag$a;
    private static final RecyclerView.ItemAnimator.ItemAnimatorListener<Boolean> ah$a = new RecyclerView.ItemAnimator.ItemAnimatorListener<Boolean>() { // from class: o.onAnimationStarted.2
        @Override // o.RecyclerView.ItemAnimator.ItemAnimatorListener
        /* renamed from: toString */
        public boolean values(Boolean bool) {
            return !bool.booleanValue();
        }
    };
    private static final RecyclerView.ItemAnimator.ItemAnimatorListener<Boolean> values = new RecyclerView.ItemAnimator.ItemAnimatorListener<Boolean>() { // from class: o.onAnimationStarted.5
        @Override // o.RecyclerView.ItemAnimator.ItemAnimatorListener
        /* renamed from: valueOf */
        public boolean values(Boolean bool) {
            return bool.booleanValue();
        }
    };
    private static final recordPreLayoutInformation<Boolean> toString = new recordPreLayoutInformation<>(true);
    private static final recordPreLayoutInformation<Boolean> valueOf = new recordPreLayoutInformation<>(false);

    public onAnimationStarted() {
        this.ag$a = recordPreLayoutInformation.valueOf();
    }

    private onAnimationStarted(recordPreLayoutInformation<Boolean> recordprelayoutinformation) {
        this.ag$a = recordprelayoutinformation;
    }

    public boolean valueOf() {
        return this.ag$a.valueOf(values);
    }

    public boolean ah$a(bindViewHolder bindviewholder) {
        Boolean values2 = this.ag$a.values(bindviewholder);
        return values2 != null && values2.booleanValue();
    }

    public boolean ag$a(bindViewHolder bindviewholder) {
        Boolean values2 = this.ag$a.values(bindviewholder);
        return (values2 == null || values2.booleanValue()) ? false : true;
    }

    public onAnimationStarted valueOf(detachViewAt detachviewat) {
        bindViewHolder bindviewholder;
        recordPreLayoutInformation<Boolean> ag$a = this.ag$a.ag$a(detachviewat);
        if (ag$a == null) {
            ag$a = new recordPreLayoutInformation<>(this.ag$a.ag$a());
        } else if (ag$a.ag$a() == null && this.ag$a.ag$a() != null) {
            bindviewholder = bindViewHolder.toString;
            ag$a = ag$a.ah$a(bindviewholder, this.ag$a.ag$a());
        }
        return new onAnimationStarted(ag$a);
    }

    public <T> T valueOf(T t, final recordPreLayoutInformation.values<Void, T> valuesVar) {
        return (T) this.ag$a.toString((recordPreLayoutInformation<Boolean>) t, new recordPreLayoutInformation.values<Boolean, T>() { // from class: o.onAnimationStarted.1
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // o.recordPreLayoutInformation.values
            /* renamed from: valueOf */
            public T ah$a(bindViewHolder bindviewholder, Boolean bool, T t2) {
                return !bool.booleanValue() ? valuesVar.ah$a(bindviewholder, null, t2) : t2;
            }
        });
    }

    public onAnimationStarted values(bindViewHolder bindviewholder) {
        if (this.ag$a.values(bindviewholder, ah$a) == null) {
            return this.ag$a.values(bindviewholder, values) != null ? this : new onAnimationStarted(this.ag$a.valueOf(bindviewholder, toString));
        }
        throw new IllegalArgumentException("Can't prune path that was kept previously!");
    }

    public onAnimationStarted valueOf(bindViewHolder bindviewholder) {
        return this.ag$a.values(bindviewholder, ah$a) != null ? this : new onAnimationStarted(this.ag$a.valueOf(bindviewholder, valueOf));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onAnimationStarted) && this.ag$a.equals(((onAnimationStarted) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "{PruneForest:" + this.ag$a.toString() + "}";
    }
}
