package com.app.dream11.chat.viewmodels;

import android.graphics.drawable.Drawable;
import androidx.databinding.ObservableField;
import com.app.dream11.chat.viewmodels.UserGlRankVm;
import com.app.dream11Pro.R;
import java.util.ArrayList;
import java.util.List;
import o.enableHomeButtonByDefault;
import o.getWrapped;
import o.m;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupLeaderboardVM {
    private final ObservableField<Drawable> groupLeaderBoardBackground;
    private final GroupLeaderboardInteraction interaction;
    private final ObservableField<Boolean> leaderboardEntryPointBandVisibility;
    private m<UserGlRankVm> leaderboardRowItemBinding;
    private List<UserGlRankVm> leaderboards;
    private final enableHomeButtonByDefault resourceProvider;
    private ObservableField<getWrapped> taggedViewEventHandler;

    /* loaded from: classes.dex */
    public interface GroupLeaderboardInteraction {
        void startMultiTour(UserGlRankVm.Handler.ViewALLSource viewALLSource);
    }

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserGlRankVm.TYPE.values().length];
            iArr[UserGlRankVm.TYPE.TYPE_SINGLE_ITEM.ordinal()] = 1;
            iArr[UserGlRankVm.TYPE.TYPE_ITEM.ordinal()] = 2;
            iArr[UserGlRankVm.TYPE.TYPE_VIEW_ALL.ordinal()] = 3;
            iArr[UserGlRankVm.TYPE.TYPE_EMPTY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GroupLeaderboardVM(enableHomeButtonByDefault enablehomebuttonbydefault, GroupLeaderboardInteraction groupLeaderboardInteraction) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(groupLeaderboardInteraction, "interaction");
        this.resourceProvider = enablehomebuttonbydefault;
        this.interaction = groupLeaderboardInteraction;
        this.taggedViewEventHandler = new ObservableField<>();
        this.groupLeaderBoardBackground = new ObservableField<>(enablehomebuttonbydefault.valueOf(R.drawable.background_group_leaderboard_band));
        this.leaderboardEntryPointBandVisibility = new ObservableField<>(false);
        this.leaderboards = new ArrayList();
        m<UserGlRankVm> mVar = m.toString(GroupLeaderboardVM$$ExternalSyntheticLambda0.INSTANCE);
        runAnimators.ah$a(mVar, "of { itemBinding, _, ite…)\n            }\n        }");
        this.leaderboardRowItemBinding = mVar;
    }

    public final enableHomeButtonByDefault getResourceProvider() {
        return this.resourceProvider;
    }

    public final GroupLeaderboardInteraction getInteraction() {
        return this.interaction;
    }

    public final ObservableField<getWrapped> getTaggedViewEventHandler() {
        return this.taggedViewEventHandler;
    }

    public final void setTaggedViewEventHandler(ObservableField<getWrapped> observableField) {
        runAnimators.ag$a(observableField, "<set-?>");
        this.taggedViewEventHandler = observableField;
    }

    public final ObservableField<Drawable> getGroupLeaderBoardBackground() {
        return this.groupLeaderBoardBackground;
    }

    public final ObservableField<Boolean> getLeaderboardEntryPointBandVisibility() {
        return this.leaderboardEntryPointBandVisibility;
    }

    public final void addLeaderboardItem(UserGlRankVm userGlRankVm) {
        runAnimators.ag$a(userGlRankVm, "item");
        this.leaderboards.add(userGlRankVm);
        if (userGlRankVm.getType() != UserGlRankVm.TYPE.TYPE_EMPTY) {
            updateBackground();
        }
    }

    private final void updateBackground() {
        this.groupLeaderBoardBackground.set(this.resourceProvider.valueOf(R.color.d11_color_bg__neutralLighter));
    }

    public final List<UserGlRankVm> getLeaderboard() {
        return this.leaderboards;
    }

    public final m<UserGlRankVm> getLeaderboardRowItemBinding() {
        return this.leaderboardRowItemBinding;
    }

    public final void setLeaderboardRowItemBinding(m<UserGlRankVm> mVar) {
        runAnimators.ag$a(mVar, "<set-?>");
        this.leaderboardRowItemBinding = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: leaderboardRowItemBinding$lambda-0  reason: not valid java name */
    public static final void m928leaderboardRowItemBinding$lambda0(m mVar, int i, UserGlRankVm userGlRankVm) {
        runAnimators.ag$a(mVar, "itemBinding");
        runAnimators.ag$a(userGlRankVm, "item");
        int i2 = WhenMappings.$EnumSwitchMapping$0[userGlRankVm.getType().ordinal()];
        if (i2 == 1) {
            mVar.ah$a(263, R.layout.res_0x7f0d0305);
        } else if (i2 == 2) {
            mVar.ah$a(263, R.layout.res_0x7f0d0304);
        } else if (i2 == 3) {
            mVar.ah$a(263, R.layout.res_0x7f0d0306);
        } else if (i2 != 4) {
        } else {
            mVar.ah$a(263, R.layout.res_0x7f0d0303);
        }
    }

    public final void startMultiTour() {
        this.interaction.startMultiTour(UserGlRankVm.Handler.ViewALLSource.PODIUM);
    }
}
