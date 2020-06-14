# global-excpetion-handler-spring-boot
Global Exception Handler in Spring Boot


Create a controller advice in your project as follows to Globally Handle Exceptions and return your own custom error object

@ControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {CustomException.class})
    protected ResponseEntity<Object> handleInvalidDataException(
            RuntimeException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
