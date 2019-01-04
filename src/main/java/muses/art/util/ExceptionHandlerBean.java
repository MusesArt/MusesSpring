package muses.art.util;

import muses.art.model.base.StatusModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
class GlobalDefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public @ResponseBody StatusModel defaultErrorHandler() {
        return new StatusModel("出现异常，请联系管理员");
    }
}


