package in.com.app.exception;

import lombok.Data;

@Data
public class ApiError {

	private String message;
	private String code;

}
