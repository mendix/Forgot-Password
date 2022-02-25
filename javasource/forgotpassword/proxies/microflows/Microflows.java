// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package forgotpassword.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the ForgotPassword module
	public static boolean cA_ConfigurationHasDeeplink(IContext context, forgotpassword.proxies.Configuration _configuration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("ForgotPassword.CA_ConfigurationHasDeeplink").withParams(params).execute(context);
	}
	public static boolean cA_ConfigurationHasEmailTemplate_Reset(IContext context, forgotpassword.proxies.Configuration _configuration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("ForgotPassword.CA_ConfigurationHasEmailTemplate_Reset").withParams(params).execute(context);
	}
	public static boolean cA_ConfigurationHasEmailTemplate_Signup(IContext context, forgotpassword.proxies.Configuration _configuration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("ForgotPassword.CA_ConfigurationHasEmailTemplate_Signup").withParams(params).execute(context);
	}
	public static void createNewUserFromSignup(IContext context, forgotpassword.proxies.ForgotPassword _forgotPassword)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ForgotPassword", _forgotPassword == null ? null : _forgotPassword.getMendixObject());
		Core.microflowCall("ForgotPassword.CreateNewUserFromSignup").withParams(params).execute(context);
	}
	public static forgotpassword.proxies.Configuration dV_GetConfiguration(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("ForgotPassword.DV_GetConfiguration").withParams(params).execute(context);
		return result == null ? null : forgotpassword.proxies.Configuration.initialize(context, result);
	}
	public static void generateUIDAndURL(IContext context, forgotpassword.proxies.ForgotPassword _forgotPassword)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ForgotPassword", _forgotPassword == null ? null : _forgotPassword.getMendixObject());
		Core.microflowCall("ForgotPassword.GenerateUIDAndURL").withParams(params).execute(context);
	}
	public static java.util.Date getValidUntilDateTime(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.util.Date) Core.microflowCall("ForgotPassword.GetValidUntilDateTime").withParams(params).execute(context);
	}
	public static void iVK_CreateDeeplink(IContext context, forgotpassword.proxies.Configuration _configuration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
		Core.microflowCall("ForgotPassword.IVK_CreateDeeplink").withParams(params).execute(context);
	}
	public static void iVK_CreateEmailTemplate_Reset(IContext context, forgotpassword.proxies.Configuration _configuration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
		Core.microflowCall("ForgotPassword.IVK_CreateEmailTemplate_Reset").withParams(params).execute(context);
	}
	public static void iVK_CreateEmailTemplate_Signup(IContext context, forgotpassword.proxies.Configuration _configuration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Configuration", _configuration == null ? null : _configuration.getMendixObject());
		Core.microflowCall("ForgotPassword.IVK_CreateEmailTemplate_Signup").withParams(params).execute(context);
	}
	public static void mB_Step2_SendConfirmationEmail(IContext context, forgotpassword.proxies.SignupHelper _signupHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SignupHelper", _signupHelper == null ? null : _signupHelper.getMendixObject());
		Core.microflowCall("ForgotPassword.MB_Step2_SendConfirmationEmail").withParams(params).execute(context);
	}
	public static void nav_GuestHomePage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("ForgotPassword.Nav_GuestHomePage").withParams(params).execute(context);
	}
	public static boolean sF_CheckForDuplicateAccount(IContext context, java.lang.String _email)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Email", _email);
		return (java.lang.Boolean) Core.microflowCall("ForgotPassword.SF_CheckForDuplicateAccount").withParams(params).execute(context);
	}
	public static boolean sF_CreateAndSendEmail(IContext context, forgotpassword.proxies.ForgotPassword _forgotPassword, boolean _isSignUp)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ForgotPassword", _forgotPassword == null ? null : _forgotPassword.getMendixObject());
		params.put("IsSignUp", _isSignUp);
		return (java.lang.Boolean) Core.microflowCall("ForgotPassword.SF_CreateAndSendEmail").withParams(params).execute(context);
	}
	public static forgotpassword.proxies.ForgotPassword sF_CreateForgotPasswordRequest(IContext context, java.lang.String _emailAddress)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailAddress", _emailAddress);
		IMendixObject result = (IMendixObject)Core.microflowCall("ForgotPassword.SF_CreateForgotPasswordRequest").withParams(params).execute(context);
		return result == null ? null : forgotpassword.proxies.ForgotPassword.initialize(context, result);
	}
	public static void sF_SendEmailRecoverPassword(IContext context, java.lang.String _emailAddress)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailAddress", _emailAddress);
		Core.microflowCall("ForgotPassword.SF_SendEmailRecoverPassword").withParams(params).execute(context);
	}
	public static void step1_ShowForgotPasswordPage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("ForgotPassword.Step1_ShowForgotPasswordPage").withParams(params).execute(context);
	}
	public static void step1_ShowSignupPage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("ForgotPassword.Step1_ShowSignupPage").withParams(params).execute(context);
	}
	public static void step2_SendEmailRecoverPassword(IContext context, forgotpassword.proxies.ForgotPasswordHelper _forgotPasswordHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ForgotPasswordHelper", _forgotPasswordHelper == null ? null : _forgotPasswordHelper.getMendixObject());
		Core.microflowCall("ForgotPassword.Step2_SendEmailRecoverPassword").withParams(params).execute(context);
	}
	public static void step3_DL_SetNewPassword(IContext context, java.lang.String _gUID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("GUID", _gUID);
		Core.microflowCall("ForgotPassword.Step3_DL_SetNewPassword").withParams(params).execute(context);
	}
	public static void step4_SubmitPassword(IContext context, forgotpassword.proxies.AccountPasswordData _accountPasswordData)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AccountPasswordData", _accountPasswordData == null ? null : _accountPasswordData.getMendixObject());
		Core.microflowCall("ForgotPassword.Step4_SubmitPassword").withParams(params).execute(context);
	}
	public static boolean userAccountValidation(IContext context, java.lang.String _emailAddress)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("EmailAddress", _emailAddress);
		return (java.lang.Boolean) Core.microflowCall("ForgotPassword.UserAccountValidation").withParams(params).execute(context);
	}
}