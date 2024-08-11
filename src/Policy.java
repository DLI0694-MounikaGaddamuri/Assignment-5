import java.util.*;
public class Policy {
    long premium_amount;
    String holder_name,coverage_type,policy_number;
    Date expiry_date;

    Policy(){}

    Policy(String policy_number,long premium_amount,String holder_name,String coverage_type,Date expiry_date){
        this.policy_number=policy_number;
        this.premium_amount=premium_amount;
        this.holder_name=holder_name;
        this.coverage_type=coverage_type;
        this.expiry_date=expiry_date;
    }

    public String getCoverage_type() {
        return coverage_type;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public String getPolicy_number() {
        return policy_number;
    }

    public long getPremium_amount() {
        return premium_amount;
    }

    public String toString() {
        return "Policy: " +
                "policyNumber='" + policy_number + '\'' +
                ", policyholderName='" + holder_name + '\'' +
                ", expiryDate=" + expiry_date +
                ", coverageType='" + coverage_type + '\'' +
                ", premiumAmount=" + premium_amount ;
    }
}
