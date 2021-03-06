package io.mosip.registration.dto;

import java.util.List;

/**
 * The DTO Class ResponseDTO.
 * 
 * @author Sreekar Chukka
 * @version 1.0.0
 */
public class ResponseDTO {
	private List<ErrorResponseDTO> errorResponseDTOs;
	private SuccessResponseDTO successResponseDTO;
	public List<ErrorResponseDTO> getErrorResponseDTOs() {
		return errorResponseDTOs;
	}
	public void setErrorResponseDTOs(List<ErrorResponseDTO> errorResponseDTOs) {
		this.errorResponseDTOs = errorResponseDTOs;
	}
	public SuccessResponseDTO getSuccessResponseDTO() {
		return successResponseDTO;
	}
	public void setSuccessResponseDTO(SuccessResponseDTO successResponseDTO) {
		this.successResponseDTO = successResponseDTO;
	}
	
	@Override
	public String toString() {
		if(this.errorResponseDTOs != null && !this.errorResponseDTOs.isEmpty()) {
			return this.errorResponseDTOs.get(0).getCode() + ":" + this.errorResponseDTOs.get(0).getMessage();
		}
		
		if(this.successResponseDTO != null)
			return this.successResponseDTO.getCode() + ":" + this.successResponseDTO.getMessage();
		
		return super.toString();
	}
	
}
