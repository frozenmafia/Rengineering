package o;
/* loaded from: classes5.dex */
public final class setTransforms implements Comparable<setTransforms> {
    private final int ag$a;
    private final int ah$a;
    private final int ah$b;
    private final int valueOf;
    public static final values values = new values(null);
    public static final setTransforms toString = setMatricesForParent.ah$a();

    public setTransforms(int i, int i2, int i3) {
        this.valueOf = i;
        this.ah$a = i2;
        this.ag$a = i3;
        this.ah$b = ah$a(i, i2, i3);
    }

    private final int ah$a(int i, int i2, int i3) {
        boolean z = false;
        if (new TransitionPropagation(0, 255).toString(i) && new TransitionPropagation(0, 255).toString(i2) && new TransitionPropagation(0, 255).toString(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.valueOf);
        sb.append('.');
        sb.append(this.ah$a);
        sb.append('.');
        sb.append(this.ag$a);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        setTransforms settransforms = obj instanceof setTransforms ? (setTransforms) obj : null;
        return settransforms != null && this.ah$b == settransforms.ah$b;
    }

    public int hashCode() {
        return this.ah$b;
    }

    @Override // java.lang.Comparable
    /* renamed from: toString */
    public int compareTo(setTransforms settransforms) {
        runAnimators.ag$a(settransforms, "other");
        return this.ah$b - settransforms.ah$b;
    }

    /* loaded from: classes5.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
