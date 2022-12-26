package o;

import kotlin.KotlinNothingValueException;
import o.VectorDrawableCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class addNewItem extends drawPath implements VectorDrawableCompat.VClipPath {
    private final String toString;
    private final Throwable values;

    public addNewItem(Throwable th, String str) {
        this.values = th;
        this.toString = str;
    }

    @Override // o.drawPath
    public drawPath valueOf() {
        return this;
    }

    @Override // o.parseInterpolatorFromTypeArray
    public boolean isDispatchNeeded(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        ag$a();
        throw new KotlinNothingValueException();
    }

    @Override // o.drawPath, o.parseInterpolatorFromTypeArray
    public parseInterpolatorFromTypeArray limitedParallelism(int i) {
        ag$a();
        throw new KotlinNothingValueException();
    }

    @Override // o.VectorDrawableCompat.VClipPath
    public getStrokeLineCap ag$a(long j, Runnable runnable, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        ag$a();
        throw new KotlinNothingValueException();
    }

    @Override // o.parseInterpolatorFromTypeArray
    /* renamed from: toString */
    public Void dispatch(PropertyValuesHolderUtils propertyValuesHolderUtils, Runnable runnable) {
        ag$a();
        throw new KotlinNothingValueException();
    }

    @Override // o.VectorDrawableCompat.VClipPath
    /* renamed from: ag$a */
    public Void toString(long j, createInterpolatorFromXml<? super setAnimationMatrix> createinterpolatorfromxml) {
        ag$a();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void ag$a() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.values
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.toString
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.values
            r1.<init>(r0, r2)
            throw r1
        L36:
            o.setScrollingCacheEnabled.values()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addNewItem.ag$a():java.lang.Void");
    }

    @Override // o.drawPath, o.parseInterpolatorFromTypeArray
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.values != null) {
            str = ", cause=" + this.values;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
