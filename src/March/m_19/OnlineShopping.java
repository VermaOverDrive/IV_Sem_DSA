package March.m_19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OnlineShopping {
    Set<SmartPhones> total=new HashSet<>();
    List<SmartPhones> budget=new ArrayList<>();

    public List<SmartPhones> getListOfSmartPhones(Set<SmartPhones> smartPhones, byte requiredSize){
        List<SmartPhones> list = new ArrayList<>();
        for (SmartPhones current : smartPhones) {
            if (current.getScreenSize() >= requiredSize) {
                list.add(current);
            } else {
                int price = (int) (current.getPrice() - 0.1 * current.getPrice());
                current.setPrice(price);
            }
        }
        return list;
    }

    public Set<SmartPhones> totalNoOfPhones(){
        for (int i = 0; i <5 ; i++) {
            total.add(new SmartPhones(100000010+i,
                    "Smartphone"+i,
                    (int)(Math.random()*20000)+2, (byte) ((int) (Math.random() * 7))));
        }
        total.add(new SmartPhones(100000017,"Smartphone7",10000,(byte)6));
        return total;
    }

    public List<SmartPhones>  budgetSmartPhones(Set<SmartPhones> smartPhones){
        for(SmartPhones current:smartPhones){
            if(current.getPrice()<=10000){
                budget.add(current);
            }
        }
        return budget;
    }


}