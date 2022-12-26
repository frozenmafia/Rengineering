package o;
/* loaded from: classes7.dex */
final class getOnPreferenceChangeListener extends getOnPreferenceClickListener {
    private final long ag$a;
    private final long invoke;
    private final int toString;
    private final int valueOf;
    private final int values;

    private getOnPreferenceChangeListener(long j, int i, int i2, long j2, int i3) {
        this.invoke = j;
        this.valueOf = i;
        this.toString = i2;
        this.ag$a = j2;
        this.values = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOnPreferenceClickListener
    public long HaptikSDK$c() {
        return this.invoke;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOnPreferenceClickListener
    public int ah$a() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOnPreferenceClickListener
    public int valueOf() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOnPreferenceClickListener
    public long ag$a() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOnPreferenceClickListener
    public int values() {
        return this.values;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.invoke + ", loadBatchSize=" + this.valueOf + ", criticalSectionEnterTimeoutMs=" + this.toString + ", eventCleanUpAge=" + this.ag$a + ", maxBlobByteSizePerRow=" + this.values + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getOnPreferenceClickListener) {
            getOnPreferenceClickListener getonpreferenceclicklistener = (getOnPreferenceClickListener) obj;
            return this.invoke == getonpreferenceclicklistener.HaptikSDK$c() && this.valueOf == getonpreferenceclicklistener.ah$a() && this.toString == getonpreferenceclicklistener.valueOf() && this.ag$a == getonpreferenceclicklistener.ag$a() && this.values == getonpreferenceclicklistener.values();
        }
        return false;
    }

    public int hashCode() {
        long j = this.invoke;
        int i = (int) (j ^ (j >>> 32));
        int i2 = this.valueOf;
        int i3 = this.toString;
        long j2 = this.ag$a;
        return ((((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.values;
    }
}
