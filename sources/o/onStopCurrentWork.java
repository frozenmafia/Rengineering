package o;

import com.app.dream11.core.service.graphql.api.type.UserVerificationStatus;
import o.enqueueWork;
/* loaded from: classes3.dex */
public final class onStopCurrentWork {
    public static final onStopCurrentWork valueOf = new onStopCurrentWork();

    private onStopCurrentWork() {
    }

    public final int ah$a(dequeueWork dequeuework) {
        runAnimators.ag$a(dequeuework, "type");
        return dequeuework.values() instanceof enqueueWork.values ? com.app.dream11Pro.R.color.d11_color_bg__positiveLightest : dequeuework.ah$a() == UserVerificationStatus.INREVIEW ? com.app.dream11Pro.R.color.d11_color_bg__warningLighter : (dequeuework.ah$a() == UserVerificationStatus.REJECTED || (dequeuework.values() instanceof enqueueWork$ag$a)) ? com.app.dream11Pro.R.color.d11_color_bg__negativeLightest : dequeuework.values() instanceof enqueueWork.toString ? com.app.dream11Pro.R.color.d11_color_border__negativeLighter : com.app.dream11Pro.R.color.d11_color_bg__transparent;
    }

    public final int valueOf(dequeueWork dequeuework) {
        runAnimators.ag$a(dequeuework, "type");
        return (!(dequeuework.values() instanceof enqueueWork.values) && dequeuework.ah$a() == UserVerificationStatus.REJECTED) ? com.app.dream11Pro.R.drawable.ic_verification_rejected : com.app.dream11Pro.R.drawable.ic_fair_play;
    }

    public final int ag$a(dequeueWork dequeuework) {
        runAnimators.ag$a(dequeuework, "type");
        return dequeuework.values() instanceof enqueueWork.values ? com.app.dream11Pro.R.color.d11_color_icon__positiveDark : dequeuework.ah$a() == UserVerificationStatus.INREVIEW ? com.app.dream11Pro.R.color.d11_color_icon__warningDark : (dequeuework.ah$a() == UserVerificationStatus.REJECTED || (dequeuework.values() instanceof enqueueWork$ag$a) || (dequeuework.values() instanceof enqueueWork.toString)) ? com.app.dream11Pro.R.color.d11_color_icon__negativeDark : com.app.dream11Pro.R.color.d11_color_bg__transparent;
    }

    public final int values(dequeueWork dequeuework) {
        runAnimators.ag$a(dequeuework, "type");
        if (dequeuework.values() instanceof enqueueWork.values) {
            return com.app.dream11Pro.R.color.d11_color_border__positiveLighter;
        }
        if (dequeuework.ah$a() == UserVerificationStatus.INREVIEW) {
            return com.app.dream11Pro.R.color.d11_color_border__warningLighter;
        }
        if (dequeuework.ah$a() != UserVerificationStatus.REJECTED) {
            if (dequeuework.values() instanceof enqueueWork$ag$a) {
                return com.app.dream11Pro.R.color.d11_color_border__negativeLighter;
            }
            if (!(dequeuework.values() instanceof enqueueWork.toString)) {
                return com.app.dream11Pro.R.color.d11_color_border__transparent;
            }
        }
        return com.app.dream11Pro.R.color.d11_color_border__negativeLight;
    }

    public final int toString(dequeueWork dequeuework) {
        runAnimators.ag$a(dequeuework, "type");
        return dequeuework.values() instanceof enqueueWork.values ? com.app.dream11Pro.R.color.d11_color_text__positiveDark : dequeuework.ah$a() == UserVerificationStatus.INREVIEW ? com.app.dream11Pro.R.color.d11_color_text__warningDark : (dequeuework.ah$a() == UserVerificationStatus.REJECTED || (dequeuework.values() instanceof enqueueWork$ag$a) || (dequeuework.values() instanceof enqueueWork.toString)) ? com.app.dream11Pro.R.color.d11_color_text__negativeDark : com.app.dream11Pro.R.color.d11_color_bg__transparent;
    }
}
