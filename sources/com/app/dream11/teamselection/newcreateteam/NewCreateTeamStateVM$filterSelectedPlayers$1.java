package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createFilesDir;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NewCreateTeamStateVM$filterSelectedPlayers$1 extends Lambda implements Styleable.ChangeBounds<createFilesDir, Boolean> {
    public static final NewCreateTeamStateVM$filterSelectedPlayers$1 INSTANCE = new NewCreateTeamStateVM$filterSelectedPlayers$1();

    NewCreateTeamStateVM$filterSelectedPlayers$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(createFilesDir createfilesdir) {
        runAnimators.ag$a(createfilesdir, "it");
        return Boolean.valueOf(runAnimators.values((Object) createfilesdir.validateRelationship().get(), (Object) true));
    }
}
