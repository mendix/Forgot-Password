// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailtemplate.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the EmailTemplate module
	public static boolean bCo_EmailSettings(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("EmailTemplate.BCo_EmailSettings").withParams(params).execute(context);
	}
	public static java.lang.Long countNrOfTemplates(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Long) Core.microflowCall("EmailTemplate.CountNrOfTemplates").withParams(params).execute(context);
	}
	public static emailtemplate.proxies.ModuleSetup dS_CheckForSetup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("EmailTemplate.DS_CheckForSetup").withParams(params).execute(context);
		return result == null ? null : emailtemplate.proxies.ModuleSetup.initialize(context, result);
	}
	public static emailtemplate.proxies.EmailSettings dS_GetEmailSettings(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("EmailTemplate.DS_GetEmailSettings").withParams(params).execute(context);
		return result == null ? null : emailtemplate.proxies.EmailSettings.initialize(context, result);
	}
	public static emailtemplate.proxies.EmailTemplate dS_GetFirstTemplate(IContext context, emailtemplate.proxies.ModuleSetup _moduleSetup)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ModuleSetup", _moduleSetup == null ? null : _moduleSetup.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("EmailTemplate.DS_GetFirstTemplate").withParams(params).execute(context);
		return result == null ? null : emailtemplate.proxies.EmailTemplate.initialize(context, result);
	}
	public static emailtemplate.proxies.ModelReflectionChecker dS_LoadModelReflectionHelper(IContext context, emailtemplate.proxies.EmailTemplate _emailTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailTemplate", _emailTemplate == null ? null : _emailTemplate.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("EmailTemplate.DS_LoadModelReflectionHelper").withParams(params).execute(context);
		return result == null ? null : emailtemplate.proxies.ModelReflectionChecker.initialize(context, result);
	}
	public static void iVK_ChangePortSSL(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_ChangePortSSL").withParams(params).execute(context);
	}
	public static void iVK_ChangePortTLS(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_ChangePortTLS").withParams(params).execute(context);
	}
	public static void iVK_CreateTestEmail(IContext context, emailtemplate.proxies.ModuleSetup _moduleSetup)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ModuleSetup", _moduleSetup == null ? null : _moduleSetup.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_CreateTestEmail").withParams(params).execute(context);
	}
	public static void iVK_CreateTestMessage(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_CreateTestMessage").withParams(params).execute(context);
	}
	public static void iVK_DeleteToken(IContext context, mxmodelreflection.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_DeleteToken").withParams(params).execute(context);
	}
	public static void iVK_DownloadAttachment(IContext context, emailtemplate.proxies.Attachment _attachment)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Attachment", _attachment == null ? null : _attachment.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_DownloadAttachment").withParams(params).execute(context);
	}
	public static void iVK_DuplicateEmailTemplate(IContext context, emailtemplate.proxies.EmailTemplate _emailTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailTemplate", _emailTemplate == null ? null : _emailTemplate.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_DuplicateEmailTemplate").withParams(params).execute(context);
	}
	public static void iVK_EmailSettingsWizard_edit(IContext context, emailtemplate.proxies.TestMessage _testMessage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestMessage", _testMessage == null ? null : _testMessage.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_EmailSettingsWizard_edit").withParams(params).execute(context);
	}
	public static void iVK_Emailtemplate_NewToken(IContext context, emailtemplate.proxies.EmailTemplate _emailTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailTemplate", _emailTemplate == null ? null : _emailTemplate.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_Emailtemplate_NewToken").withParams(params).execute(context);
	}
	public static void iVK_GeneratePlainText(IContext context, emailtemplate.proxies.EmailTemplate _emailTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailTemplate", _emailTemplate == null ? null : _emailTemplate.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_GeneratePlainText").withParams(params).execute(context);
	}
	public static void iVK_OpenModelReflection(IContext context, emailtemplate.proxies.ModelReflectionChecker _modelReflectionChecker, emailtemplate.proxies.EmailTemplate _emailTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ModelReflectionChecker", _modelReflectionChecker == null ? null : _modelReflectionChecker.getMendixObject());
		params.put("EmailTemplate", _emailTemplate == null ? null : _emailTemplate.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_OpenModelReflection").withParams(params).execute(context);
	}
	public static void iVK_ResendFailedEmail(IContext context, emailtemplate.proxies.Email _email)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Email", _email == null ? null : _email.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_ResendFailedEmail").withParams(params).execute(context);
	}
	public static void iVK_ResendFailedEmails(IContext context, java.util.List<emailtemplate.proxies.Email> _emailList)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_emailList = null;
		if (_emailList != null)
		{
			listparam_emailList = new java.util.ArrayList<>();
			for (emailtemplate.proxies.Email obj : _emailList)
				listparam_emailList.add(obj.getMendixObject());
		}
		params.put("EmailList", listparam_emailList);

		Core.microflowCall("EmailTemplate.IVK_ResendFailedEmails").withParams(params).execute(context);
	}
	public static void iVK_SaveEmailSettings(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SaveEmailSettings").withParams(params).execute(context);
	}
	public static void iVK_SaveEmailSettingsFromTestMessage(IContext context, emailtemplate.proxies.TestMessage _testMessage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestMessage", _testMessage == null ? null : _testMessage.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SaveEmailSettingsFromTestMessage").withParams(params).execute(context);
	}
	public static void iVK_SaveEmailTemplate(IContext context, emailtemplate.proxies.EmailTemplate _emailTemplate)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailTemplate", _emailTemplate == null ? null : _emailTemplate.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SaveEmailTemplate").withParams(params).execute(context);
	}
	public static void iVK_SaveStep1(IContext context, emailtemplate.proxies.TestMessage _testMessage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestMessage", _testMessage == null ? null : _testMessage.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SaveStep1").withParams(params).execute(context);
	}
	public static void iVK_SaveStep2(IContext context, emailtemplate.proxies.ModuleSetup _moduleSetup)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ModuleSetup", _moduleSetup == null ? null : _moduleSetup.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SaveStep2").withParams(params).execute(context);
	}
	public static void iVK_SendEmail(IContext context, emailtemplate.proxies.Email _newEmail)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("NewEmail", _newEmail == null ? null : _newEmail.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SendEmail").withParams(params).execute(context);
	}
	public static void iVK_SendTestMessage(IContext context, emailtemplate.proxies.TestMessage _testMessage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestMessage", _testMessage == null ? null : _testMessage.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SendTestMessage").withParams(params).execute(context);
	}
	public static void iVK_SkipTestEmail(IContext context, emailtemplate.proxies.TestMessage _testMessage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestMessage", _testMessage == null ? null : _testMessage.getMendixObject());
		Core.microflowCall("EmailTemplate.IVK_SkipTestEmail").withParams(params).execute(context);
	}
	public static void oC_SSL(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.OC_SSL").withParams(params).execute(context);
	}
	public static void oC_TLS(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.OC_TLS").withParams(params).execute(context);
	}
	public static void oCh_SSL(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.OCh_SSL").withParams(params).execute(context);
	}
	public static void oCh_TLS(IContext context, emailtemplate.proxies.EmailSettings _emailSettings)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		Core.microflowCall("EmailTemplate.OCh_TLS").withParams(params).execute(context);
	}
	public static void sE_Cleanup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("EmailTemplate.SE_Cleanup").withParams(params).execute(context);
	}
	public static void sE_SendQueuedEmails(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("EmailTemplate.SE_SendQueuedEmails").withParams(params).execute(context);
	}
	public static boolean sendEmailMessage(IContext context, java.lang.String _from, java.lang.String _to, java.lang.String _subject, java.lang.String _hTMLBody, java.lang.String _plainTextBody, java.lang.String _cC, java.lang.String _bCC, emailtemplate.proxies.EmailSettings _emailSettings, java.util.List<emailtemplate.proxies.Attachment> _attachmentList, java.util.List<emailtemplate.proxies.Header> _headerList, java.lang.String _replyTo, java.lang.String _fromDisplayName)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("From", _from);
		params.put("To", _to);
		params.put("Subject", _subject);
		params.put("HTMLBody", _hTMLBody);
		params.put("PlainTextBody", _plainTextBody);
		params.put("CC", _cC);
		params.put("BCC", _bCC);
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		java.util.ArrayList<IMendixObject> listparam_attachmentList = null;
		if (_attachmentList != null)
		{
			listparam_attachmentList = new java.util.ArrayList<>();
			for (emailtemplate.proxies.Attachment obj : _attachmentList)
				listparam_attachmentList.add(obj.getMendixObject());
		}
		params.put("AttachmentList", listparam_attachmentList);

		java.util.ArrayList<IMendixObject> listparam_headerList = null;
		if (_headerList != null)
		{
			listparam_headerList = new java.util.ArrayList<>();
			for (emailtemplate.proxies.Header obj : _headerList)
				listparam_headerList.add(obj.getMendixObject());
		}
		params.put("HeaderList", listparam_headerList);

		params.put("ReplyTo", _replyTo);
		params.put("FromDisplayName", _fromDisplayName);
		return (java.lang.Boolean) Core.microflowCall("EmailTemplate.SendEmailMessage").withParams(params).execute(context);
	}
	public static java.util.List<emailtemplate.proxies.Attachment> sub_CreateAttachments(IContext context, java.util.List<system.proxies.FileDocument> _fileDocumentList, emailtemplate.proxies.Email _email)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_fileDocumentList = null;
		if (_fileDocumentList != null)
		{
			listparam_fileDocumentList = new java.util.ArrayList<>();
			for (system.proxies.FileDocument obj : _fileDocumentList)
				listparam_fileDocumentList.add(obj.getMendixObject());
		}
		params.put("FileDocumentList", listparam_fileDocumentList);

		params.put("Email", _email == null ? null : _email.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("EmailTemplate.Sub_CreateAttachments").withParams(params).execute(context);
		java.util.List<emailtemplate.proxies.Attachment> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(emailtemplate.proxies.Attachment.initialize(context, obj));
		}
		return result;
	}
	public static void sub_CreateLogItem(IContext context, java.lang.String _triggeredInMF, emailtemplate.proxies.LogType _logType, java.lang.String _message, java.lang.String _errorMessage, java.lang.String _stackTrace)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TriggeredInMF", _triggeredInMF);
		params.put("LogType", _logType == null ? null : _logType.name());
		params.put("Message", _message);
		params.put("ErrorMessage", _errorMessage);
		params.put("StackTrace", _stackTrace);
		Core.microflowCall("EmailTemplate.Sub_CreateLogItem").withParams(params).execute(context);
	}
	public static java.util.List<mxmodelreflection.proxies.Token> sub_DuplicateTokenList(IContext context, java.util.List<mxmodelreflection.proxies.Token> _tokenList)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_tokenList = null;
		if (_tokenList != null)
		{
			listparam_tokenList = new java.util.ArrayList<>();
			for (mxmodelreflection.proxies.Token obj : _tokenList)
				listparam_tokenList.add(obj.getMendixObject());
		}
		params.put("TokenList", listparam_tokenList);

		java.util.List<IMendixObject> objs = Core.microflowCall("EmailTemplate.Sub_DuplicateTokenList").withParams(params).execute(context);
		java.util.List<mxmodelreflection.proxies.Token> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(mxmodelreflection.proxies.Token.initialize(context, obj));
		}
		return result;
	}
	public static void sub_SendQueuedEmail(IContext context, emailtemplate.proxies.Email _email, emailtemplate.proxies.EmailSettings _emailSettings, java.lang.String _decryptedPassword)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Email", _email == null ? null : _email.getMendixObject());
		params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
		params.put("DecryptedPassword", _decryptedPassword);
		Core.microflowCall("EmailTemplate.Sub_SendQueuedEmail").withParams(params).execute(context);
	}
	public static void sub_SendSimpleEmail(IContext context, java.lang.String _to)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("To", _to);
		Core.microflowCall("EmailTemplate.Sub_SendSimpleEmail").withParams(params).execute(context);
	}
}