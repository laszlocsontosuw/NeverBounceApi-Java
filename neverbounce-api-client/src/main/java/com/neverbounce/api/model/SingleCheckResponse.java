package com.neverbounce.api.model;

import com.google.api.client.util.Key;

import java.util.Set;

/**
 * https://developers.neverbounce.com/v4.0/reference#single-check
 *
 * @author Laszlo Csontos
 * @since 4.0.0
 */
public class SingleCheckResponse extends GenericResponse {

    @Key
    private Result result;

    @Key
    private Set<Flag> flags;

    @Key("suggested_correction")
    private String suggestedCorrection;

    @Key("retry_token")
    private String retryToken;

    @Key("address_info")
    private AddressInfo addressInfo;

    @Key("credits_info")
    private CreditsInfo creditsInfo;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Set<Flag> getFlags() {
        return flags;
    }

    public void setFlags(Set<Flag> flags) {
        this.flags = flags;
    }

    public String getSuggestedCorrection() {
        return suggestedCorrection;
    }

    public void setSuggestedCorrection(String suggestedCorrection) {
        this.suggestedCorrection = suggestedCorrection;
    }

    public String getRetryToken() {
        return retryToken;
    }

    public void setRetryToken(String retryToken) {
        this.retryToken = retryToken;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public CreditsInfo getCreditsInfo() {
        return creditsInfo;
    }

    public void setCreditsInfo(CreditsInfo creditsInfo) {
        this.creditsInfo = creditsInfo;
    }

    public static class AddressInfo {

        @Key("original_email")
        private String originalEmail;

        @Key("normalized_email")
        private String normalizedEmail;

        @Key
        private String addr;

        @Key
        private String alias;

        @Key
        private String host;

        @Key
        private String fqdn;

        @Key
        private String subdomain;

        @Key
        private String tld;

        public String getOriginalEmail() {
            return originalEmail;
        }

        public void setOriginalEmail(String originalEmail) {
            this.originalEmail = originalEmail;
        }

        public String getNormalizedEmail() {
            return normalizedEmail;
        }

        public void setNormalizedEmail(String normalizedEmail) {
            this.normalizedEmail = normalizedEmail;
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getFqdn() {
            return fqdn;
        }

        public void setFqdn(String fqdn) {
            this.fqdn = fqdn;
        }

        public String getSubdomain() {
            return subdomain;
        }

        public void setSubdomain(String subdomain) {
            this.subdomain = subdomain;
        }

        public String getTld() {
            return tld;
        }

        public void setTld(String tld) {
            this.tld = tld;
        }

    }

    public static class CreditsInfo {

        @Key("paid_credits_used")
        private int paidCreditsUsed;

        @Key("free_credits_used")
        private int freeCreditsUsed;

        @Key("paid_credits_remaining")
        private int paidCreditsRemaining;

        @Key("free_credits_remaining")
        private int freeCreditsRemaining;

        @Key("monthly_api_usage")
        private int monthlyApiUsage;

        public int getPaidCreditsUsed() {
            return paidCreditsUsed;
        }

        public void setPaidCreditsUsed(int paidCreditsUsed) {
            this.paidCreditsUsed = paidCreditsUsed;
        }

        public int getFreeCreditsUsed() {
            return freeCreditsUsed;
        }

        public void setFreeCreditsUsed(int freeCreditsUsed) {
            this.freeCreditsUsed = freeCreditsUsed;
        }

        public int getPaidCreditsRemaining() {
            return paidCreditsRemaining;
        }

        public void setPaidCreditsRemaining(int paidCreditsRemaining) {
            this.paidCreditsRemaining = paidCreditsRemaining;
        }

        public int getFreeCreditsRemaining() {
            return freeCreditsRemaining;
        }

        public void setFreeCreditsRemaining(int freeCreditsRemaining) {
            this.freeCreditsRemaining = freeCreditsRemaining;
        }

        public int getMonthlyApiUsage() {
            return monthlyApiUsage;
        }

        public void setMonthlyApiUsage(int monthlyApiUsage) {
            this.monthlyApiUsage = monthlyApiUsage;
        }

    }

}
