package com.triveous.promocode;

import com.triveous.promocode.model.Code;

/**
 * Created by sohammondal on 23/09/14.
 */
public interface OnPromocodeChecked {
    public void onPromocodeSuccess(Code code);
    public void onPromocodeFailure(String error);
}
