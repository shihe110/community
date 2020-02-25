package life.majiang.community.advice;

import life.majiang.community.exception.CustomizeErrorCode;
import life.majiang.community.exception.CustomizeException;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName CustomizeExceptionHandler
 * @Description TODO
 * @Author admin
 * @Date 2020-01-06 14:42
 * @Version 1.0
 */
@ControllerAdvice
public class CustomizeExceptionHandler {

        @ExceptionHandler(Exception.class)
        ModelAndView handle(HttpServletRequest request, Throwable e, Model model) {
            HttpStatus status = getStatus(request);
            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
            } else {
                model.addAttribute("message", e.getMessage());
            }
            return new ModelAndView("error");
        }

        private HttpStatus getStatus(HttpServletRequest request) {
            Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
            if (statusCode == null) {
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
            return HttpStatus.valueOf(statusCode);
        }
}
