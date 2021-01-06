package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(deeplink.actions.ExecuteDeeplink.class);
    registrator.registerUserAction(deeplink.actions.GetApplicationUrl.class);
    registrator.registerUserAction(deeplink.actions.GetCurrentSessionID.class);
    registrator.registerUserAction(deeplink.actions.ReadMicroflows.class);
    registrator.registerUserAction(deeplink.actions.StartDeeplinkJava.class);
    registrator.registerUserAction(emailtemplate.actions.ConvertHTMLBodyToPlainText.class);
    registrator.registerUserAction(emailtemplate.actions.CopyAttachmentContent.class);
    registrator.registerUserAction(emailtemplate.actions.ReplaceCustomToken.class);
    registrator.registerUserAction(emailtemplate.actions.ReplaceEmailTemplateTokens.class);
    registrator.registerUserAction(emailtemplate.actions.SendEmail.class);
    registrator.registerUserAction(encryption.actions.DecryptString.class);
    registrator.registerUserAction(encryption.actions.EncryptString.class);
    registrator.registerUserAction(encryption.actions.GeneratePGPKeyRing.class);
    registrator.registerUserAction(encryption.actions.PGPDecryptDocument.class);
    registrator.registerUserAction(encryption.actions.PGPEncryptDocument.class);
    registrator.registerUserAction(encryption.actions.ValidatePrivateKeyRing.class);
    registrator.registerUserAction(forgotpassword.actions.GenerateRandomPassword.class);
    registrator.registerUserAction(forgotpassword.actions.GenerateURL.class);
    registrator.registerUserAction(forgotpassword.actions.GenerateUUID.class);
    registrator.registerUserAction(forgotpassword.actions.SignIn.class);
    registrator.registerUserAction(mxmodelreflection.actions.ReplaceToken.class);
    registrator.registerUserAction(mxmodelreflection.actions.SyncObjects.class);
    registrator.registerUserAction(mxmodelreflection.actions.TestThePattern.class);
    registrator.registerUserAction(mxmodelreflection.actions.ValidateTokensInMessage.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
