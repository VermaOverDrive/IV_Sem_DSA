package March.m_19;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        OnlineShopping obj=new OnlineShopping();
        Set<SmartPhones> totalSmartPhones=obj.totalNoOfPhones();
        List<SmartPhones> withInSize= obj.getListOfSmartPhones(totalSmartPhones,(byte)5);
        System.out.println("Total smartphones");
        for (SmartPhones smartPhones : withInSize) {
            System.out.println(smartPhones);
        }
        List<SmartPhones> budgetSmartPhones=obj.budgetSmartPhones(totalSmartPhones);
        System.out.println("*******************");
        System.out.println("Budget smart Phones");
        for(SmartPhones current:budgetSmartPhones){
            System.out.println(current);
        }
    }
}