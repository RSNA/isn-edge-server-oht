package org.openhealthtools.ihe.xds.metadata.transform;

import java.util.Random;

final class EbXML_3_0TransformerUtils {

	private static final Random rngr = new Random();

	public static final String getRandomId(String prefix, int iteration)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(prefix);
		sb.append(System.currentTimeMillis());
		sb.append(rngr.nextLong());
		sb.append(iteration);
		return sb.toString();
	}
}
