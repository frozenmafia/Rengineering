package o;

import o.ZipUtil;
import o.getNegativeButtonText;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class DropDownPreference {

    /* renamed from: o.DropDownPreference$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public final /* synthetic */ class AnonymousClass1 implements PercentLayoutHelper {
        public static final /* synthetic */ AnonymousClass1 ah$a = new AnonymousClass1();

        private /* synthetic */ AnonymousClass1() {
        }

        @Override // o.PercentLayoutHelper
        public final void ag$a(Exception exc) {
            setValueIndex.ag$a(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract fetchWidthAndHeight<?, byte[]> ag$a();

    public abstract findPreference ah$a();

    public abstract String ah$b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract shouldHandleMeasuredWidthTooSmall<?> valueOf();

    public abstract ZipUtil.CentralDirectory values();

    public byte[] HaptikSDK$b() {
        return ag$a().valueOf(valueOf().ag$a());
    }

    public static DropDownPreference$ah$a HaptikSDK$c() {
        return new getNegativeButtonText.toString();
    }
}
