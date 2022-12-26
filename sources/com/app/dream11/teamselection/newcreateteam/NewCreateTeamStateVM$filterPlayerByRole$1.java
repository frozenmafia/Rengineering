package com.app.dream11.teamselection.newcreateteam;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createFilesDir;
import o.getExternalCacheDirs;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class NewCreateTeamStateVM$filterPlayerByRole$1 extends Lambda implements Styleable.ChangeBounds<createFilesDir, Boolean> {
    final /* synthetic */ getExternalCacheDirs $playerRole;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCreateTeamStateVM$filterPlayerByRole$1(getExternalCacheDirs getexternalcachedirs) {
        super(1);
        this.$playerRole = getexternalcachedirs;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(createFilesDir createfilesdir) {
        runAnimators.ag$a(createfilesdir, "it");
        return Boolean.valueOf(runAnimators.values(createfilesdir.getInterfaceDescriptor(), this.$playerRole));
    }
}
