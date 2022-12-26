package o;

import o.databaseBuilder;
/* loaded from: classes5.dex */
final class databaseBuilder$ah$b extends databaseBuilder$ah$a {
    private databaseBuilder$ah$b() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.databaseBuilder$ah$a
    public void toString(databaseBuilder$HaptikSDK$c databasebuilder_haptiksdk_c, Thread thread) {
        databasebuilder_haptiksdk_c.ah$a = thread;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.databaseBuilder$ah$a
    public void toString(databaseBuilder$HaptikSDK$c databasebuilder_haptiksdk_c, databaseBuilder$HaptikSDK$c databasebuilder_haptiksdk_c2) {
        databasebuilder_haptiksdk_c.ag$a = databasebuilder_haptiksdk_c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.databaseBuilder$ah$a
    public boolean ah$a(databaseBuilder<?> databasebuilder, databaseBuilder$HaptikSDK$c databasebuilder_haptiksdk_c, databaseBuilder$HaptikSDK$c databasebuilder_haptiksdk_c2) {
        databaseBuilder$HaptikSDK$c databasebuilder_haptiksdk_c3;
        synchronized (databasebuilder) {
            databasebuilder_haptiksdk_c3 = ((databaseBuilder) databasebuilder).ah$b;
            if (databasebuilder_haptiksdk_c3 == databasebuilder_haptiksdk_c) {
                ((databaseBuilder) databasebuilder).ah$b = databasebuilder_haptiksdk_c2;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.databaseBuilder$ah$a
    public boolean values(databaseBuilder<?> databasebuilder, databaseBuilder.valueOf valueof, databaseBuilder.valueOf valueof2) {
        databaseBuilder.valueOf valueof3;
        synchronized (databasebuilder) {
            valueof3 = ((databaseBuilder) databasebuilder).toString;
            if (valueof3 == valueof) {
                ((databaseBuilder) databasebuilder).toString = valueof2;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.databaseBuilder$ah$a
    public boolean valueOf(databaseBuilder<?> databasebuilder, Object obj, Object obj2) {
        synchronized (databasebuilder) {
            if (((databaseBuilder) databasebuilder).HaptikSDK$c == obj) {
                ((databaseBuilder) databasebuilder).HaptikSDK$c = obj2;
                return true;
            }
            return false;
        }
    }
}
