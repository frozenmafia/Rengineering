package o;
/* loaded from: classes3.dex */
public final class findFromCache {
    public static final createFromResourcesFontFile ag$a;

    static {
        runAnimators.ag$a("http://192.168.1.7:8000/response.json", "storylyListEndpoint");
        runAnimators.ag$a("http://192.168.1.3:9099/traffic/{token}", "storylyAnalyticsEndpoint");
        runAnimators.ag$a("http://open.qa.storyly.io/share/v2/{story_id}", "shareUrl");
        runAnimators.ag$a("http://192.168.1.20:8000/ugc.json", "momentsReportEndpoint");
        runAnimators.ag$a("https://192.168.1.20:8000/traffic", "momentsAnalyticsEndpoint");
        runAnimators.ag$a("http://192.168.1.7:8000/id.json", "momentsStoryGroupIdsEndpoint");
        runAnimators.ag$a("http://192.168.1.7:8000/moments.json", "momentsStoryGroupPagedListEndpoint");
        runAnimators.ag$a("https://api.qa.storyly.io/sdk/v1.24/stories/{token}", "storylyListEndpoint");
        runAnimators.ag$a("https://trk.qa.storyly.io/traffic/{token}", "storylyAnalyticsEndpoint");
        runAnimators.ag$a("https://open.qa.storyly.io/share/v2/{story_id}", "shareUrl");
        runAnimators.ag$a("https://api.storyly.io/ugc/v0.1/stories/report", "momentsReportEndpoint");
        runAnimators.ag$a("https://ugc-trk.qa.storyly.io/traffic", "momentsAnalyticsEndpoint");
        runAnimators.ag$a("https://api.qa.storyly.io/ugc/v0.1/story-groups/ids", "momentsStoryGroupIdsEndpoint");
        runAnimators.ag$a("https://api.qa.storyly.io/ugc/v0.1/story-groups", "momentsStoryGroupPagedListEndpoint");
        ag$a = new createFromResourcesFontFile("https://api.storyly.io/sdk/v1.24/stories/{token}", "https://trk.storyly.io/traffic/{token}", "https://open.storyly.io/share/v2/{story_id}", "https://api.storyly.io/ugc/v0.1/stories/report", "https://ugc-trk.storyly.io/traffic", "https://api.storyly.io/ugc/v0.1/story-groups/ids", "https://api.storyly.io/ugc/v0.1/story-groups");
    }

    public static final createFromResourcesFontFile ah$a() {
        return ag$a;
    }
}
