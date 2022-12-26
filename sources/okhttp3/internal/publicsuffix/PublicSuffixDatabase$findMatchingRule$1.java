package okhttp3.internal.publicsuffix;

import kotlin.jvm.internal.MutablePropertyReference0Impl;
/* loaded from: classes8.dex */
final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends MutablePropertyReference0Impl {
    PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, o.createFrom
    public Object get() {
        return PublicSuffixDatabase.toString((PublicSuffixDatabase) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((PublicSuffixDatabase) this.receiver).HaptikSDK$c = (byte[]) obj;
    }
}
