package o;

import java.util.ArrayList;
import java.util.List;
import o.viewModels;
/* loaded from: classes.dex */
public abstract class onSkipToPrevious<K, A> {
    private final valueOf<K> HaptikSDK$b;
    protected access$001<A> valueOf;
    final List<onSkipToPrevious$ag$a> ag$a = new ArrayList(1);
    private boolean ah$b = false;
    protected float ah$a = 0.0f;
    private A values = null;
    private float HaptikSDK$a = -1.0f;
    private float toString = -1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface valueOf<T> {
        float ag$a();

        boolean ah$a();

        boolean toString(float f);

        viewModels.Cdefault<T> valueOf();

        float values();

        boolean values(float f);
    }

    abstract A valueOf(viewModels.Cdefault<K> cdefault, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public onSkipToPrevious(List<? extends viewModels.Cdefault<K>> list) {
        this.HaptikSDK$b = valueOf(list);
    }

    public void invoke() {
        this.ah$b = true;
    }

    public void toString(onSkipToPrevious$ag$a onskiptoprevious_ag_a) {
        this.ag$a.add(onskiptoprevious_ag_a);
    }

    public void valueOf(float f) {
        if (this.HaptikSDK$b.ah$a()) {
            return;
        }
        if (f < HaptikSDK$b()) {
            f = HaptikSDK$b();
        } else if (f > valueOf()) {
            f = valueOf();
        }
        if (f == this.ah$a) {
            return;
        }
        this.ah$a = f;
        if (this.HaptikSDK$b.toString(f)) {
            HaptikSDK$c();
        }
    }

    public void HaptikSDK$c() {
        for (int i = 0; i < this.ag$a.size(); i++) {
            this.ag$a.get(i).ah$a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public viewModels.Cdefault<K> values() {
        skipToNext.values("BaseKeyframeAnimation#getCurrentKeyframe");
        viewModels.Cdefault<K> valueOf2 = this.HaptikSDK$b.valueOf();
        skipToNext.ag$a("BaseKeyframeAnimation#getCurrentKeyframe");
        return valueOf2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float ag$a() {
        if (this.ah$b) {
            return 0.0f;
        }
        viewModels.Cdefault<K> values2 = values();
        if (values2.HaptikSDK$a()) {
            return 0.0f;
        }
        return (this.ah$a - values2.HaptikSDK$b()) / (values2.ah$a() - values2.HaptikSDK$b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float ah$a() {
        viewModels.Cdefault<K> values2 = values();
        if (values2 == null || values2.HaptikSDK$a()) {
            return 0.0f;
        }
        return values2.toString.getInterpolation(ag$a());
    }

    private float HaptikSDK$b() {
        if (this.HaptikSDK$a == -1.0f) {
            this.HaptikSDK$a = this.HaptikSDK$b.ag$a();
        }
        return this.HaptikSDK$a;
    }

    float valueOf() {
        if (this.toString == -1.0f) {
            this.toString = this.HaptikSDK$b.values();
        }
        return this.toString;
    }

    public A HaptikSDK$a() {
        A valueOf2;
        float ag$a = ag$a();
        if (this.valueOf == null && this.HaptikSDK$b.values(ag$a)) {
            return this.values;
        }
        viewModels.Cdefault<K> values2 = values();
        if (values2.ah$b != null && values2.invoke != null) {
            valueOf2 = valueOf(values2, ag$a, values2.ah$b.getInterpolation(ag$a), values2.invoke.getInterpolation(ag$a));
        } else {
            valueOf2 = valueOf(values2, ah$a());
        }
        this.values = valueOf2;
        return valueOf2;
    }

    public float ah$b() {
        return this.ah$a;
    }

    public void toString(access$001<A> access_001) {
        access$001<A> access_0012 = this.valueOf;
        if (access_0012 != null) {
            access_0012.ag$a(null);
        }
        this.valueOf = access_001;
        if (access_001 != null) {
            access_001.ag$a(this);
        }
    }

    protected A valueOf(viewModels.Cdefault<K> cdefault, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> valueOf<T> valueOf(final List<? extends viewModels.Cdefault<T>> list) {
        if (list.isEmpty()) {
            return new toString();
        }
        if (list.size() == 1) {
            return new values(list);
        }
        return new valueOf<T>(list) { // from class: o.onSkipToPrevious$ah$a
            private final List<? extends viewModels.Cdefault<T>> ag$a;
            private viewModels.Cdefault<T> ah$a = null;
            private float toString = -1.0f;
            private viewModels.Cdefault<T> valueOf = ag$a(0.0f);

            @Override // o.onSkipToPrevious.valueOf
            public boolean ah$a() {
                return false;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ag$a = list;
            }

            @Override // o.onSkipToPrevious.valueOf
            public boolean toString(float f) {
                if (this.valueOf.toString(f)) {
                    return !this.valueOf.HaptikSDK$a();
                }
                this.valueOf = ag$a(f);
                return true;
            }

            private viewModels.Cdefault<T> ag$a(float f) {
                List<? extends viewModels.Cdefault<T>> list2 = this.ag$a;
                viewModels.Cdefault<T> cdefault = list2.get(list2.size() - 1);
                if (f >= cdefault.HaptikSDK$b()) {
                    return cdefault;
                }
                for (int size = this.ag$a.size() - 2; size >= 1; size--) {
                    viewModels.Cdefault<T> cdefault2 = this.ag$a.get(size);
                    if (this.valueOf != cdefault2 && cdefault2.toString(f)) {
                        return cdefault2;
                    }
                }
                return this.ag$a.get(0);
            }

            @Override // o.onSkipToPrevious.valueOf
            public viewModels.Cdefault<T> valueOf() {
                return this.valueOf;
            }

            @Override // o.onSkipToPrevious.valueOf
            public float ag$a() {
                return this.ag$a.get(0).HaptikSDK$b();
            }

            @Override // o.onSkipToPrevious.valueOf
            public float values() {
                List<? extends viewModels.Cdefault<T>> list2 = this.ag$a;
                return list2.get(list2.size() - 1).ah$a();
            }

            @Override // o.onSkipToPrevious.valueOf
            public boolean values(float f) {
                viewModels.Cdefault<T> cdefault = this.ah$a;
                viewModels.Cdefault<T> cdefault2 = this.valueOf;
                if (cdefault == cdefault2 && this.toString == f) {
                    return true;
                }
                this.ah$a = cdefault2;
                this.toString = f;
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class toString<T> implements valueOf<T> {
        @Override // o.onSkipToPrevious.valueOf
        public float ag$a() {
            return 0.0f;
        }

        @Override // o.onSkipToPrevious.valueOf
        public boolean ah$a() {
            return true;
        }

        @Override // o.onSkipToPrevious.valueOf
        public boolean toString(float f) {
            return false;
        }

        @Override // o.onSkipToPrevious.valueOf
        public float values() {
            return 1.0f;
        }

        private toString() {
        }

        @Override // o.onSkipToPrevious.valueOf
        public viewModels.Cdefault<T> valueOf() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o.onSkipToPrevious.valueOf
        public boolean values(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class values<T> implements valueOf<T> {
        private final viewModels.Cdefault<T> ah$a;
        private float toString = -1.0f;

        @Override // o.onSkipToPrevious.valueOf
        public boolean ah$a() {
            return false;
        }

        values(List<? extends viewModels.Cdefault<T>> list) {
            this.ah$a = list.get(0);
        }

        @Override // o.onSkipToPrevious.valueOf
        public boolean toString(float f) {
            return !this.ah$a.HaptikSDK$a();
        }

        @Override // o.onSkipToPrevious.valueOf
        public viewModels.Cdefault<T> valueOf() {
            return this.ah$a;
        }

        @Override // o.onSkipToPrevious.valueOf
        public float ag$a() {
            return this.ah$a.HaptikSDK$b();
        }

        @Override // o.onSkipToPrevious.valueOf
        public float values() {
            return this.ah$a.ah$a();
        }

        @Override // o.onSkipToPrevious.valueOf
        public boolean values(float f) {
            if (this.toString == f) {
                return true;
            }
            this.toString = f;
            return false;
        }
    }
}
