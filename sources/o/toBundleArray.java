package o;

import com.app.dream11.core.service.graphql.api.type.LineupStatusEnum;
/* loaded from: classes3.dex */
public final class toBundleArray {
    private final int HaptikSDK$a;
    private final LineupStatusEnum HaptikSDK$b;
    private String HaptikSDK$c;
    private final String HaptikSDK$d;
    private final String HaptikSDK$e;
    private final String HaptikWebView;
    private final boolean a;
    private String ag$a;
    private final boolean ah$a;
    private int ah$b;
    private final valueOf aj$a;
    private final String ak;
    private final String getInitSettings;
    private final double getSignupData;
    private final String invoke;
    private final int isLogoutPending;
    private final int toString;
    private String valueOf;
    private final boolean values;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void values(toBundleArray tobundlearray);
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class values {
        public static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[LineupStatusEnum.values().length];
            iArr[LineupStatusEnum.X_FACTOR_SUBSTITUTE.ordinal()] = 1;
            iArr[LineupStatusEnum.NOT_PLAYING.ordinal()] = 2;
            valueOf = iArr;
        }
    }

    public toBundleArray(String str, int i, String str2, double d, String str3, String str4, int i2, boolean z, boolean z2, String str5, boolean z3, valueOf valueof, int i3, String str6, LineupStatusEnum lineupStatusEnum) {
        runAnimators.ag$a(str, "playerName");
        runAnimators.ag$a(str2, "playerPts");
        runAnimators.ag$a(str3, "playerType");
        runAnimators.ag$a(str4, "playerImg");
        runAnimators.ag$a(valueof, "uiHandler");
        runAnimators.ag$a(str6, "sourceTeamPreview");
        this.HaptikSDK$e = str;
        this.HaptikSDK$a = i;
        this.getInitSettings = str2;
        this.getSignupData = d;
        this.HaptikSDK$d = str3;
        this.invoke = str4;
        this.isLogoutPending = i2;
        this.ah$a = z;
        this.values = z2;
        this.HaptikWebView = str5;
        this.a = z3;
        this.aj$a = valueof;
        this.toString = i3;
        this.ak = str6;
        this.HaptikSDK$b = lineupStatusEnum;
        this.valueOf = "ComponentLoaded_TeamPreview";
        this.HaptikSDK$c = applyIconTint.ag$a("ComponentLoaded_TeamPreview");
        this.ag$a = "team_preview";
        int i4 = lineupStatusEnum == null ? -1 : values.valueOf[lineupStatusEnum.ordinal()];
        this.ah$b = i4 != 1 ? i4 != 2 ? com.app.dream11Pro.R.drawable.preview_lineup_playing : com.app.dream11Pro.R.drawable.preview_lineup_not_playing : com.app.dream11Pro.R.drawable.preview_substitute_playing;
    }

    public final int HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$e;
    }

    public final String HaptikSDK$c() {
        return this.invoke;
    }

    public final String HaptikSDK$e() {
        return this.HaptikSDK$d;
    }

    public final double getInitSettings() {
        return this.getSignupData;
    }

    public final String getSignupData() {
        return this.getInitSettings;
    }

    public final boolean HaptikSDK$d() {
        return this.a;
    }

    public final String HaptikWebView() {
        return this.HaptikWebView;
    }

    public final valueOf a() {
        return this.aj$a;
    }

    public final boolean ag$a() {
        return this.values;
    }

    public final int ah$a() {
        return this.toString;
    }

    public final int aj$a() {
        return this.isLogoutPending;
    }

    public final String ak() {
        return this.ak;
    }

    public final boolean onXdkEvent() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final String ah$b() {
        return this.HaptikSDK$c;
    }

    public final String values() {
        return this.ag$a;
    }

    public final int invoke() {
        return this.ah$b;
    }
}
