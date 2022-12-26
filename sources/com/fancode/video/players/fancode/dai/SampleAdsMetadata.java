package com.fancode.video.players.fancode.dai;

import com.sendbird.android.constant.StringSet;
import java.util.Arrays;
import java.util.List;
import o.SavedStateHandleController;
/* loaded from: classes6.dex */
public enum SampleAdsMetadata {
    PRE_ROLL_NO_SKIP("https://storage.googleapis.com/gvabox/media/samples/stock.mp4", "Pre-roll, linear not skippable", "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/single_ad_samples&sz=640x480&cust_params=sample_ct%3Dlinear&ciu_szs=300x250%2C728x90&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=", SavedStateHandleController.AnonymousClass1.toString.ic_mute, false),
    PRE_ROLL_SKIP("https://storage.googleapis.com/gvabox/media/samples/stock.mp4", "Pre-roll, linear, skippable", "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/single_preroll_skippable&sz=640x480&ciu_szs=300x250%2C728x90&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=", SavedStateHandleController.AnonymousClass1.toString.ic_mute, false),
    POST_ROLL("https://storage.googleapis.com/gvabox/media/samples/stock.mp4", "Post-roll", "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/vmap_ad_samples&sz=640x480&cust_params=sample_ar%3Dpostonly&ciu_szs=300x250&gdfp_req=1&ad_rule=1&output=vmap&unviewed_position_start=1&env=vp&impl=s&correlator=", SavedStateHandleController.AnonymousClass1.toString.ic_mute, true),
    VMAP("https://storage.googleapis.com/gvabox/media/samples/stock.mp4", "VMAP", "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/vmap_ad_samples&sz=640x480&cust_params=sample_ar%3Dpremidpost&ciu_szs=300x250&gdfp_req=1&ad_rule=1&output=vmap&unviewed_position_start=1&env=vp&impl=s&cmsid=496&vid=short_onecue&correlator=", SavedStateHandleController.AnonymousClass1.toString.ic_mute, true),
    VMAP_PODS("https://storage.googleapis.com/gvabox/media/samples/stock.mp4", "VMAP Pods", "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/vmap_ad_samples&sz=640x480&cust_params=sample_ar%3Dpremidpostpod&ciu_szs=300x250&gdfp_req=1&ad_rule=1&output=vmap&unviewed_position_start=1&env=vp&impl=s&cmsid=496&vid=short_onecue&correlator=", SavedStateHandleController.AnonymousClass1.toString.ic_mute, true),
    WRAPPER("https://storage.googleapis.com/gvabox/media/samples/stock.mp4", "Wrapper", "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/single_ad_samples&sz=640x480&cust_params=sample_ct%3Dredirectlinear&ciu_szs=300x250%2C728x90&gdfp_req=1&output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=", SavedStateHandleController.AnonymousClass1.toString.ic_mute, false),
    CUSTOM("https://storage.googleapis.com/gvabox/media/samples/stock.mp4", "Custom", StringSet.custom, SavedStateHandleController.AnonymousClass1.toString.ic_mute, false);
    
    public final String adTagUrl;
    public final boolean isVmap;
    public final int thumbnail;
    public final String title;
    public final String videoUrl;
    public static final List<SampleAdsMetadata> APP_VIDEOS = Arrays.asList(PRE_ROLL_NO_SKIP, PRE_ROLL_SKIP, POST_ROLL, VMAP, VMAP_PODS, WRAPPER, CUSTOM);

    SampleAdsMetadata(String str, String str2, String str3, int i, boolean z) {
        this.videoUrl = str;
        this.title = str2;
        this.adTagUrl = str3;
        this.thumbnail = i;
        this.isVmap = z;
    }
}
