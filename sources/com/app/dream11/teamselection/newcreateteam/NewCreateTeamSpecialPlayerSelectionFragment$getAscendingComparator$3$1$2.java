package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createFilesDir;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NewCreateTeamSpecialPlayerSelectionFragment$getAscendingComparator$3$1$2 extends Lambda implements Styleable.ChangeBounds<createFilesDir, Comparable<?>> {
    public static final NewCreateTeamSpecialPlayerSelectionFragment$getAscendingComparator$3$1$2 INSTANCE = new NewCreateTeamSpecialPlayerSelectionFragment$getAscendingComparator$3$1$2();

    NewCreateTeamSpecialPlayerSelectionFragment$getAscendingComparator$3$1$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Comparable<?> invoke(createFilesDir createfilesdir) {
        runAnimators.ag$a(createfilesdir, "newPlayerBeanVm");
        return createfilesdir.isLogoutPending();
    }
}
