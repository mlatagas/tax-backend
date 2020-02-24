package com.mycompany.mycompanyTax.util;

import com.mycompany.mycompanyTax.model.TaxReq;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;

@Component
public class TaxUtil {

    public double getPayeAfterTaxCredit(TaxReq taxReq){
        return ((((taxReq.getTaxableEarnings() - getRateOfTaxAbove(taxReq.getTaxableEarnings())) * getRateOfTaxPerc(taxReq.getTaxableEarnings())) + getRateOfTaxAmount(taxReq.getTaxableEarnings())) - getTaxRebates(taxReq.getAge())) / 12;
    }

    public double getPayeBeforTaxCredit(TaxReq taxReq){
        return  (((taxReq.getTaxableEarnings() - 293600) * 0.31) + 61296) / 12;
    }

   public double getNetCash(TaxReq taxReq){
        return (taxReq.getTaxableEarnings() / 12) - getPayeAfterTaxCredit(taxReq);
    }

    public double getTaxCredit(int medicalAidMembers){
        if(medicalAidMembers == 1){
            return 286;
        }
        else if(medicalAidMembers == 2){
            return 572;
        }
        else{
            return 572 + ((medicalAidMembers - 2) * 192 );
        }
    }

    public double getRateOfTaxPerc(double tax){
        if(tax > 0 && tax < 188000){
            return 0.18;
        } if(tax > 188000 && tax < 293600){
            return 0.26;
        } if(tax > 293600 && tax < 406400){
            return 0.31;
        } if(tax > 406400 && tax < 550100){
            return 0.36;
        } if(tax > 550100 && tax < 701300){
            return 0.39;
        } else{
            return 0.41;
        }
    }

   public double getTaxRebates(int age){
        if(age < 65){
            return 13500;
        }
        else if( age > 64 && age < 75){
            return 20907;
        }
        else {
            return 22466;
        }
   }

   public double getRateOfTaxAmount(double tax){
       if(tax > 0 && tax < 188000){
           return 0;
       } if(tax > 188000 && tax < 293600){
           return 33840;
       } if(tax > 293600 && tax < 406400){
           return 61296;
       } if(tax > 406400 && tax < 550100){
           return 96264;
       } if(tax > 550100 && tax < 701300){
           return 147996;
       } else{
           return 206964;
       }
   }
   public double getRateOfTaxAbove(double tax){
       if(tax > 0 && tax < 188000){
           return 0;
       } if(tax > 188000 && tax < 293600){
           return 188000;
       } if(tax > 293600 && tax < 406400){
           return 293600;
       } if(tax > 406400 && tax < 550100){
           return 406400;
       } if(tax > 550100 && tax < 701300){
           return 550100;
       } else{
           return 701300;
       }
   }

    public double verifyTaxThreshold(double tax, int age){
        if(age < 65){
            return tax < 75000 ? tax : 75000;
        }
        else if( age > 64 && age <= 75){
            return tax < 116150 ? tax : 116150;
        }
        else {
            return tax < 129850 ? tax : 129850;
        }
    }
}
