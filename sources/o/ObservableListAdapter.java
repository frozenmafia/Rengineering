package o;
/* loaded from: classes4.dex */
public final class ObservableListAdapter {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableListAdapter) && this.toString == ((ObservableListAdapter) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Recent_searches_shown_Int(value=" + this.toString + ')';
    }

    /* renamed from: o.ObservableListAdapter$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final int valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && this.valueOf == ((AnonymousClass1) obj).valueOf;
        }

        public int hashCode() {
            return this.valueOf;
        }

        public String toString() {
            return "_Reaction_Count_Int_(value=" + this.valueOf + ')';
        }

        public AnonymousClass1(int i) {
            this.valueOf = i;
        }

        public final int ah$a() {
            return this.valueOf;
        }
    }

    public ObservableListAdapter(int i) {
        this.toString = i;
    }

    public final int ag$a() {
        return this.toString;
    }
}
