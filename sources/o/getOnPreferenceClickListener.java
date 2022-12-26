package o;

import o.getOnPreferenceClickListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class getOnPreferenceClickListener {
    static final getOnPreferenceClickListener ah$a = HaptikSDK$a().valueOf(10485760).ah$a(200).values(10000).ah$a(604800000L).ag$a(81920).valueOf();

    /* loaded from: classes7.dex */
    static abstract class toString {
        abstract toString ag$a(int i);

        abstract toString ah$a(int i);

        abstract toString ah$a(long j);

        abstract toString valueOf(long j);

        abstract getOnPreferenceClickListener valueOf();

        abstract toString values(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long HaptikSDK$c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long ag$a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int ah$a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int valueOf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int values();

    static toString HaptikSDK$a() {
        return new toString() { // from class: o.getOnPreferenceChangeListener$ah$a
            private Integer ag$a;
            private Long ah$a;
            private Long toString;
            private Integer valueOf;
            private Integer values;

            @Override // o.getOnPreferenceClickListener.toString
            getOnPreferenceClickListener.toString valueOf(long j) {
                this.toString = Long.valueOf(j);
                return this;
            }

            @Override // o.getOnPreferenceClickListener.toString
            getOnPreferenceClickListener.toString ah$a(int i) {
                this.values = Integer.valueOf(i);
                return this;
            }

            @Override // o.getOnPreferenceClickListener.toString
            getOnPreferenceClickListener.toString values(int i) {
                this.ag$a = Integer.valueOf(i);
                return this;
            }

            @Override // o.getOnPreferenceClickListener.toString
            getOnPreferenceClickListener.toString ah$a(long j) {
                this.ah$a = Long.valueOf(j);
                return this;
            }

            @Override // o.getOnPreferenceClickListener.toString
            getOnPreferenceClickListener.toString ag$a(int i) {
                this.valueOf = Integer.valueOf(i);
                return this;
            }

            @Override // o.getOnPreferenceClickListener.toString
            getOnPreferenceClickListener valueOf() {
                String str = "";
                if (this.toString == null) {
                    str = " maxStorageSizeInBytes";
                }
                if (this.values == null) {
                    str = str + " loadBatchSize";
                }
                if (this.ag$a == null) {
                    str = str + " criticalSectionEnterTimeoutMs";
                }
                if (this.ah$a == null) {
                    str = str + " eventCleanUpAge";
                }
                if (this.valueOf == null) {
                    str = str + " maxBlobByteSizePerRow";
                }
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:" + str);
                }
                return new getOnPreferenceChangeListener(this.toString.longValue(), this.values.intValue(), this.ag$a.intValue(), this.ah$a.longValue(), this.valueOf.intValue());
            }
        };
    }
}
