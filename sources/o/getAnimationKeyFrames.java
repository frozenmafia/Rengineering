package o;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import com.app.dream11.core.service.graphql.api.type.CustomChannelType;
/* loaded from: classes3.dex */
public final class getAnimationKeyFrames {
    private final String HaptikSDK$a;
    private final enableHomeButtonByDefault HaptikSDK$b;
    private final ContestItem.InvitationsInfo ag$a;
    private final int ah$a;
    private final String invoke;
    private final boolean toString;
    private final int valueOf;
    private final valueOf values;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class toString {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[CustomChannelType.values().length];
            iArr[CustomChannelType.GROUP_CHAT.ordinal()] = 1;
            iArr[CustomChannelType.DM.ordinal()] = 2;
            values = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public interface valueOf {
        void ah$a();
    }

    public getAnimationKeyFrames(ContestItem.InvitationsInfo invitationsInfo, boolean z, valueOf valueof, enableHomeButtonByDefault enablehomebuttonbydefault) {
        String str;
        Integer invitationsCount;
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.ag$a = invitationsInfo;
        this.toString = z;
        this.values = valueof;
        this.HaptikSDK$b = enablehomebuttonbydefault;
        int intValue = (invitationsInfo == null || (invitationsCount = invitationsInfo.getInvitationsCount()) == null) ? 0 : invitationsCount.intValue();
        this.valueOf = intValue;
        if (intValue > 0) {
            String str2 = (invitationsInfo == null || (str2 = invitationsInfo.getChannelName()) == null) ? "" : "";
            CustomChannelType customType = invitationsInfo == null ? null : invitationsInfo.getCustomType();
            int i = customType == null ? -1 : toString.values[customType.ordinal()];
            if (i != 1) {
                str = i != 2 ? null : enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f1201df, str2);
            } else if (intValue == 1) {
                str = enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120b90, str2);
            } else {
                int i2 = intValue - 1;
                str = enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120b92, isRequestPinShortcutSupported.valueOf(str2, 15), enablehomebuttonbydefault.ah$a(com.app.dream11Pro.R.plurals.res_0x7f100020, i2, Integer.valueOf(i2)));
            }
        } else {
            str = null;
        }
        this.invoke = str;
        this.HaptikSDK$a = invitationsInfo == null ? null : invitationsInfo.getCoverUrl();
        CustomChannelType customType2 = invitationsInfo != null ? invitationsInfo.getCustomType() : null;
        this.ah$a = (customType2 != null ? toString.values[customType2.ordinal()] : -1) == 1 ? com.app.dream11Pro.R.drawable.ic_groups_default_profile : com.app.dream11Pro.R.drawable.ic_one_to_one_default_profile;
    }

    public final boolean ah$b() {
        return this.toString;
    }

    public final valueOf ag$a() {
        return this.values;
    }

    public final String ah$a() {
        ContestItem.InvitationsInfo invitationsInfo = this.ag$a;
        if (invitationsInfo == null) {
            return null;
        }
        return invitationsInfo.getChannelUrl();
    }

    public final String HaptikSDK$b() {
        return this.invoke;
    }

    public final String values() {
        return this.HaptikSDK$a;
    }

    public final int valueOf() {
        return this.ah$a;
    }
}
