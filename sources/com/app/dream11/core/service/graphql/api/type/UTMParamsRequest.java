package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class UTMParamsRequest implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> ccode;
    private final ComponentActivity.AnonymousClass5<String> fb_source;
    private final ComponentActivity.AnonymousClass5<String> gclid;
    private final ComponentActivity.AnonymousClass5<String> invited_by;
    private final ComponentActivity.AnonymousClass5<String> referral;
    private final ComponentActivity.AnonymousClass5<String> refsite;
    private final ComponentActivity.AnonymousClass5<String> utm_appstore;
    private final ComponentActivity.AnonymousClass5<String> utm_campaign;
    private final ComponentActivity.AnonymousClass5<String> utm_content;
    private final ComponentActivity.AnonymousClass5<String> utm_medium;
    private final ComponentActivity.AnonymousClass5<String> utm_ref;
    private final ComponentActivity.AnonymousClass5<String> utm_retarget;
    private final ComponentActivity.AnonymousClass5<String> utm_retarget_content;
    private final ComponentActivity.AnonymousClass5<String> utm_source;
    private final ComponentActivity.AnonymousClass5<String> utm_term;
    private final ComponentActivity.AnonymousClass5<String> vserv;

    public UTMParamsRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final ComponentActivity.AnonymousClass5<String> component1() {
        return this.utm_source;
    }

    public final ComponentActivity.AnonymousClass5<String> component10() {
        return this.invited_by;
    }

    public final ComponentActivity.AnonymousClass5<String> component11() {
        return this.referral;
    }

    public final ComponentActivity.AnonymousClass5<String> component12() {
        return this.ccode;
    }

    public final ComponentActivity.AnonymousClass5<String> component13() {
        return this.vserv;
    }

    public final ComponentActivity.AnonymousClass5<String> component14() {
        return this.utm_retarget;
    }

    public final ComponentActivity.AnonymousClass5<String> component15() {
        return this.utm_retarget_content;
    }

    public final ComponentActivity.AnonymousClass5<String> component16() {
        return this.utm_appstore;
    }

    public final ComponentActivity.AnonymousClass5<String> component2() {
        return this.utm_medium;
    }

    public final ComponentActivity.AnonymousClass5<String> component3() {
        return this.utm_term;
    }

    public final ComponentActivity.AnonymousClass5<String> component4() {
        return this.utm_content;
    }

    public final ComponentActivity.AnonymousClass5<String> component5() {
        return this.utm_campaign;
    }

    public final ComponentActivity.AnonymousClass5<String> component6() {
        return this.fb_source;
    }

    public final ComponentActivity.AnonymousClass5<String> component7() {
        return this.utm_ref;
    }

    public final ComponentActivity.AnonymousClass5<String> component8() {
        return this.refsite;
    }

    public final ComponentActivity.AnonymousClass5<String> component9() {
        return this.gclid;
    }

    public final UTMParamsRequest copy(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<String> anonymousClass55, ComponentActivity.AnonymousClass5<String> anonymousClass56, ComponentActivity.AnonymousClass5<String> anonymousClass57, ComponentActivity.AnonymousClass5<String> anonymousClass58, ComponentActivity.AnonymousClass5<String> anonymousClass59, ComponentActivity.AnonymousClass5<String> anonymousClass510, ComponentActivity.AnonymousClass5<String> anonymousClass511, ComponentActivity.AnonymousClass5<String> anonymousClass512, ComponentActivity.AnonymousClass5<String> anonymousClass513, ComponentActivity.AnonymousClass5<String> anonymousClass514, ComponentActivity.AnonymousClass5<String> anonymousClass515, ComponentActivity.AnonymousClass5<String> anonymousClass516) {
        runAnimators.ag$a(anonymousClass5, "utm_source");
        runAnimators.ag$a(anonymousClass52, "utm_medium");
        runAnimators.ag$a(anonymousClass53, "utm_term");
        runAnimators.ag$a(anonymousClass54, "utm_content");
        runAnimators.ag$a(anonymousClass55, "utm_campaign");
        runAnimators.ag$a(anonymousClass56, "fb_source");
        runAnimators.ag$a(anonymousClass57, "utm_ref");
        runAnimators.ag$a(anonymousClass58, "refsite");
        runAnimators.ag$a(anonymousClass59, "gclid");
        runAnimators.ag$a(anonymousClass510, "invited_by");
        runAnimators.ag$a(anonymousClass511, "referral");
        runAnimators.ag$a(anonymousClass512, "ccode");
        runAnimators.ag$a(anonymousClass513, "vserv");
        runAnimators.ag$a(anonymousClass514, "utm_retarget");
        runAnimators.ag$a(anonymousClass515, "utm_retarget_content");
        runAnimators.ag$a(anonymousClass516, "utm_appstore");
        return new UTMParamsRequest(anonymousClass5, anonymousClass52, anonymousClass53, anonymousClass54, anonymousClass55, anonymousClass56, anonymousClass57, anonymousClass58, anonymousClass59, anonymousClass510, anonymousClass511, anonymousClass512, anonymousClass513, anonymousClass514, anonymousClass515, anonymousClass516);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UTMParamsRequest) {
            UTMParamsRequest uTMParamsRequest = (UTMParamsRequest) obj;
            return runAnimators.values(this.utm_source, uTMParamsRequest.utm_source) && runAnimators.values(this.utm_medium, uTMParamsRequest.utm_medium) && runAnimators.values(this.utm_term, uTMParamsRequest.utm_term) && runAnimators.values(this.utm_content, uTMParamsRequest.utm_content) && runAnimators.values(this.utm_campaign, uTMParamsRequest.utm_campaign) && runAnimators.values(this.fb_source, uTMParamsRequest.fb_source) && runAnimators.values(this.utm_ref, uTMParamsRequest.utm_ref) && runAnimators.values(this.refsite, uTMParamsRequest.refsite) && runAnimators.values(this.gclid, uTMParamsRequest.gclid) && runAnimators.values(this.invited_by, uTMParamsRequest.invited_by) && runAnimators.values(this.referral, uTMParamsRequest.referral) && runAnimators.values(this.ccode, uTMParamsRequest.ccode) && runAnimators.values(this.vserv, uTMParamsRequest.vserv) && runAnimators.values(this.utm_retarget, uTMParamsRequest.utm_retarget) && runAnimators.values(this.utm_retarget_content, uTMParamsRequest.utm_retarget_content) && runAnimators.values(this.utm_appstore, uTMParamsRequest.utm_appstore);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.utm_source.hashCode() * 31) + this.utm_medium.hashCode()) * 31) + this.utm_term.hashCode()) * 31) + this.utm_content.hashCode()) * 31) + this.utm_campaign.hashCode()) * 31) + this.fb_source.hashCode()) * 31) + this.utm_ref.hashCode()) * 31) + this.refsite.hashCode()) * 31) + this.gclid.hashCode()) * 31) + this.invited_by.hashCode()) * 31) + this.referral.hashCode()) * 31) + this.ccode.hashCode()) * 31) + this.vserv.hashCode()) * 31) + this.utm_retarget.hashCode()) * 31) + this.utm_retarget_content.hashCode()) * 31) + this.utm_appstore.hashCode();
    }

    public String toString() {
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.utm_source;
        ComponentActivity.AnonymousClass5<String> anonymousClass52 = this.utm_medium;
        ComponentActivity.AnonymousClass5<String> anonymousClass53 = this.utm_term;
        ComponentActivity.AnonymousClass5<String> anonymousClass54 = this.utm_content;
        ComponentActivity.AnonymousClass5<String> anonymousClass55 = this.utm_campaign;
        ComponentActivity.AnonymousClass5<String> anonymousClass56 = this.fb_source;
        ComponentActivity.AnonymousClass5<String> anonymousClass57 = this.utm_ref;
        ComponentActivity.AnonymousClass5<String> anonymousClass58 = this.refsite;
        ComponentActivity.AnonymousClass5<String> anonymousClass59 = this.gclid;
        ComponentActivity.AnonymousClass5<String> anonymousClass510 = this.invited_by;
        ComponentActivity.AnonymousClass5<String> anonymousClass511 = this.referral;
        ComponentActivity.AnonymousClass5<String> anonymousClass512 = this.ccode;
        ComponentActivity.AnonymousClass5<String> anonymousClass513 = this.vserv;
        ComponentActivity.AnonymousClass5<String> anonymousClass514 = this.utm_retarget;
        ComponentActivity.AnonymousClass5<String> anonymousClass515 = this.utm_retarget_content;
        ComponentActivity.AnonymousClass5<String> anonymousClass516 = this.utm_appstore;
        return "UTMParamsRequest(utm_source=" + anonymousClass5 + ", utm_medium=" + anonymousClass52 + ", utm_term=" + anonymousClass53 + ", utm_content=" + anonymousClass54 + ", utm_campaign=" + anonymousClass55 + ", fb_source=" + anonymousClass56 + ", utm_ref=" + anonymousClass57 + ", refsite=" + anonymousClass58 + ", gclid=" + anonymousClass59 + ", invited_by=" + anonymousClass510 + ", referral=" + anonymousClass511 + ", ccode=" + anonymousClass512 + ", vserv=" + anonymousClass513 + ", utm_retarget=" + anonymousClass514 + ", utm_retarget_content=" + anonymousClass515 + ", utm_appstore=" + anonymousClass516 + ")";
    }

    public UTMParamsRequest(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<String> anonymousClass55, ComponentActivity.AnonymousClass5<String> anonymousClass56, ComponentActivity.AnonymousClass5<String> anonymousClass57, ComponentActivity.AnonymousClass5<String> anonymousClass58, ComponentActivity.AnonymousClass5<String> anonymousClass59, ComponentActivity.AnonymousClass5<String> anonymousClass510, ComponentActivity.AnonymousClass5<String> anonymousClass511, ComponentActivity.AnonymousClass5<String> anonymousClass512, ComponentActivity.AnonymousClass5<String> anonymousClass513, ComponentActivity.AnonymousClass5<String> anonymousClass514, ComponentActivity.AnonymousClass5<String> anonymousClass515, ComponentActivity.AnonymousClass5<String> anonymousClass516) {
        runAnimators.ag$a(anonymousClass5, "utm_source");
        runAnimators.ag$a(anonymousClass52, "utm_medium");
        runAnimators.ag$a(anonymousClass53, "utm_term");
        runAnimators.ag$a(anonymousClass54, "utm_content");
        runAnimators.ag$a(anonymousClass55, "utm_campaign");
        runAnimators.ag$a(anonymousClass56, "fb_source");
        runAnimators.ag$a(anonymousClass57, "utm_ref");
        runAnimators.ag$a(anonymousClass58, "refsite");
        runAnimators.ag$a(anonymousClass59, "gclid");
        runAnimators.ag$a(anonymousClass510, "invited_by");
        runAnimators.ag$a(anonymousClass511, "referral");
        runAnimators.ag$a(anonymousClass512, "ccode");
        runAnimators.ag$a(anonymousClass513, "vserv");
        runAnimators.ag$a(anonymousClass514, "utm_retarget");
        runAnimators.ag$a(anonymousClass515, "utm_retarget_content");
        runAnimators.ag$a(anonymousClass516, "utm_appstore");
        this.utm_source = anonymousClass5;
        this.utm_medium = anonymousClass52;
        this.utm_term = anonymousClass53;
        this.utm_content = anonymousClass54;
        this.utm_campaign = anonymousClass55;
        this.fb_source = anonymousClass56;
        this.utm_ref = anonymousClass57;
        this.refsite = anonymousClass58;
        this.gclid = anonymousClass59;
        this.invited_by = anonymousClass510;
        this.referral = anonymousClass511;
        this.ccode = anonymousClass512;
        this.vserv = anonymousClass513;
        this.utm_retarget = anonymousClass514;
        this.utm_retarget_content = anonymousClass515;
        this.utm_appstore = anonymousClass516;
    }

    public /* synthetic */ UTMParamsRequest(ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, ComponentActivity.AnonymousClass5 anonymousClass56, ComponentActivity.AnonymousClass5 anonymousClass57, ComponentActivity.AnonymousClass5 anonymousClass58, ComponentActivity.AnonymousClass5 anonymousClass59, ComponentActivity.AnonymousClass5 anonymousClass510, ComponentActivity.AnonymousClass5 anonymousClass511, ComponentActivity.AnonymousClass5 anonymousClass512, ComponentActivity.AnonymousClass5 anonymousClass513, ComponentActivity.AnonymousClass5 anonymousClass514, ComponentActivity.AnonymousClass5 anonymousClass515, ComponentActivity.AnonymousClass5 anonymousClass516, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass52, (i & 4) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass53, (i & 8) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass54, (i & 16) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass55, (i & 32) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass56, (i & 64) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass57, (i & 128) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass58, (i & 256) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass59, (i & 512) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass510, (i & 1024) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass511, (i & 2048) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass512, (i & 4096) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass513, (i & 8192) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass514, (i & 16384) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass515, (i & 32768) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass516);
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_source() {
        return this.utm_source;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_medium() {
        return this.utm_medium;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_term() {
        return this.utm_term;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_content() {
        return this.utm_content;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_campaign() {
        return this.utm_campaign;
    }

    public final ComponentActivity.AnonymousClass5<String> getFb_source() {
        return this.fb_source;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_ref() {
        return this.utm_ref;
    }

    public final ComponentActivity.AnonymousClass5<String> getRefsite() {
        return this.refsite;
    }

    public final ComponentActivity.AnonymousClass5<String> getGclid() {
        return this.gclid;
    }

    public final ComponentActivity.AnonymousClass5<String> getInvited_by() {
        return this.invited_by;
    }

    public final ComponentActivity.AnonymousClass5<String> getReferral() {
        return this.referral;
    }

    public final ComponentActivity.AnonymousClass5<String> getCcode() {
        return this.ccode;
    }

    public final ComponentActivity.AnonymousClass5<String> getVserv() {
        return this.vserv;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_retarget() {
        return this.utm_retarget;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_retarget_content() {
        return this.utm_retarget_content;
    }

    public final ComponentActivity.AnonymousClass5<String> getUtm_appstore() {
        return this.utm_appstore;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.UTMParamsRequest$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                if (UTMParamsRequest.this.getUtm_source().valueOf) {
                    onBackPressedCallback.ah$a("utm_source", UTMParamsRequest.this.getUtm_source().values);
                }
                if (UTMParamsRequest.this.getUtm_medium().valueOf) {
                    onBackPressedCallback.ah$a("utm_medium", UTMParamsRequest.this.getUtm_medium().values);
                }
                if (UTMParamsRequest.this.getUtm_term().valueOf) {
                    onBackPressedCallback.ah$a("utm_term", UTMParamsRequest.this.getUtm_term().values);
                }
                if (UTMParamsRequest.this.getUtm_content().valueOf) {
                    onBackPressedCallback.ah$a("utm_content", UTMParamsRequest.this.getUtm_content().values);
                }
                if (UTMParamsRequest.this.getUtm_campaign().valueOf) {
                    onBackPressedCallback.ah$a("utm_campaign", UTMParamsRequest.this.getUtm_campaign().values);
                }
                if (UTMParamsRequest.this.getFb_source().valueOf) {
                    onBackPressedCallback.ah$a("fb_source", UTMParamsRequest.this.getFb_source().values);
                }
                if (UTMParamsRequest.this.getUtm_ref().valueOf) {
                    onBackPressedCallback.ah$a("utm_ref", UTMParamsRequest.this.getUtm_ref().values);
                }
                if (UTMParamsRequest.this.getRefsite().valueOf) {
                    onBackPressedCallback.ah$a("refsite", UTMParamsRequest.this.getRefsite().values);
                }
                if (UTMParamsRequest.this.getGclid().valueOf) {
                    onBackPressedCallback.ah$a("gclid", UTMParamsRequest.this.getGclid().values);
                }
                if (UTMParamsRequest.this.getInvited_by().valueOf) {
                    onBackPressedCallback.ah$a("invited_by", UTMParamsRequest.this.getInvited_by().values);
                }
                if (UTMParamsRequest.this.getReferral().valueOf) {
                    onBackPressedCallback.ah$a("referral", UTMParamsRequest.this.getReferral().values);
                }
                if (UTMParamsRequest.this.getCcode().valueOf) {
                    onBackPressedCallback.ah$a("ccode", UTMParamsRequest.this.getCcode().values);
                }
                if (UTMParamsRequest.this.getVserv().valueOf) {
                    onBackPressedCallback.ah$a("vserv", UTMParamsRequest.this.getVserv().values);
                }
                if (UTMParamsRequest.this.getUtm_retarget().valueOf) {
                    onBackPressedCallback.ah$a("utm_retarget", UTMParamsRequest.this.getUtm_retarget().values);
                }
                if (UTMParamsRequest.this.getUtm_retarget_content().valueOf) {
                    onBackPressedCallback.ah$a("utm_retarget_content", UTMParamsRequest.this.getUtm_retarget_content().values);
                }
                if (UTMParamsRequest.this.getUtm_appstore().valueOf) {
                    onBackPressedCallback.ah$a("utm_appstore", UTMParamsRequest.this.getUtm_appstore().values);
                }
            }
        };
    }
}
