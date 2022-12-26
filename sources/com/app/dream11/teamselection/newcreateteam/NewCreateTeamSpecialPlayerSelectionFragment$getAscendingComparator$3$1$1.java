package com.app.dream11.teamselection.newcreateteam;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.createFilesDir;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NewCreateTeamSpecialPlayerSelectionFragment$getAscendingComparator$3$1$1 extends Lambda implements Styleable.ChangeBounds<createFilesDir, Comparable<?>> {
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCreateTeamSpecialPlayerSelectionFragment$getAscendingComparator$3$1$1(int i) {
        super(1);
        this.$index = i;
    }

    @Override // o.Styleable.ChangeBounds
    public final Comparable<?> invoke(createFilesDir createfilesdir) {
        List<ShmeCreateTeamQuery.RoleStatistic> roleStatistics;
        ShmeCreateTeamQuery.RoleStatistic roleStatistic;
        runAnimators.ag$a(createfilesdir, "newPlayerBeanVM");
        ShmeCreateTeamQuery.Statistics extraCallback = createfilesdir.extraCallback();
        return (extraCallback == null || (roleStatistics = extraCallback.getRoleStatistics()) == null || (roleStatistic = roleStatistics.get(this.$index)) == null) ? null : Double.valueOf(roleStatistic.getSelectionRate());
    }
}
