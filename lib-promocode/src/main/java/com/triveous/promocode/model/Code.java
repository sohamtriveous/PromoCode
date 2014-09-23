
package com.triveous.promocode.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Code {

    @SerializedName("coupon-code")
    @Expose
    private String couponCode;
    @Expose
    private String version;
    @SerializedName("coupon-validity-from")
    @Expose
    private String couponValidityFrom;
    @SerializedName("coupon-validity-to")
    @Expose
    private String couponValidityTo;
    @SerializedName("features-list")
    @Expose
    private FeaturesList featuresList;
    @SerializedName("subscription-validity")
    @Expose
    private String subscriptionValidity;

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCouponValidityFrom() {
        return couponValidityFrom;
    }

    public void setCouponValidityFrom(String couponValidityFrom) {
        this.couponValidityFrom = couponValidityFrom;
    }

    public String getCouponValidityTo() {
        return couponValidityTo;
    }

    public void setCouponValidityTo(String couponValidityTo) {
        this.couponValidityTo = couponValidityTo;
    }

    public FeaturesList getFeaturesList() {
        return featuresList;
    }

    public void setFeaturesList(FeaturesList featuresList) {
        this.featuresList = featuresList;
    }

    public String getSubscriptionValidity() {
        return subscriptionValidity;
    }

    public void setSubscriptionValidity(String subscriptionValidity) {
        this.subscriptionValidity = subscriptionValidity;
    }

}
