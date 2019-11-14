#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.res;

import lombok.Data;

@Data
public class Result<T> {
    private boolean success;
    private String code;
    private T data;
    private String msg;

    public static <T> Result<T> wrapSuccessResult(T data) {
        final Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }
}
