package o;
/* loaded from: classes4.dex */
public final class PropertyChangeRegistry {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PropertyChangeRegistry) && this.ag$a == ((PropertyChangeRegistry) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Has_Picture_Boolean_(value=" + this.ag$a + ')';
    }

    public PropertyChangeRegistry(boolean z) {
        this.ag$a = z;
    }

    public final boolean ah$a() {
        return this.ag$a;
    }

    /* renamed from: o.PropertyChangeRegistry$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnonymousClass1) && runAnimators.values((Object) this.values, (Object) ((AnonymousClass1) obj).values);
        }

        public int hashCode() {
            return this.values.hashCode();
        }

        public String toString() {
            return "_Group_leaderboard_status_String(value=" + this.values + ')';
        }

        public AnonymousClass1(String str) {
            runAnimators.ag$a(str, "value");
            this.values = str;
        }

        public final String values() {
            return this.values;
        }
    }
}
