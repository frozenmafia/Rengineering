package com.app.dream11.chat.interfaces;

import o.runAnimators;
/* loaded from: classes.dex */
public interface IMiniProfileActionCallback {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void onMakeGroupAdminClicked(IMiniProfileActionCallback iMiniProfileActionCallback, int i, String str) {
            runAnimators.ag$a(iMiniProfileActionCallback, "this");
            runAnimators.ag$a(str, "teamName");
        }

        public static void onRemoveAsGroupAdminClicked(IMiniProfileActionCallback iMiniProfileActionCallback, int i, String str) {
            runAnimators.ag$a(iMiniProfileActionCallback, "this");
            runAnimators.ag$a(str, "teamName");
        }
    }

    void onMakeGroupAdminClicked(int i, String str);

    void onRemoveAsGroupAdminClicked(int i, String str);

    void onRemoveUserFromGroupClicked(int i, String str);
}
