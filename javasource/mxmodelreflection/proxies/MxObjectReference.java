// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public class MxObjectReference
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxObjectReferenceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.MxObjectReference";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CompleteName("CompleteName"),
		Module("Module"),
		Name("Name"),
		ReadableName("ReadableName"),
		ReferenceType("ReferenceType"),
		AssociationOwner("AssociationOwner"),
		ParentEntity("ParentEntity"),
		MxObjectReference_MxObjectType("MxModelReflection.MxObjectReference_MxObjectType"),
		MxObjectReference_MxObjectType_Child("MxModelReflection.MxObjectReference_MxObjectType_Child"),
		MxObjectReference_MxObjectType_Parent("MxModelReflection.MxObjectReference_MxObjectType_Parent"),
		MxObjectReference_Module("MxModelReflection.MxObjectReference_Module");

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

	public MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxModelReflection.MxObjectReference"));
	}

	protected MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxObjectReferenceMendixObject)
	{
		if (mxObjectReferenceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxModelReflection.MxObjectReference", mxObjectReferenceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxModelReflection.MxObjectReference");

		this.mxObjectReferenceMendixObject = mxObjectReferenceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxObjectReference.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxmodelreflection.proxies.MxObjectReference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.MxObjectReference.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.MxObjectReference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.MxObjectReference(context, mendixObject);
	}

	public static mxmodelreflection.proxies.MxObjectReference load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.MxObjectReference.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.MxObjectReference> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectReference> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectReference>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxModelReflection.MxObjectReference" + xpathConstraint))
			result.add(mxmodelreflection.proxies.MxObjectReference.initialize(context, obj));
		return result;
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
	 * @return value of CompleteName
	 */
	public final java.lang.String getCompleteName()
	{
		return getCompleteName(getContext());
	}

	/**
	 * @param context
	 * @return value of CompleteName
	 */
	public final java.lang.String getCompleteName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CompleteName.toString());
	}

	/**
	 * Set value of CompleteName
	 * @param completename
	 */
	public final void setCompleteName(java.lang.String completename)
	{
		setCompleteName(getContext(), completename);
	}

	/**
	 * Set value of CompleteName
	 * @param context
	 * @param completename
	 */
	public final void setCompleteName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String completename)
	{
		getMendixObject().setValue(context, MemberNames.CompleteName.toString(), completename);
	}

	/**
	 * @return value of Module
	 */
	public final java.lang.String getModule()
	{
		return getModule(getContext());
	}

	/**
	 * @param context
	 * @return value of Module
	 */
	public final java.lang.String getModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Module.toString());
	}

	/**
	 * Set value of Module
	 * @param module
	 */
	public final void setModule(java.lang.String module)
	{
		setModule(getContext(), module);
	}

	/**
	 * Set value of Module
	 * @param context
	 * @param module
	 */
	public final void setModule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String module)
	{
		getMendixObject().setValue(context, MemberNames.Module.toString(), module);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of ReadableName
	 */
	public final java.lang.String getReadableName()
	{
		return getReadableName(getContext());
	}

	/**
	 * @param context
	 * @return value of ReadableName
	 */
	public final java.lang.String getReadableName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ReadableName.toString());
	}

	/**
	 * Set value of ReadableName
	 * @param readablename
	 */
	public final void setReadableName(java.lang.String readablename)
	{
		setReadableName(getContext(), readablename);
	}

	/**
	 * Set value of ReadableName
	 * @param context
	 * @param readablename
	 */
	public final void setReadableName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String readablename)
	{
		getMendixObject().setValue(context, MemberNames.ReadableName.toString(), readablename);
	}

	/**
	 * Set value of ReferenceType
	 * @param referencetype
	 */
	public final mxmodelreflection.proxies.ReferenceType getReferenceType()
	{
		return getReferenceType(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceType
	 */
	public final mxmodelreflection.proxies.ReferenceType getReferenceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ReferenceType.toString());
		if (obj == null)
			return null;

		return mxmodelreflection.proxies.ReferenceType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ReferenceType
	 * @param referencetype
	 */
	public final void setReferenceType(mxmodelreflection.proxies.ReferenceType referencetype)
	{
		setReferenceType(getContext(), referencetype);
	}

	/**
	 * Set value of ReferenceType
	 * @param context
	 * @param referencetype
	 */
	public final void setReferenceType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.ReferenceType referencetype)
	{
		if (referencetype != null)
			getMendixObject().setValue(context, MemberNames.ReferenceType.toString(), referencetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ReferenceType.toString(), null);
	}

	/**
	 * Set value of AssociationOwner
	 * @param associationowner
	 */
	public final mxmodelreflection.proxies.AssociationOwner getAssociationOwner()
	{
		return getAssociationOwner(getContext());
	}

	/**
	 * @param context
	 * @return value of AssociationOwner
	 */
	public final mxmodelreflection.proxies.AssociationOwner getAssociationOwner(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AssociationOwner.toString());
		if (obj == null)
			return null;

		return mxmodelreflection.proxies.AssociationOwner.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AssociationOwner
	 * @param associationowner
	 */
	public final void setAssociationOwner(mxmodelreflection.proxies.AssociationOwner associationowner)
	{
		setAssociationOwner(getContext(), associationowner);
	}

	/**
	 * Set value of AssociationOwner
	 * @param context
	 * @param associationowner
	 */
	public final void setAssociationOwner(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.AssociationOwner associationowner)
	{
		if (associationowner != null)
			getMendixObject().setValue(context, MemberNames.AssociationOwner.toString(), associationowner.toString());
		else
			getMendixObject().setValue(context, MemberNames.AssociationOwner.toString(), null);
	}

	/**
	 * @return value of ParentEntity
	 */
	public final java.lang.String getParentEntity()
	{
		return getParentEntity(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentEntity
	 */
	public final java.lang.String getParentEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ParentEntity.toString());
	}

	/**
	 * Set value of ParentEntity
	 * @param parententity
	 */
	public final void setParentEntity(java.lang.String parententity)
	{
		setParentEntity(getContext(), parententity);
	}

	/**
	 * Set value of ParentEntity
	 * @param context
	 * @param parententity
	 */
	public final void setParentEntity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String parententity)
	{
		getMendixObject().setValue(context, MemberNames.ParentEntity.toString(), parententity);
	}

	/**
	 * @return value of MxObjectReference_MxObjectType
	 */
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectReference_MxObjectType() throws com.mendix.core.CoreException
	{
		return getMxObjectReference_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectReference_MxObjectType
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectReference_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectType> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectType>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.MxObjectReference_MxObjectType.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.MxObjectType.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of MxObjectReference_MxObjectType
	 * @param mxobjectreference_mxobjecttype
	 */
	public final void setMxObjectReference_MxObjectType(java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjectreference_mxobjecttype)
	{
		setMxObjectReference_MxObjectType(getContext(), mxobjectreference_mxobjecttype);
	}

	/**
	 * Set value of MxObjectReference_MxObjectType
	 * @param context
	 * @param mxobjectreference_mxobjecttype
	 */
	public final void setMxObjectReference_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjectreference_mxobjecttype)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (mxmodelreflection.proxies.MxObjectType proxyObject : mxobjectreference_mxobjecttype)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.MxObjectReference_MxObjectType.toString(), identifiers);
	}

	/**
	 * @return value of MxObjectReference_MxObjectType_Child
	 */
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectReference_MxObjectType_Child() throws com.mendix.core.CoreException
	{
		return getMxObjectReference_MxObjectType_Child(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectReference_MxObjectType_Child
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectReference_MxObjectType_Child(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectType> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectType>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.MxObjectReference_MxObjectType_Child.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.MxObjectType.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of MxObjectReference_MxObjectType_Child
	 * @param mxobjectreference_mxobjecttype_child
	 */
	public final void setMxObjectReference_MxObjectType_Child(java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjectreference_mxobjecttype_child)
	{
		setMxObjectReference_MxObjectType_Child(getContext(), mxobjectreference_mxobjecttype_child);
	}

	/**
	 * Set value of MxObjectReference_MxObjectType_Child
	 * @param context
	 * @param mxobjectreference_mxobjecttype_child
	 */
	public final void setMxObjectReference_MxObjectType_Child(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjectreference_mxobjecttype_child)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (mxmodelreflection.proxies.MxObjectType proxyObject : mxobjectreference_mxobjecttype_child)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.MxObjectReference_MxObjectType_Child.toString(), identifiers);
	}

	/**
	 * @return value of MxObjectReference_MxObjectType_Parent
	 */
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectReference_MxObjectType_Parent() throws com.mendix.core.CoreException
	{
		return getMxObjectReference_MxObjectType_Parent(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectReference_MxObjectType_Parent
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectReference_MxObjectType_Parent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectType> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectType>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.MxObjectReference_MxObjectType_Parent.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.MxObjectType.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of MxObjectReference_MxObjectType_Parent
	 * @param mxobjectreference_mxobjecttype_parent
	 */
	public final void setMxObjectReference_MxObjectType_Parent(java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjectreference_mxobjecttype_parent)
	{
		setMxObjectReference_MxObjectType_Parent(getContext(), mxobjectreference_mxobjecttype_parent);
	}

	/**
	 * Set value of MxObjectReference_MxObjectType_Parent
	 * @param context
	 * @param mxobjectreference_mxobjecttype_parent
	 */
	public final void setMxObjectReference_MxObjectType_Parent(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjectreference_mxobjecttype_parent)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (mxmodelreflection.proxies.MxObjectType proxyObject : mxobjectreference_mxobjecttype_parent)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.MxObjectReference_MxObjectType_Parent.toString(), identifiers);
	}

	/**
	 * @return value of MxObjectReference_Module
	 */
	public final mxmodelreflection.proxies.Module getMxObjectReference_Module() throws com.mendix.core.CoreException
	{
		return getMxObjectReference_Module(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectReference_Module
	 */
	public final mxmodelreflection.proxies.Module getMxObjectReference_Module(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.Module result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxObjectReference_Module.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.Module.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxObjectReference_Module
	 * @param mxobjectreference_module
	 */
	public final void setMxObjectReference_Module(mxmodelreflection.proxies.Module mxobjectreference_module)
	{
		setMxObjectReference_Module(getContext(), mxobjectreference_module);
	}

	/**
	 * Set value of MxObjectReference_Module
	 * @param context
	 * @param mxobjectreference_module
	 */
	public final void setMxObjectReference_Module(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.Module mxobjectreference_module)
	{
		if (mxobjectreference_module == null)
			getMendixObject().setValue(context, MemberNames.MxObjectReference_Module.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxObjectReference_Module.toString(), mxobjectreference_module.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxObjectReferenceMendixObject;
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
			final mxmodelreflection.proxies.MxObjectReference that = (mxmodelreflection.proxies.MxObjectReference) obj;
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
		return "MxModelReflection.MxObjectReference";
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
