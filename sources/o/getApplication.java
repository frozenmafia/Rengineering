package o;

import android.content.Context;
import java.io.FileInputStream;
import java.io.IOException;
import o.ClassesInfoCache;
/* loaded from: classes4.dex */
public final class getApplication extends ClassesInfoCache.MethodReference {
    public getApplication(Context context, String str) {
        super(context, str);
    }

    @Override // o.ClassesInfoCache.MethodReference
    protected ClassesInfoCache$MethodReference$HaptikSDK$a valueOf(byte b2) throws IOException {
        return new ClassesInfoCache$MethodReference$HaptikSDK$a(this) { // from class: o.getApplication$ah$a
            private final getApplication$ag$a[] ag$a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
                throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r11 + "]");
             */
            {
                /*
                    Method dump skipped, instructions count: 296
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getApplication$ah$a.<init>(o.getApplication, o.ClassesInfoCache$MethodReference):void");
            }

            @Override // o.ClassesInfoCache$MethodReference$HaptikSDK$a
            public ClassesInfoCache$MethodReference$ag$a ah$a() throws IOException {
                return new ClassesInfoCache$MethodReference$ag$a(this.ag$a);
            }

            @Override // o.ClassesInfoCache$MethodReference$HaptikSDK$a
            public ClassesInfoCache$MethodReference$ah$a values() throws IOException {
                return new toString();
            }

            /* loaded from: classes4.dex */
            final class toString extends ClassesInfoCache$MethodReference$ah$a {
                private int ah$a;

                private toString() {
                }

                @Override // o.ClassesInfoCache$MethodReference$ah$a
                public boolean ag$a() {
                    return this.ah$a < getApplication$ah$a.this.ag$a.length;
                }

                @Override // o.ClassesInfoCache$MethodReference$ah$a
                public ClassesInfoCache.MethodReference.valueOf valueOf() throws IOException {
                    getApplication$ag$a[] getapplication_ag_aArr = getApplication$ah$a.this.ag$a;
                    int i = this.ah$a;
                    this.ah$a = i + 1;
                    getApplication$ag$a getapplication_ag_a = getapplication_ag_aArr[i];
                    FileInputStream fileInputStream = new FileInputStream(getapplication_ag_a.values);
                    try {
                        return new ClassesInfoCache.MethodReference.values(getapplication_ag_a, fileInputStream);
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                }
            }
        };
    }
}
