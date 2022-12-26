package o;

import com.app.dream11.core.service.graphql.api.type.UserVerificationStatus;
import com.app.dream11.core.service.graphql.api.verification.pan.PanDetailsQuery;
/* loaded from: classes3.dex */
public final class blendARGB {
    public static final XYZToColor valueOf(PanDetailsQuery.Data data) {
        runAnimators.ag$a(data, "<this>");
        PanDetailsQuery.GetPanDetails getPanDetails = data.getGetPanDetails();
        String userFullName = getPanDetails == null ? null : getPanDetails.getUserFullName();
        PanDetailsQuery.GetPanDetails getPanDetails2 = data.getGetPanDetails();
        String pan = getPanDetails2 == null ? null : getPanDetails2.getPan();
        PanDetailsQuery.GetPanDetails getPanDetails3 = data.getGetPanDetails();
        String maskedPan = getPanDetails3 == null ? null : getPanDetails3.getMaskedPan();
        PanDetailsQuery.GetPanDetails getPanDetails4 = data.getGetPanDetails();
        String dateOfBirth = getPanDetails4 == null ? null : getPanDetails4.getDateOfBirth();
        PanDetailsQuery.GetPanDetails getPanDetails5 = data.getGetPanDetails();
        UserVerificationStatus status = getPanDetails5 == null ? null : getPanDetails5.getStatus();
        if (status == null) {
            status = UserVerificationStatus.NOT_SUBMITTED;
        }
        UserVerificationStatus userVerificationStatus = status;
        PanDetailsQuery.GetPanDetails getPanDetails6 = data.getGetPanDetails();
        String comments = getPanDetails6 == null ? null : getPanDetails6.getComments();
        PanDetailsQuery.GetPanDetails getPanDetails7 = data.getGetPanDetails();
        return new XYZToColor(pan, maskedPan, userFullName, dateOfBirth, userVerificationStatus, comments, getPanDetails7 != null ? getPanDetails7.getInReviewMessage() : null);
    }
}
