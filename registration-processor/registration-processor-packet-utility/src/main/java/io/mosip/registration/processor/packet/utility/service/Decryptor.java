package io.mosip.registration.processor.packet.utility.service;

import java.io.InputStream;

import io.mosip.registration.processor.core.exception.ApisResourceAccessException;
import io.mosip.registration.processor.core.exception.PacketDecryptionFailureException;

/**
 * The Interface Decryptor.
 * 
 * @author Sowmya
 */
public interface Decryptor {

	/**
	 * This Method provide the functionality to decrypt packet.
	 *
	 * @param input          encrypted packet to be decrypted
	 * @param registrationId the registration id
	 * @return decrypted packet
	 * @throws PacketDecryptionFailureException if error occured while decrypting
	 * @throws ApisResourceAccessException      if error occured while
	 */
	public InputStream decrypt(InputStream input, String registrationId)
			throws PacketDecryptionFailureException, ApisResourceAccessException;

}