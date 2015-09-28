package scarmy.za.ac.cput.ScArmyBuilder.services.Impl;

import scarmy.za.ac.cput.ScArmyBuilder.repositories.RestCreateArmy;
import scarmy.za.ac.cput.ScArmyBuilder.repositories.rest.RestArmyAPI;
import scarmy.za.ac.cput.ScArmyBuilder.services.ArmyUnitsService;

/**
 * Created by Xeno on 2015/09/27.
 */
public class ArmyServiceImpl implements ArmyUnitsService {
    final RestCreateArmy<scarmy.za.ac.cput.ScArmyBuilder.model.ArmyService> rest = new RestArmyAPI();

    public String createT(scarmy.za.ac.cput.ScArmyBuilder.model.ArmyService entity){
        return rest.postT(entity);
    }
    public String createP(scarmy.za.ac.cput.ScArmyBuilder.model.ArmyService entity){
        return rest.postP(entity);
    }
    public String createZ(scarmy.za.ac.cput.ScArmyBuilder.model.ArmyService entity){
        return rest.postZ(entity);
    }
}
