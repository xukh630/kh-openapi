package com.kh.openapi.model;

import java.io.Serializable;

public class LpWitnessBankNoTemp implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lp_witness_bank_no_temp.bank_no
     *
     * @mbggenerated
     */
    private String bankNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lp_witness_bank_no_temp.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lp_witness_bank_no_temp.bankcls_code
     *
     * @mbggenerated
     */
    private String bankclsCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lp_witness_bank_no_temp.city_code
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lp_witness_bank_no_temp.bank_name
     *
     * @mbggenerated
     */
    private String bankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lp_witness_bank_no_temp
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lp_witness_bank_no_temp.bank_no
     *
     * @return the value of lp_witness_bank_no_temp.bank_no
     *
     * @mbggenerated
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lp_witness_bank_no_temp.bank_no
     *
     * @param bankNo the value for lp_witness_bank_no_temp.bank_no
     *
     * @mbggenerated
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lp_witness_bank_no_temp.status
     *
     * @return the value of lp_witness_bank_no_temp.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lp_witness_bank_no_temp.status
     *
     * @param status the value for lp_witness_bank_no_temp.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lp_witness_bank_no_temp.bankcls_code
     *
     * @return the value of lp_witness_bank_no_temp.bankcls_code
     *
     * @mbggenerated
     */
    public String getBankclsCode() {
        return bankclsCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lp_witness_bank_no_temp.bankcls_code
     *
     * @param bankclsCode the value for lp_witness_bank_no_temp.bankcls_code
     *
     * @mbggenerated
     */
    public void setBankclsCode(String bankclsCode) {
        this.bankclsCode = bankclsCode == null ? null : bankclsCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lp_witness_bank_no_temp.city_code
     *
     * @return the value of lp_witness_bank_no_temp.city_code
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lp_witness_bank_no_temp.city_code
     *
     * @param cityCode the value for lp_witness_bank_no_temp.city_code
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lp_witness_bank_no_temp.bank_name
     *
     * @return the value of lp_witness_bank_no_temp.bank_name
     *
     * @mbggenerated
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lp_witness_bank_no_temp.bank_name
     *
     * @param bankName the value for lp_witness_bank_no_temp.bank_name
     *
     * @mbggenerated
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_witness_bank_no_temp
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bankNo=").append(bankNo);
        sb.append(", status=").append(status);
        sb.append(", bankclsCode=").append(bankclsCode);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_witness_bank_no_temp
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LpWitnessBankNoTemp other = (LpWitnessBankNoTemp) that;
        return (this.getBankNo() == null ? other.getBankNo() == null : this.getBankNo().equals(other.getBankNo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBankclsCode() == null ? other.getBankclsCode() == null : this.getBankclsCode().equals(other.getBankclsCode()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lp_witness_bank_no_temp
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBankNo() == null) ? 0 : getBankNo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBankclsCode() == null) ? 0 : getBankclsCode().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        return result;
    }
}