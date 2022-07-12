package in.com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = { ArithmeticException.class })
	public ResponseEntity<ApiError> handleArithmeticException(ArithmeticException ae) {
		String exceptionMsg = ae.getMessage();
		String exceptionCode = "Exp101";
		ApiError apiError = new ApiError();
		apiError.setMessage(exceptionMsg);
		apiError.setCode(exceptionCode);
		return new ResponseEntity<ApiError>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = { NoUserFoundException.class })
	public ResponseEntity<ApiError> handleNoUserFoundException(NoUserFoundException ae) {
		String exceptionMsg = ae.getMessage();
		String exceptionCode = "Exp102";
		ApiError apiError = new ApiError();
		apiError.setMessage(exceptionMsg);
		apiError.setCode(exceptionCode);
		return new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);
	}
}
