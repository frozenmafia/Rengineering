package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class BannerUtmParams implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> utmCampaign;
    private final ComponentActivity.AnonymousClass5<String> utmContent;
    private final ComponentActivity.AnonymousClass5<String> utmMedium;
    private final ComponentActivity.AnonymousClass5<Integer> utmRef;
    private final ComponentActivity.AnonymousClass5<String> utmSource;
    private final ComponentActivity.AnonymousClass5<String> utmTerm;

    public BannerUtmParams() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BannerUtmParams copy$default(BannerUtmParams bannerUtmParams, ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, ComponentActivity.AnonymousClass5 anonymousClass56, int i, Object obj) {
        ComponentActivity.AnonymousClass5<String> anonymousClass57 = anonymousClass5;
        if ((i & 1) != 0) {
            anonymousClass57 = bannerUtmParams.utmSource;
        }
        ComponentActivity.AnonymousClass5<String> anonymousClass58 = anonymousClass52;
        if ((i & 2) != 0) {
            anonymousClass58 = bannerUtmParams.utmCampaign;
        }
        ComponentActivity.AnonymousClass5 anonymousClass59 = anonymousClass58;
        ComponentActivity.AnonymousClass5<String> anonymousClass510 = anonymousClass53;
        if ((i & 4) != 0) {
            anonymousClass510 = bannerUtmParams.utmTerm;
        }
        ComponentActivity.AnonymousClass5 anonymousClass511 = anonymousClass510;
        ComponentActivity.AnonymousClass5<String> anonymousClass512 = anonymousClass54;
        if ((i & 8) != 0) {
            anonymousClass512 = bannerUtmParams.utmMedium;
        }
        ComponentActivity.AnonymousClass5 anonymousClass513 = anonymousClass512;
        ComponentActivity.AnonymousClass5<Integer> anonymousClass514 = anonymousClass55;
        if ((i & 16) != 0) {
            anonymousClass514 = bannerUtmParams.utmRef;
        }
        ComponentActivity.AnonymousClass5 anonymousClass515 = anonymousClass514;
        ComponentActivity.AnonymousClass5<String> anonymousClass516 = anonymousClass56;
        if ((i & 32) != 0) {
            anonymousClass516 = bannerUtmParams.utmContent;
        }
        return bannerUtmParams.copy(anonymousClass57, anonymousClass59, anonymousClass511, anonymousClass513, anonymousClass515, anonymousClass516);
    }

    public final ComponentActivity.AnonymousClass5<String> component1() {
        return this.utmSource;
    }

    public final ComponentActivity.AnonymousClass5<String> component2() {
        return this.utmCampaign;
    }

    public final ComponentActivity.AnonymousClass5<String> component3() {
        return this.utmTerm;
    }

    public final ComponentActivity.AnonymousClass5<String> component4() {
        return this.utmMedium;
    }

    public final ComponentActivity.AnonymousClass5<Integer> component5() {
        return this.utmRef;
    }

    public final ComponentActivity.AnonymousClass5<String> component6() {
        return this.utmContent;
    }

    public final BannerUtmParams copy(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<Integer> anonymousClass55, ComponentActivity.AnonymousClass5<String> anonymousClass56) {
        runAnimators.ag$a(anonymousClass5, "utmSource");
        runAnimators.ag$a(anonymousClass52, "utmCampaign");
        runAnimators.ag$a(anonymousClass53, "utmTerm");
        runAnimators.ag$a(anonymousClass54, "utmMedium");
        runAnimators.ag$a(anonymousClass55, "utmRef");
        runAnimators.ag$a(anonymousClass56, "utmContent");
        return new BannerUtmParams(anonymousClass5, anonymousClass52, anonymousClass53, anonymousClass54, anonymousClass55, anonymousClass56);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BannerUtmParams) {
            BannerUtmParams bannerUtmParams = (BannerUtmParams) obj;
            return runAnimators.values(this.utmSource, bannerUtmParams.utmSource) && runAnimators.values(this.utmCampaign, bannerUtmParams.utmCampaign) && runAnimators.values(this.utmTerm, bannerUtmParams.utmTerm) && runAnimators.values(this.utmMedium, bannerUtmParams.utmMedium) && runAnimators.values(this.utmRef, bannerUtmParams.utmRef) && runAnimators.values(this.utmContent, bannerUtmParams.utmContent);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.utmSource.hashCode() * 31) + this.utmCampaign.hashCode()) * 31) + this.utmTerm.hashCode()) * 31) + this.utmMedium.hashCode()) * 31) + this.utmRef.hashCode()) * 31) + this.utmContent.hashCode();
    }

    public String toString() {
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.utmSource;
        ComponentActivity.AnonymousClass5<String> anonymousClass52 = this.utmCampaign;
        ComponentActivity.AnonymousClass5<String> anonymousClass53 = this.utmTerm;
        ComponentActivity.AnonymousClass5<String> anonymousClass54 = this.utmMedium;
        ComponentActivity.AnonymousClass5<Integer> anonymousClass55 = this.utmRef;
        ComponentActivity.AnonymousClass5<String> anonymousClass56 = this.utmContent;
        return "BannerUtmParams(utmSource=" + anonymousClass5 + ", utmCampaign=" + anonymousClass52 + ", utmTerm=" + anonymousClass53 + ", utmMedium=" + anonymousClass54 + ", utmRef=" + anonymousClass55 + ", utmContent=" + anonymousClass56 + ")";
    }

    public BannerUtmParams(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<Integer> anonymousClass55, ComponentActivity.AnonymousClass5<String> anonymousClass56) {
        runAnimators.ag$a(anonymousClass5, "utmSource");
        runAnimators.ag$a(anonymousClass52, "utmCampaign");
        runAnimators.ag$a(anonymousClass53, "utmTerm");
        runAnimators.ag$a(anonymousClass54, "utmMedium");
        runAnimators.ag$a(anonymousClass55, "utmRef");
        runAnimators.ag$a(anonymousClass56, "utmContent");
        this.utmSource = anonymousClass5;
        this.utmCampaign = anonymousClass52;
        this.utmTerm = anonymousClass53;
        this.utmMedium = anonymousClass54;
        this.utmRef = anonymousClass55;
        this.utmContent = anonymousClass56;
    }

    public /* synthetic */ BannerUtmParams(ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, ComponentActivity.AnonymousClass5 anonymousClass56, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass52, (i & 4) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass53, (i & 8) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass54, (i & 16) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass55, (i & 32) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass56);
    }

    public final ComponentActivity.AnonymousClass5<String> getUtmSource() {
        return this.utmSource;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtmCampaign() {
        return this.utmCampaign;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtmTerm() {
        return this.utmTerm;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtmMedium() {
        return this.utmMedium;
    }

    public final ComponentActivity.AnonymousClass5<Integer> getUtmRef() {
        return this.utmRef;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtmContent() {
        return this.utmContent;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.BannerUtmParams$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                if (BannerUtmParams.this.getUtmSource().valueOf) {
                    onBackPressedCallback.ah$a("utmSource", BannerUtmParams.this.getUtmSource().values);
                }
                if (BannerUtmParams.this.getUtmCampaign().valueOf) {
                    onBackPressedCallback.ah$a("utmCampaign", BannerUtmParams.this.getUtmCampaign().values);
                }
                if (BannerUtmParams.this.getUtmTerm().valueOf) {
                    onBackPressedCallback.ah$a("utmTerm", BannerUtmParams.this.getUtmTerm().values);
                }
                if (BannerUtmParams.this.getUtmMedium().valueOf) {
                    onBackPressedCallback.ah$a("utmMedium", BannerUtmParams.this.getUtmMedium().values);
                }
                if (BannerUtmParams.this.getUtmRef().valueOf) {
                    onBackPressedCallback.ag$a("utmRef", BannerUtmParams.this.getUtmRef().values);
                }
                if (BannerUtmParams.this.getUtmContent().valueOf) {
                    onBackPressedCallback.ah$a("utmContent", BannerUtmParams.this.getUtmContent().values);
                }
            }
        };
    }
}
