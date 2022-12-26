package o;

import o.RecyclerView;
/* loaded from: classes5.dex */
public class detachViewAt implements Comparable<detachViewAt> {
    private final String values;
    private static final detachViewAt toString = new detachViewAt("[MIN_KEY]");
    private static final detachViewAt ag$a = new detachViewAt("[MAX_KEY]");
    private static final detachViewAt valueOf = new detachViewAt(".priority");
    private static final detachViewAt ah$a = new detachViewAt(".info");

    protected int HaptikSDK$a() {
        return 0;
    }

    protected boolean ah$b() {
        return false;
    }

    public static detachViewAt values() {
        return valueOf;
    }

    private detachViewAt(String str) {
        this.values = str;
    }

    public String valueOf() {
        return this.values;
    }

    public boolean HaptikSDK$b() {
        return equals(valueOf);
    }

    @Override // java.lang.Comparable
    /* renamed from: toString */
    public int compareTo(detachViewAt detachviewat) {
        detachViewAt detachviewat2;
        if (this == detachviewat) {
            return 0;
        }
        detachViewAt detachviewat3 = toString;
        if (this == detachviewat3 || detachviewat == (detachviewat2 = ag$a)) {
            return -1;
        }
        if (detachviewat == detachviewat3 || this == detachviewat2) {
            return 1;
        }
        if (ah$b()) {
            if (detachviewat.ah$b()) {
                int valueOf2 = RecyclerView.ItemAnimator.AdapterChanges.valueOf(HaptikSDK$a(), detachviewat.HaptikSDK$a());
                return valueOf2 == 0 ? RecyclerView.ItemAnimator.AdapterChanges.valueOf(this.values.length(), detachviewat.values.length()) : valueOf2;
            }
            return -1;
        } else if (detachviewat.ah$b()) {
            return 1;
        } else {
            return this.values.compareTo(detachviewat.values);
        }
    }

    public String toString() {
        return "ChildKey(\"" + this.values + "\")";
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof detachViewAt) {
            if (this == obj) {
                return true;
            }
            return this.values.equals(((detachViewAt) obj).values);
        }
        return false;
    }

    public static detachViewAt values(String str) {
        Integer values = RecyclerView.ItemAnimator.AdapterChanges.values(str);
        if (values != null) {
            return new toString(str, values.intValue());
        }
        if (str.equals(".priority")) {
            return valueOf;
        }
        RecyclerView.ItemAnimator.AdapterChanges.ah$a(!str.contains("/"));
        return new detachViewAt(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class toString extends detachViewAt {
        private final int ag$a;

        @Override // o.detachViewAt
        protected boolean ah$b() {
            return true;
        }

        @Override // o.detachViewAt, java.lang.Comparable
        public /* synthetic */ int compareTo(detachViewAt detachviewat) {
            return super.compareTo(detachviewat);
        }

        toString(String str, int i) {
            super(str);
            this.ag$a = i;
        }

        @Override // o.detachViewAt
        protected int HaptikSDK$a() {
            return this.ag$a;
        }

        @Override // o.detachViewAt
        public String toString() {
            return "IntegerChildName(\"" + ((detachViewAt) this).values + "\")";
        }
    }
}
