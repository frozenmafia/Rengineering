package com.app.dream11.spotlight;
/* loaded from: classes3.dex */
public class OverlayPresenter {
    OverlayFeature overlayFeature;

    public OverlayPresenter(OverlayFeature overlayFeature) {
        this.overlayFeature = overlayFeature;
    }

    public ScreenOverlayMapper shouldShowOverlay(OverlayScreen overlayScreen, boolean z, boolean z2) {
        boolean z3 = z || this.overlayFeature.shouldShowOverlay(overlayScreen);
        boolean shouldShowSkip = this.overlayFeature.shouldShowSkip(overlayScreen);
        ScreenOverlayMapper screenOverlayMapper = new ScreenOverlayMapper();
        int i = AnonymousClass1.$SwitchMap$com$app$dream11$spotlight$OverlayScreen[overlayScreen.ordinal()];
        if (i == 1) {
            screenOverlayMapper.setShouldShowOverlay(z3);
            screenOverlayMapper.setShouldShowSkip(shouldShowSkip);
            return screenOverlayMapper;
        } else if (i == 2) {
            screenOverlayMapper.setShouldShowOverlay(z3);
            screenOverlayMapper.setShouldShowSkip(shouldShowSkip);
            return screenOverlayMapper;
        } else if (i == 3) {
            screenOverlayMapper.setShouldShowOverlay(z3);
            screenOverlayMapper.setShouldShowSkip(shouldShowSkip);
            return screenOverlayMapper;
        } else if (z2) {
            screenOverlayMapper.setShouldShowOverlay(z3);
            screenOverlayMapper.setShouldShowSkip(shouldShowSkip);
            return screenOverlayMapper;
        } else {
            screenOverlayMapper.setShouldShowOverlay(false);
            screenOverlayMapper.setShouldShowSkip(false);
            return screenOverlayMapper;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.spotlight.OverlayPresenter$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$app$dream11$spotlight$OverlayScreen;

        static {
            int[] iArr = new int[OverlayScreen.values().length];
            $SwitchMap$com$app$dream11$spotlight$OverlayScreen = iArr;
            try {
                iArr[OverlayScreen.TEAM_PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$app$dream11$spotlight$OverlayScreen[OverlayScreen.LEAGUEDETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$app$dream11$spotlight$OverlayScreen[OverlayScreen.SHARE_TEAM_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean isLeagueDetailsOverlayViewed() {
        return this.overlayFeature.isLeagueDetailsOverlayViewed();
    }
}
