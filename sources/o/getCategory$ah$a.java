package o;

import com.app.dream11.social.SocialHelper;
/* loaded from: classes3.dex */
public final /* synthetic */ class getCategory$ah$a {
    public static final /* synthetic */ int[] toString;

    static {
        int[] iArr = new int[SocialHelper.ConnectionStatus.values().length];
        iArr[SocialHelper.ConnectionStatus.FOLLOWING.ordinal()] = 1;
        iArr[SocialHelper.ConnectionStatus.BOTH.ordinal()] = 2;
        iArr[SocialHelper.ConnectionStatus.FOLLOW.ordinal()] = 3;
        iArr[SocialHelper.ConnectionStatus.NOT_CONNECTED.ordinal()] = 4;
        toString = iArr;
    }
}
