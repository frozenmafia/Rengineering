package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createFilesDir;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NewCreateTeamStateVM$filterSelectedPlayerPerSquad$1 extends Lambda implements Styleable.ChangeBounds<createFilesDir, Boolean> {
    final /* synthetic */ int $squadId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCreateTeamStateVM$filterSelectedPlayerPerSquad$1(int i) {
        super(1);
        this.$squadId = i;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(createFilesDir createfilesdir) {
        runAnimators.ag$a(createfilesdir, "it");
        boolean z = true;
        return Boolean.valueOf((runAnimators.values((Object) createfilesdir.validateRelationship().get(), (Object) true) && createfilesdir.newSession() == this.$squadId) ? false : false);
    }
}
