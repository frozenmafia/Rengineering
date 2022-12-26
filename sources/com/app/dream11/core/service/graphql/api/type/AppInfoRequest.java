package com.app.dream11.core.service.graphql.api.type;

import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getTargetTypes;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class AppInfoRequest implements ComponentActivity.AnonymousClass6 {
    private final ComponentActivity.AnonymousClass5<String> appId;
    private final ComponentActivity.AnonymousClass5<String> appsFlyerChannelName;
    private final ComponentActivity.AnonymousClass5<String> appsFlyerId;
    private final ComponentActivity.AnonymousClass5<String> device;
    private final ComponentActivity.AnonymousClass5<String> deviceIMEI;
    private final ComponentActivity.AnonymousClass5<String> deviceId;
    private final ComponentActivity.AnonymousClass5<String> deviceMAC;
    private final ComponentActivity.AnonymousClass5<Boolean> isFromLogin;
    private final ComponentActivity.AnonymousClass5<Integer> rooted;
    private final ComponentActivity.AnonymousClass5<String> segmentAnonymousId;
    private final ComponentActivity.AnonymousClass5<String> signedAttestation;

    public AppInfoRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppInfoRequest copy$default(AppInfoRequest appInfoRequest, ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, ComponentActivity.AnonymousClass5 anonymousClass56, ComponentActivity.AnonymousClass5 anonymousClass57, ComponentActivity.AnonymousClass5 anonymousClass58, ComponentActivity.AnonymousClass5 anonymousClass59, ComponentActivity.AnonymousClass5 anonymousClass510, ComponentActivity.AnonymousClass5 anonymousClass511, int i, Object obj) {
        return appInfoRequest.copy((i & 1) != 0 ? appInfoRequest.appId : anonymousClass5, (i & 2) != 0 ? appInfoRequest.appsFlyerChannelName : anonymousClass52, (i & 4) != 0 ? appInfoRequest.appsFlyerId : anonymousClass53, (i & 8) != 0 ? appInfoRequest.device : anonymousClass54, (i & 16) != 0 ? appInfoRequest.deviceId : anonymousClass55, (i & 32) != 0 ? appInfoRequest.deviceIMEI : anonymousClass56, (i & 64) != 0 ? appInfoRequest.deviceMAC : anonymousClass57, (i & 128) != 0 ? appInfoRequest.isFromLogin : anonymousClass58, (i & 256) != 0 ? appInfoRequest.rooted : anonymousClass59, (i & 512) != 0 ? appInfoRequest.segmentAnonymousId : anonymousClass510, (i & 1024) != 0 ? appInfoRequest.signedAttestation : anonymousClass511);
    }

    public final ComponentActivity.AnonymousClass5<String> component1() {
        return this.appId;
    }

    public final ComponentActivity.AnonymousClass5<String> component10() {
        return this.segmentAnonymousId;
    }

    public final ComponentActivity.AnonymousClass5<String> component11() {
        return this.signedAttestation;
    }

    public final ComponentActivity.AnonymousClass5<String> component2() {
        return this.appsFlyerChannelName;
    }

    public final ComponentActivity.AnonymousClass5<String> component3() {
        return this.appsFlyerId;
    }

    public final ComponentActivity.AnonymousClass5<String> component4() {
        return this.device;
    }

    public final ComponentActivity.AnonymousClass5<String> component5() {
        return this.deviceId;
    }

    public final ComponentActivity.AnonymousClass5<String> component6() {
        return this.deviceIMEI;
    }

    public final ComponentActivity.AnonymousClass5<String> component7() {
        return this.deviceMAC;
    }

    public final ComponentActivity.AnonymousClass5<Boolean> component8() {
        return this.isFromLogin;
    }

    public final ComponentActivity.AnonymousClass5<Integer> component9() {
        return this.rooted;
    }

    public final AppInfoRequest copy(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<String> anonymousClass55, ComponentActivity.AnonymousClass5<String> anonymousClass56, ComponentActivity.AnonymousClass5<String> anonymousClass57, ComponentActivity.AnonymousClass5<Boolean> anonymousClass58, ComponentActivity.AnonymousClass5<Integer> anonymousClass59, ComponentActivity.AnonymousClass5<String> anonymousClass510, ComponentActivity.AnonymousClass5<String> anonymousClass511) {
        runAnimators.ag$a(anonymousClass5, "appId");
        runAnimators.ag$a(anonymousClass52, "appsFlyerChannelName");
        runAnimators.ag$a(anonymousClass53, "appsFlyerId");
        runAnimators.ag$a(anonymousClass54, "device");
        runAnimators.ag$a(anonymousClass55, "deviceId");
        runAnimators.ag$a(anonymousClass56, "deviceIMEI");
        runAnimators.ag$a(anonymousClass57, "deviceMAC");
        runAnimators.ag$a(anonymousClass58, "isFromLogin");
        runAnimators.ag$a(anonymousClass59, "rooted");
        runAnimators.ag$a(anonymousClass510, "segmentAnonymousId");
        runAnimators.ag$a(anonymousClass511, "signedAttestation");
        return new AppInfoRequest(anonymousClass5, anonymousClass52, anonymousClass53, anonymousClass54, anonymousClass55, anonymousClass56, anonymousClass57, anonymousClass58, anonymousClass59, anonymousClass510, anonymousClass511);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppInfoRequest) {
            AppInfoRequest appInfoRequest = (AppInfoRequest) obj;
            return runAnimators.values(this.appId, appInfoRequest.appId) && runAnimators.values(this.appsFlyerChannelName, appInfoRequest.appsFlyerChannelName) && runAnimators.values(this.appsFlyerId, appInfoRequest.appsFlyerId) && runAnimators.values(this.device, appInfoRequest.device) && runAnimators.values(this.deviceId, appInfoRequest.deviceId) && runAnimators.values(this.deviceIMEI, appInfoRequest.deviceIMEI) && runAnimators.values(this.deviceMAC, appInfoRequest.deviceMAC) && runAnimators.values(this.isFromLogin, appInfoRequest.isFromLogin) && runAnimators.values(this.rooted, appInfoRequest.rooted) && runAnimators.values(this.segmentAnonymousId, appInfoRequest.segmentAnonymousId) && runAnimators.values(this.signedAttestation, appInfoRequest.signedAttestation);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((this.appId.hashCode() * 31) + this.appsFlyerChannelName.hashCode()) * 31) + this.appsFlyerId.hashCode()) * 31) + this.device.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceIMEI.hashCode()) * 31) + this.deviceMAC.hashCode()) * 31) + this.isFromLogin.hashCode()) * 31) + this.rooted.hashCode()) * 31) + this.segmentAnonymousId.hashCode()) * 31) + this.signedAttestation.hashCode();
    }

    public String toString() {
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.appId;
        ComponentActivity.AnonymousClass5<String> anonymousClass52 = this.appsFlyerChannelName;
        ComponentActivity.AnonymousClass5<String> anonymousClass53 = this.appsFlyerId;
        ComponentActivity.AnonymousClass5<String> anonymousClass54 = this.device;
        ComponentActivity.AnonymousClass5<String> anonymousClass55 = this.deviceId;
        ComponentActivity.AnonymousClass5<String> anonymousClass56 = this.deviceIMEI;
        ComponentActivity.AnonymousClass5<String> anonymousClass57 = this.deviceMAC;
        ComponentActivity.AnonymousClass5<Boolean> anonymousClass58 = this.isFromLogin;
        ComponentActivity.AnonymousClass5<Integer> anonymousClass59 = this.rooted;
        ComponentActivity.AnonymousClass5<String> anonymousClass510 = this.segmentAnonymousId;
        ComponentActivity.AnonymousClass5<String> anonymousClass511 = this.signedAttestation;
        return "AppInfoRequest(appId=" + anonymousClass5 + ", appsFlyerChannelName=" + anonymousClass52 + ", appsFlyerId=" + anonymousClass53 + ", device=" + anonymousClass54 + ", deviceId=" + anonymousClass55 + ", deviceIMEI=" + anonymousClass56 + ", deviceMAC=" + anonymousClass57 + ", isFromLogin=" + anonymousClass58 + ", rooted=" + anonymousClass59 + ", segmentAnonymousId=" + anonymousClass510 + ", signedAttestation=" + anonymousClass511 + ")";
    }

    public AppInfoRequest(ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, ComponentActivity.AnonymousClass5<String> anonymousClass54, ComponentActivity.AnonymousClass5<String> anonymousClass55, ComponentActivity.AnonymousClass5<String> anonymousClass56, ComponentActivity.AnonymousClass5<String> anonymousClass57, ComponentActivity.AnonymousClass5<Boolean> anonymousClass58, ComponentActivity.AnonymousClass5<Integer> anonymousClass59, ComponentActivity.AnonymousClass5<String> anonymousClass510, ComponentActivity.AnonymousClass5<String> anonymousClass511) {
        runAnimators.ag$a(anonymousClass5, "appId");
        runAnimators.ag$a(anonymousClass52, "appsFlyerChannelName");
        runAnimators.ag$a(anonymousClass53, "appsFlyerId");
        runAnimators.ag$a(anonymousClass54, "device");
        runAnimators.ag$a(anonymousClass55, "deviceId");
        runAnimators.ag$a(anonymousClass56, "deviceIMEI");
        runAnimators.ag$a(anonymousClass57, "deviceMAC");
        runAnimators.ag$a(anonymousClass58, "isFromLogin");
        runAnimators.ag$a(anonymousClass59, "rooted");
        runAnimators.ag$a(anonymousClass510, "segmentAnonymousId");
        runAnimators.ag$a(anonymousClass511, "signedAttestation");
        this.appId = anonymousClass5;
        this.appsFlyerChannelName = anonymousClass52;
        this.appsFlyerId = anonymousClass53;
        this.device = anonymousClass54;
        this.deviceId = anonymousClass55;
        this.deviceIMEI = anonymousClass56;
        this.deviceMAC = anonymousClass57;
        this.isFromLogin = anonymousClass58;
        this.rooted = anonymousClass59;
        this.segmentAnonymousId = anonymousClass510;
        this.signedAttestation = anonymousClass511;
    }

    public /* synthetic */ AppInfoRequest(ComponentActivity.AnonymousClass5 anonymousClass5, ComponentActivity.AnonymousClass5 anonymousClass52, ComponentActivity.AnonymousClass5 anonymousClass53, ComponentActivity.AnonymousClass5 anonymousClass54, ComponentActivity.AnonymousClass5 anonymousClass55, ComponentActivity.AnonymousClass5 anonymousClass56, ComponentActivity.AnonymousClass5 anonymousClass57, ComponentActivity.AnonymousClass5 anonymousClass58, ComponentActivity.AnonymousClass5 anonymousClass59, ComponentActivity.AnonymousClass5 anonymousClass510, ComponentActivity.AnonymousClass5 anonymousClass511, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass5, (i & 2) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass52, (i & 4) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass53, (i & 8) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass54, (i & 16) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass55, (i & 32) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass56, (i & 64) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass57, (i & 128) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass58, (i & 256) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass59, (i & 512) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass510, (i & 1024) != 0 ? ComponentActivity.AnonymousClass5.ag$a.ag$a() : anonymousClass511);
    }

    public final ComponentActivity.AnonymousClass5<String> getAppId() {
        return this.appId;
    }

    public final ComponentActivity.AnonymousClass5<String> getAppsFlyerChannelName() {
        return this.appsFlyerChannelName;
    }

    public final ComponentActivity.AnonymousClass5<String> getAppsFlyerId() {
        return this.appsFlyerId;
    }

    public final ComponentActivity.AnonymousClass5<String> getDevice() {
        return this.device;
    }

    public final ComponentActivity.AnonymousClass5<String> getDeviceId() {
        return this.deviceId;
    }

    public final ComponentActivity.AnonymousClass5<String> getDeviceIMEI() {
        return this.deviceIMEI;
    }

    public final ComponentActivity.AnonymousClass5<String> getDeviceMAC() {
        return this.deviceMAC;
    }

    public final ComponentActivity.AnonymousClass5<Boolean> isFromLogin() {
        return this.isFromLogin;
    }

    public final ComponentActivity.AnonymousClass5<Integer> getRooted() {
        return this.rooted;
    }

    public final ComponentActivity.AnonymousClass5<String> getSegmentAnonymousId() {
        return this.segmentAnonymousId;
    }

    public final ComponentActivity.AnonymousClass5<String> getSignedAttestation() {
        return this.signedAttestation;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        return new remove() { // from class: com.app.dream11.core.service.graphql.api.type.AppInfoRequest$marshaller$$inlined$invoke$1
            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                if (AppInfoRequest.this.getAppId().valueOf) {
                    onBackPressedCallback.ah$a("appId", AppInfoRequest.this.getAppId().values);
                }
                if (AppInfoRequest.this.getAppsFlyerChannelName().valueOf) {
                    onBackPressedCallback.ah$a("appsFlyerChannelName", AppInfoRequest.this.getAppsFlyerChannelName().values);
                }
                if (AppInfoRequest.this.getAppsFlyerId().valueOf) {
                    onBackPressedCallback.ah$a("appsFlyerId", AppInfoRequest.this.getAppsFlyerId().values);
                }
                if (AppInfoRequest.this.getDevice().valueOf) {
                    onBackPressedCallback.ah$a("device", AppInfoRequest.this.getDevice().values);
                }
                if (AppInfoRequest.this.getDeviceId().valueOf) {
                    onBackPressedCallback.ah$a("deviceId", AppInfoRequest.this.getDeviceId().values);
                }
                if (AppInfoRequest.this.getDeviceIMEI().valueOf) {
                    onBackPressedCallback.ah$a("deviceIMEI", AppInfoRequest.this.getDeviceIMEI().values);
                }
                if (AppInfoRequest.this.getDeviceMAC().valueOf) {
                    onBackPressedCallback.ah$a("deviceMAC", AppInfoRequest.this.getDeviceMAC().values);
                }
                if (AppInfoRequest.this.isFromLogin().valueOf) {
                    onBackPressedCallback.valueOf("IsFromLogin", AppInfoRequest.this.isFromLogin().values);
                }
                if (AppInfoRequest.this.getRooted().valueOf) {
                    onBackPressedCallback.ag$a("rooted", AppInfoRequest.this.getRooted().values);
                }
                if (AppInfoRequest.this.getSegmentAnonymousId().valueOf) {
                    onBackPressedCallback.ah$a("segmentAnonymousId", AppInfoRequest.this.getSegmentAnonymousId().values);
                }
                if (AppInfoRequest.this.getSignedAttestation().valueOf) {
                    onBackPressedCallback.ah$a("signedAttestation", AppInfoRequest.this.getSignedAttestation().values);
                }
            }
        };
    }
}
