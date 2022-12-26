package o;

import java.util.Date;
/* loaded from: classes2.dex */
public final class getNonActionItems implements startActivityForResult<Date> {
    @Override // o.startActivityForResult
    /* renamed from: values */
    public Date ag$a(reportFullyDrawn<?> reportfullydrawn) {
        runAnimators.ag$a(reportfullydrawn, "value");
        return new Date(inflateColorStateList.values("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", String.valueOf(reportfullydrawn.values)));
    }

    @Override // o.startActivityForResult
    /* renamed from: valueOf */
    public reportFullyDrawn<?> ah$a(Date date) {
        runAnimators.ag$a(date, "value");
        reportFullyDrawn$ag$a reportfullydrawn_ag_a = reportFullyDrawn.ah$a;
        String ah$a = inflateColorStateList.ah$a("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", date.getTime());
        runAnimators.ah$a(ah$a, "getDateInString(TimeUtil…_DATE_FORMAT, value.time)");
        return reportfullydrawn_ag_a.values(ah$a);
    }
}
