package o;
/* loaded from: classes4.dex */
public final class EmojiSpan {
    public static final EmojiSpan ag$a = new EmojiSpan();

    private EmojiSpan() {
    }

    public final String ag$a(String str, String str2, String str3) {
        runAnimators.ag$a(str, "customerIdInputField");
        runAnimators.ag$a(str2, "passwordInputField");
        runAnimators.ag$a(str3, "submitButton");
        return "javascript:( function() {  var customerIdInputField = " + str + ";  var passwordInputField = " + str2 + ";  var submitButton = " + str3 + ";  if(customerIdInputField) { customerIdInputField.addEventListener('focus', function() { window.JSInterface.onCustomerIdInputFieldFocused(); }, false); }  if(passwordInputField) { passwordInputField.addEventListener('focus', function() { window.JSInterface.onPasswordInputFieldFocused(); }, false); }  var customerIdInputFieldExist = false; var submitButtonExist = false; var passwordInputFieldExist = false;  if(customerIdInputField) { customerIdInputFieldExist = true; }  if(submitButton) { submitButtonExist = true; }  if(passwordInputField) { passwordInputFieldExist = true; }  window.JSInterface.loginElementsExist(customerIdInputFieldExist, passwordInputFieldExist, submitButtonExist); })()";
    }

    public final String valueOf(String str) {
        runAnimators.ag$a(str, "submitButton");
        return "javascript:(function() {  var submitButton = " + str + "; submitButton.click(); })();";
    }

    public final String valueOf(String str, String str2) {
        runAnimators.ag$a(str, "customerIdInputField");
        runAnimators.ag$a(str2, "customerId");
        return "javascript:(function(inputValue) {  var customerIdInputField = " + str + "; customerIdInputField.value = inputValue; })('" + str2 + "');";
    }

    public final String values(String str) {
        runAnimators.ag$a(str, "inputField");
        return "javascript:(function() {  var inputField = " + str + ";  inputField.focus(); })();";
    }

    public final String ag$a(String str, String str2) {
        runAnimators.ag$a(str, "inputField");
        runAnimators.ag$a(str2, "tag");
        return "javascript:(function(tag) {  var inputField = " + str + "; inputField.addEventListener('input', function (evt) { window.JSInterface.onInputFieldTextChanged(this.value, tag);})})('" + str2 + "');";
    }

    public final String values(String str, String str2) {
        runAnimators.ag$a(str, "button");
        runAnimators.ag$a(str2, "tag");
        return "javascript:(function(tag) { var btn = " + str + "; btn.addEventListener('click', function(event){ window.JSInterface.onWebPageButtonClicked(tag); })})('" + str2 + "');";
    }
}
