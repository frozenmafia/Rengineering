package o;

import com.app.dream11.core.service.graphql.api.type.UserVerificationStatus;
import com.app.dream11.core.service.graphql.api.verification.bank.BankDetailsQuery;
/* loaded from: classes3.dex */
public final class getRgbD {
    public static final getNbb ah$a(BankDetailsQuery.Data data) {
        runAnimators.ag$a(data, "<this>");
        BankDetailsQuery.GetBankDetails getBankDetails = data.getGetBankDetails();
        String accountNo = getBankDetails == null ? null : getBankDetails.getAccountNo();
        BankDetailsQuery.GetBankDetails getBankDetails2 = data.getGetBankDetails();
        String maskedAccountNo = getBankDetails2 == null ? null : getBankDetails2.getMaskedAccountNo();
        BankDetailsQuery.GetBankDetails getBankDetails3 = data.getGetBankDetails();
        String ifsc = getBankDetails3 == null ? null : getBankDetails3.getIfsc();
        BankDetailsQuery.GetBankDetails getBankDetails4 = data.getGetBankDetails();
        String nameOfBank = getBankDetails4 == null ? null : getBankDetails4.getNameOfBank();
        BankDetailsQuery.GetBankDetails getBankDetails5 = data.getGetBankDetails();
        String branchName = getBankDetails5 == null ? null : getBankDetails5.getBranchName();
        BankDetailsQuery.GetBankDetails getBankDetails6 = data.getGetBankDetails();
        Integer valueOf = getBankDetails6 == null ? null : Integer.valueOf(getBankDetails6.getStateId());
        BankDetailsQuery.GetBankDetails getBankDetails7 = data.getGetBankDetails();
        String stateName = getBankDetails7 == null ? null : getBankDetails7.getStateName();
        BankDetailsQuery.GetBankDetails getBankDetails8 = data.getGetBankDetails();
        UserVerificationStatus status = getBankDetails8 == null ? null : getBankDetails8.getStatus();
        if (status == null) {
            status = UserVerificationStatus.NOT_SUBMITTED;
        }
        UserVerificationStatus userVerificationStatus = status;
        BankDetailsQuery.GetBankDetails getBankDetails9 = data.getGetBankDetails();
        String comments = getBankDetails9 == null ? null : getBankDetails9.getComments();
        BankDetailsQuery.GetBankDetails getBankDetails10 = data.getGetBankDetails();
        return new getNbb(accountNo, maskedAccountNo, ifsc, nameOfBank, branchName, valueOf, stateName, userVerificationStatus, comments, getBankDetails10 != null ? getBankDetails10.getInReviewMessage() : null);
    }
}
