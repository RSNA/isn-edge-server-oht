/*******************************************************************************
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.openhealthtools.ihe.common.ws.modules;

import java.util.HashMap;
import java.util.Map;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPHeader;
import org.apache.axiom.soap.SOAPHeaderBlock;

/**
 * OHF Web service handler method to provide WS-Addressing support to outgoing
 * messages inline with IHE Web service Appendix V.
 * 
 * @see <a href="http://www.ihe.net/Technical_Framework/upload/IHE_ITI_TF_Supplement_Appendix_V_TI_2007_08_15.pdf">
 * 			IHE Appendix V Trial Implementation</a>
 * @author <a href="mailto:mattadav@us.ibm.com">Matthew Davis</a>
 *
 */
public class WSAddressing 
{
	/**
	 * Name of the Action element
	 */
	public static final String WSA_ACTION_KEY = "Action";
	
	/**
	 * Name of the Message Id element
	 */
	public static final String WSA_MESSAGE_ID_KEY = "MessageID";
	
	/**
	 * Name of the WS-A ReplyTo element
	 */
	public static final String WSA_REPLY_TO_KEY = "ReplyTo";
	
	/**
	 * Name of the WS-A To element
	 */
	public static final String WSA_TO_KEY = "To";
	
	/**
	 * Value of the URL for WS-A anonymous address
	 */
	public static final String WSA_ADDRESS_ANONYMOUS = "http://www.w3.org/2005/08/addressing/anonymous";
	
	/**
	 * URI for the WS-Addressing namespace
	 */
	public static final String WSA_NAMESPACE_URI = "http://www.w3.org/2005/08/addressing";
	
	/**
	 * Prefix for the WS-Addressing Namespace
	 */
	public static final String WSA_NAMESPACE_PREFIX = "wsa";
	
	/**
	 * Set the default WS-Addressing settings to an anonymous reply-to
	 */
	private Map mSettings = new HashMap();
	{
		mSettings.put(WSA_REPLY_TO_KEY, WSA_ADDRESS_ANONYMOUS);
	}
	
	/**
	 * Default constructor
	 */
	public WSAddressing()
	{
		
	}
	
	/**
	 * Constructor that accepts a set of pre-set options.
	 * @param settings	Settings to use
	 */
	public WSAddressing(Map settings)
	{
		if (null != settings) {
			mSettings = settings;
		}
	}
	
	/**
	 * Constructor for messages with a specific SOAP Action and Destination
	 * @param action		SOAP Action for the message
	 * @param destination	Destination URL for the message
	 */
	public WSAddressing(String action, String destination)
	{
		this(action,destination,null,null);
	}
	
	/**
	 * Constructor	for messages with a specific Message Id
	 * @param action		SOAP Action for the message
	 * @param destination	Destination URL for the message
	 * @param messageId		Message ID for the message
	 */
	public WSAddressing(String action, String destination, String messageId)
	{
		this(action,destination,messageId,null);
	}
	
	/**
	 * Constructor for messages with a specific action, destination URL, reply to URL, and Message ID.
	 * @param action		SOAP Action for the message
	 * @param destination	Destination URL for the message
	 * @param messageId		Message ID for the message
	 * @param replyTo		ReplyTo URL for the message (if not anonymous)
	 */
	public WSAddressing(String action, String destination, String messageId, String replyTo)
	{
		if (action != null) {
			mSettings.put(WSA_ACTION_KEY, action);
		}
		
		if (destination != null) {
			mSettings.put(WSA_TO_KEY, destination);
		}
		
		if (messageId != null) {
			mSettings.put(WSA_MESSAGE_ID_KEY, messageId);
		} else {
			mSettings.put(WSA_MESSAGE_ID_KEY, org.apache.axiom.om.util.UUIDGenerator.getUUID());
		}
		
		if (replyTo != null) {
			mSettings.put(WSA_REPLY_TO_KEY, replyTo);
		}		
	}
	
	/**
	 * Process an outgoing SOAP Envelope.  This adds the WS-Addressing elements needed
	 * for an IHE transaction to the SOAP Header in line with the settings specified.
	 * 
	 * @param message	The well-formed SOAP Envelope to process
	 */
	public void processOutgoing(SOAPEnvelope message)
	{
		if (null == message) {
			return;
		}
		
		SOAPHeader messageHeader = message.getHeader();
		OMNamespace wsaNamespace = messageHeader.declareNamespace(WSA_NAMESPACE_URI, WSA_NAMESPACE_PREFIX);
		
		// Set the <wsa:Action> block
		SOAPHeaderBlock wsaActionBlock = messageHeader.addHeaderBlock(WSA_ACTION_KEY, wsaNamespace);
		wsaActionBlock.setMustUnderstand("1");
		wsaActionBlock.setText((String)mSettings.get(WSA_ACTION_KEY));
		
		// Set the <wsa:To> block
		SOAPHeaderBlock wsaToBlock = messageHeader.addHeaderBlock(WSA_TO_KEY, wsaNamespace);
		wsaToBlock.setMustUnderstand("1");
		wsaToBlock.setText((String)mSettings.get(WSA_TO_KEY));
		
		// Set the <wsa:MessageId> block
		SOAPHeaderBlock wsaMessageIdBlock = messageHeader.addHeaderBlock(WSA_MESSAGE_ID_KEY, wsaNamespace);
		wsaMessageIdBlock.setText((String)mSettings.get(WSA_MESSAGE_ID_KEY));
		
		// Set the <wsa:ReplyTo><wsa:Address></></> block
		SOAPHeaderBlock wsaReplyToBlock = messageHeader.addHeaderBlock(WSA_REPLY_TO_KEY, wsaNamespace);
		
		OMElement wsaReplyToAddress = wsaReplyToBlock.getOMFactory().createOMElement("Address", wsaNamespace);
		wsaReplyToAddress.setText((String)mSettings.get(WSA_REPLY_TO_KEY));
		
		wsaReplyToBlock.addChild(wsaReplyToAddress);
	}
	
	/**
	 * Process an incoming SOAP Envelope.  This does any work needed to modify and read
	 * incoming headers.
	 * 
	 * @param message	The well-formed SOAP Envelope to process
	 */
	public void processIncoming(SOAPEnvelope message)
	{
		// Nothing to do for incoming WS-Addressing message right now.
		// This likely changes when async XDS.b is added.
	}
}
