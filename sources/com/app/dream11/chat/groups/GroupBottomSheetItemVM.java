package com.app.dream11.chat.groups;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.app.dream11Pro.R;
import o.enableHomeButtonByDefault;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupBottomSheetItemVM extends BaseObservable {
    private final String channelName;
    private final String channelUrl;
    private final String coverUrl;
    private final int customType;
    private final int defaultProfilePic;
    private final Handler handler;
    private final ObservableBoolean isMute;
    private final Integer participantCount;
    private final ObservableField<String> participantCountText;
    private final enableHomeButtonByDefault resourceProvider;
    private final ObservableBoolean showParticipants;
    private final ObservableBoolean showUnreadCount;
    private final Integer unReadMessageCount;
    private final ObservableField<String> unreadCountText;

    /* loaded from: classes.dex */
    public interface Handler {
        void onItemClicked(GroupBottomSheetItemVM groupBottomSheetItemVM);
    }

    public /* synthetic */ GroupBottomSheetItemVM(String str, String str2, String str3, int i, Handler handler, enableHomeButtonByDefault enablehomebuttonbydefault, Integer num, Integer num2, Boolean bool, int i2, getTargetTypes gettargettypes) {
        this(str, str2, str3, i, handler, enablehomebuttonbydefault, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : bool);
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final int getCustomType() {
        return this.customType;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final enableHomeButtonByDefault getResourceProvider() {
        return this.resourceProvider;
    }

    public final Integer getParticipantCount() {
        return this.participantCount;
    }

    public final Integer getUnReadMessageCount() {
        return this.unReadMessageCount;
    }

    public GroupBottomSheetItemVM(String str, String str2, String str3, int i, Handler handler, enableHomeButtonByDefault enablehomebuttonbydefault, Integer num, Integer num2, Boolean bool) {
        int intValue;
        runAnimators.ag$a(str, "channelName");
        runAnimators.ag$a(str2, "channelUrl");
        runAnimators.ag$a(handler, "handler");
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.channelName = str;
        this.channelUrl = str2;
        this.coverUrl = str3;
        this.customType = i;
        this.handler = handler;
        this.resourceProvider = enablehomebuttonbydefault;
        this.participantCount = num;
        this.unReadMessageCount = num2;
        this.isMute = new ObservableBoolean(bool == null ? false : !bool.booleanValue());
        this.showParticipants = new ObservableBoolean(i == 1);
        String str4 = "";
        this.participantCountText = new ObservableField<>((num == null || (r6 = getResourceProvider().ah$a(R.plurals.res_0x7f100021, (intValue = num.intValue()), Integer.valueOf(intValue))) == null) ? "" : "");
        this.showUnreadCount = new ObservableBoolean((num2 == null ? -1 : num2.intValue()) > 0);
        if (num2 != null) {
            int intValue2 = num2.intValue();
            String valueOf = intValue2 <= 99 ? String.valueOf(intValue2) : getResourceProvider().valueOf(R.string.res_0x7f1205a6, new Object[0]);
            if (valueOf != null) {
                str4 = valueOf;
            }
        }
        this.unreadCountText = new ObservableField<>(str4);
        this.defaultProfilePic = i == 1 ? R.drawable.ic_groups_default_profile : R.drawable.ic_one_to_one_default_profile;
    }

    public final ObservableBoolean isMute() {
        return this.isMute;
    }

    public final ObservableBoolean getShowParticipants() {
        return this.showParticipants;
    }

    public final ObservableField<String> getParticipantCountText() {
        return this.participantCountText;
    }

    public final ObservableBoolean getShowUnreadCount() {
        return this.showUnreadCount;
    }

    public final ObservableField<String> getUnreadCountText() {
        return this.unreadCountText;
    }

    public final void hideUnReadCount() {
        this.showUnreadCount.set(false);
        this.unreadCountText.set("");
    }

    public final int getDefaultProfilePic() {
        return this.defaultProfilePic;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GroupBottomSheetItemVM) && runAnimators.values((Object) ((GroupBottomSheetItemVM) obj).channelUrl, (Object) this.channelUrl);
    }
}
