package kotlinx.serialization;

import o.runAnimators;
/* loaded from: classes5.dex */
public final class MissingFieldException extends SerializationException {
    public MissingFieldException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str) {
        this("Field '" + str + "' is required, but it was missing", (Throwable) null);
        runAnimators.ag$a(str, "fieldName");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MissingFieldException(java.util.List<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fieldNames"
            o.runAnimators.ag$a(r3, r0)
            java.lang.String r0 = "serialName"
            o.runAnimators.ag$a(r4, r0)
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field '"
            r0.append(r1)
            r1 = 0
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = "' is required for type with serial name '"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "', but it was missing"
            goto L47
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fields "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " are required for type with serial name '"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "', but they were missing"
        L47:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4 = 0
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.MissingFieldException.<init>(java.util.List, java.lang.String):void");
    }
}
