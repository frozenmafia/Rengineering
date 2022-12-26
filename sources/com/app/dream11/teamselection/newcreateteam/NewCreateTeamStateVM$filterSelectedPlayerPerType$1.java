package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createFilesDir;
import o.getMainExecutor;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NewCreateTeamStateVM$filterSelectedPlayerPerType$1 extends Lambda implements Styleable.ChangeBounds<createFilesDir, Boolean> {
    final /* synthetic */ getMainExecutor $playerType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCreateTeamStateVM$filterSelectedPlayerPerType$1(getMainExecutor getmainexecutor) {
        super(1);
        this.$playerType = getmainexecutor;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(createFilesDir createfilesdir) {
        runAnimators.ag$a(createfilesdir, "it");
        boolean z = true;
        return Boolean.valueOf((runAnimators.values((Object) createfilesdir.validateRelationship().get(), (Object) true) && createfilesdir.extraCallbackWithResult() == this.$playerType.invoke()) ? false : false);
    }
}
