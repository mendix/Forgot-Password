// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package forgotpassword.proxies;

public class AccountPasswordData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject accountPasswordDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ForgotPassword.AccountPasswordData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NewPassword("NewPassword"),
		ConfirmPassword("ConfirmPassword"),
		AccountPasswordData_ForgotPassword("ForgotPassword.AccountPasswordData_ForgotPassword");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public AccountPasswordData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ForgotPassword.AccountPasswordData"));
	}

	protected AccountPasswordData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accountPasswordDataMendixObject)
	{
		if (accountPasswordDataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ForgotPassword.AccountPasswordData", accountPasswordDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ForgotPassword.AccountPasswordData");

		this.accountPasswordDataMendixObject = accountPasswordDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AccountPasswordData.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static forgotpassword.proxies.AccountPasswordData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return forgotpassword.proxies.AccountPasswordData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static forgotpassword.proxies.AccountPasswordData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new forgotpassword.proxies.AccountPasswordData(context, mendixObject);
	}

	public static forgotpassword.proxies.AccountPasswordData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return forgotpassword.proxies.AccountPasswordData.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of NewPassword
	 */
	public final java.lang.String getNewPassword()
	{
		return getNewPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of NewPassword
	 */
	public final java.lang.String getNewPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NewPassword.toString());
	}

	/**
	 * Set value of NewPassword
	 * @param newpassword
	 */
	public final void setNewPassword(java.lang.String newpassword)
	{
		setNewPassword(getContext(), newpassword);
	}

	/**
	 * Set value of NewPassword
	 * @param context
	 * @param newpassword
	 */
	public final void setNewPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String newpassword)
	{
		getMendixObject().setValue(context, MemberNames.NewPassword.toString(), newpassword);
	}

	/**
	 * @return value of ConfirmPassword
	 */
	public final java.lang.String getConfirmPassword()
	{
		return getConfirmPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfirmPassword
	 */
	public final java.lang.String getConfirmPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ConfirmPassword.toString());
	}

	/**
	 * Set value of ConfirmPassword
	 * @param confirmpassword
	 */
	public final void setConfirmPassword(java.lang.String confirmpassword)
	{
		setConfirmPassword(getContext(), confirmpassword);
	}

	/**
	 * Set value of ConfirmPassword
	 * @param context
	 * @param confirmpassword
	 */
	public final void setConfirmPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String confirmpassword)
	{
		getMendixObject().setValue(context, MemberNames.ConfirmPassword.toString(), confirmpassword);
	}

	/**
	 * @return value of AccountPasswordData_ForgotPassword
	 */
	public final forgotpassword.proxies.ForgotPassword getAccountPasswordData_ForgotPassword() throws com.mendix.core.CoreException
	{
		return getAccountPasswordData_ForgotPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of AccountPasswordData_ForgotPassword
	 */
	public final forgotpassword.proxies.ForgotPassword getAccountPasswordData_ForgotPassword(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		forgotpassword.proxies.ForgotPassword result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AccountPasswordData_ForgotPassword.toString());
		if (identifier != null)
			result = forgotpassword.proxies.ForgotPassword.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AccountPasswordData_ForgotPassword
	 * @param accountpassworddata_forgotpassword
	 */
	public final void setAccountPasswordData_ForgotPassword(forgotpassword.proxies.ForgotPassword accountpassworddata_forgotpassword)
	{
		setAccountPasswordData_ForgotPassword(getContext(), accountpassworddata_forgotpassword);
	}

	/**
	 * Set value of AccountPasswordData_ForgotPassword
	 * @param context
	 * @param accountpassworddata_forgotpassword
	 */
	public final void setAccountPasswordData_ForgotPassword(com.mendix.systemwideinterfaces.core.IContext context, forgotpassword.proxies.ForgotPassword accountpassworddata_forgotpassword)
	{
		if (accountpassworddata_forgotpassword == null)
			getMendixObject().setValue(context, MemberNames.AccountPasswordData_ForgotPassword.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AccountPasswordData_ForgotPassword.toString(), accountpassworddata_forgotpassword.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return accountPasswordDataMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final forgotpassword.proxies.AccountPasswordData that = (forgotpassword.proxies.AccountPasswordData) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ForgotPassword.AccountPasswordData";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
