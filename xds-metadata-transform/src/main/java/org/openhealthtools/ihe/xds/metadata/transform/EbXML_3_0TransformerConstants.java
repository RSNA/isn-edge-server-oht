package org.openhealthtools.ihe.xds.metadata.transform;

import org.openhealthtools.ihe.xds.metadata.AvailabilityStatusType;
import org.openhealthtools.ihe.xds.metadata.ParentDocumentRelationshipType;
import org.openhealthtools.ihe.xds.metadata.constants.UUIDs;

/**
 * Constants to aid in the metadta extraction from ebXML 3.0 elements.
 * @author <a href="mailto:seknoop@us.ibm.com">Sarah Knoop</a>
 *
 */
public interface EbXML_3_0TransformerConstants {

	/**
	 * IHE specified 'APPROVED' status for EbXML 3.0 metadata
	 */
	public static final String APPROVED_STATUS = "urn:oasis:names:tc:ebxml-regrep:StatusType:" + AvailabilityStatusType.APPROVED_LITERAL.getName();
	/**
	 * IHE specified 'DEPRECATED' status for EbXML 3.0 metadata
	 */
	public static final String DEPRECATED_STATUS =  "urn:oasis:names:tc:ebxml-regrep:StatusType:" + AvailabilityStatusType.DEPRECATED_LITERAL.getName();
	/**
	 * IHE specified 'SUBMITTED' status for EbXML 3.0 metadata
	 */
	public static final String SUBMITTED_STATUS = "urn:oasis:names:tc:ebxml-regrep:StatusType:" + AvailabilityStatusType.SUBMITTED_LITERAL.getName();
	/**
	 * IHE specified 'WITHDRAWN' status for EbXML 3.0 metadata
	 */
	public static final String WITHDRAWN_STATUS  = "urn:oasis:names:tc:ebxml-regrep:StatusType:" + AvailabilityStatusType.WITHDRAWN_LITERAL.getName();

	/**
	 *  IHE specified prefix for Association types from OASIS
	 */
	public static final String OASIS_ASSOCIATION_TYPE_PREFIX = "urn:oasis:names:tc:ebxml-regrep:AssociationType:";
	
	/**
	 *  IHE specified prefix for Association types from IHE (IHE 2008 CP 301)
	 */

	public static final String IHE_ASSOCIATION_TYPE_PREFIX = "urn:ihe:iti:2007:AssociationType:";
	
	/**
	 * IHE specified 'APND' association for EbXML 3.0 metadata
	 */
	public static final String APND = IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.APND_LITERAL.getName();
	
	/**
	 * IHE specified 'RPLC' association for EbXML 3.0 metadata
	 */
	public static final String RPLC = IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.RPLC_LITERAL.getName();
	
	/**
	 * IHE specified 'XFRM' association for EbXML 3.0 metadata
	 */
	public static final String XFRM = IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.XFRM_LITERAL.getName();
	
	/**
	 * IHE specified 'XFRM_RPLC' association for EbXML 3.0 metadata
	 */
	public static final String XFRM_RPLC = IHE_ASSOCIATION_TYPE_PREFIX + ParentDocumentRelationshipType.XFRMRPLC_LITERAL.getName();
	
	/**
	 * IHE specified 'HasMember' association for EbXML 3.0 metadata
	 */
	public static final String HAS_MEMBER = OASIS_ASSOCIATION_TYPE_PREFIX + UUIDs.HAS_MEMBER;
}
